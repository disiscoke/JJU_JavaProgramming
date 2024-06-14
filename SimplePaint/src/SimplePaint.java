import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

public class SimplePaint extends JFrame {
    private DrawingPanel drawingPanel;

    public SimplePaint() {
        setTitle("Simple Paint");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 700);
        setLocationRelativeTo(null);

        drawingPanel = new DrawingPanel();
        add(drawingPanel, BorderLayout.CENTER);

        JPanel controls = new JPanel();
        add(controls, BorderLayout.NORTH);

        JButton colorButton = new JButton("Color");
        colorButton.addActionListener(e -> {
            Color newColor = JColorChooser.showDialog(SimplePaint.this, "Choose a color", drawingPanel.getForeground());
            if (newColor != null) {
                drawingPanel.setCurrentColor(newColor);
                drawingPanel.setEraserMode(false);
            }
        });
        controls.add(colorButton);

        JButton eraserButton = new JButton("Eraser");
        eraserButton.addActionListener(e -> drawingPanel.setEraserMode(true));
        controls.add(eraserButton);

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(e -> drawingPanel.clear());
        controls.add(clearButton);

        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            if (fileChooser.showSaveDialog(SimplePaint.this) == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                saveToFile(file);
            }
        });
        controls.add(saveButton);

        JButton loadButton = new JButton("Load");
        loadButton.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            if (fileChooser.showOpenDialog(SimplePaint.this) == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                loadFromFile(file);
            }
        });
        controls.add(loadButton);

        String[] shapeOptions = {"Freehand", "Line", "Rectangle", "Oval", "Dot"};
        JComboBox<String> shapeComboBox = new JComboBox<>(shapeOptions);
        shapeComboBox.addActionListener(e -> drawingPanel.setCurrentShapeType((String) shapeComboBox.getSelectedItem()));
        controls.add(shapeComboBox);

        JLabel thicknessLabel = new JLabel("Thickness:");
        controls.add(thicknessLabel);

        JSlider thicknessSlider = new JSlider(1, 10, 1);
        thicknessSlider.setMajorTickSpacing(1);
        thicknessSlider.setPaintTicks(true);
        thicknessSlider.setPaintLabels(true);
        JLabel thicknessValueLabel = new JLabel("1");
        thicknessSlider.addChangeListener(e -> {
            int thickness = thicknessSlider.getValue();
            drawingPanel.setCurrentThickness(thickness);
            thicknessValueLabel.setText(String.valueOf(thickness));
        });
        controls.add(thicknessSlider);
        controls.add(thicknessValueLabel);

        setVisible(true);
    }

    private void saveToFile(File file) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
            out.writeObject(drawingPanel.getShapes());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void loadFromFile(File file) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
            ArrayList<DrawingPanel.Shape> shapes = (ArrayList<DrawingPanel.Shape>) in.readObject();
            drawingPanel.setShapes(shapes);
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SimplePaint::new);
    }
}

class DrawingPanel extends JPanel {
    private ArrayList<Shape> shapes = new ArrayList<>();
    private Shape currentShape = null;
    private Color currentColor = Color.BLACK;
    private boolean eraserMode = false;
    private String currentShapeType = "Freehand";
    private int currentThickness = 1;

    public DrawingPanel() {
        setBackground(Color.WHITE);
        MouseAdapter mouseAdapter = new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (eraserMode) {
                    currentShape = new Shape(e.getPoint(), getBackground(), "Dot", currentThickness);
                } else {
                    currentShape = new Shape(e.getPoint(), currentColor, "Dot", currentThickness);
                }
                shapes.add(currentShape);
                repaint();
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                if (currentShape != null && currentShapeType.equals("Freehand")) {
                    currentShape.addPoint(e.getPoint());
                    repaint();
                } else if (currentShape != null) {
                    currentShape.setEndPoint(e.getPoint());
                    repaint();
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                currentShape = null;
            }
        };

        addMouseListener(mouseAdapter);
        addMouseMotionListener(mouseAdapter);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public void setCurrentColor(Color color) {
        this.currentColor = color;
    }

    public void setEraserMode(boolean eraserMode) {
        this.eraserMode = eraserMode;
    }

    public void clear() {
        shapes.clear();
        repaint();
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
        repaint();
    }

    public void setCurrentShapeType(String shapeType) {
        this.currentShapeType = shapeType;
    }

    public void setCurrentThickness(int thickness) {
        this.currentThickness = thickness;
    }

    public static class Shape implements Serializable {
        private ArrayList<Point> points = new ArrayList<>();
        private Color color;
        private String shapeType;
        private Point startPoint;
        private Point endPoint;
        private int thickness;

        public Shape(Point start, Color color, String shapeType, int thickness) {
            this.points.add(start);
            this.color = color;
            this.shapeType = shapeType;
            this.startPoint = start;
            this.endPoint = start;
            this.thickness = thickness;
        }

        public void addPoint(Point point) {
            points.add(point);
        }

        public void setEndPoint(Point endPoint) {
            this.endPoint = endPoint;
        }

        public void draw(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setStroke(new BasicStroke(thickness));
            g2.setColor(color);

            switch (shapeType) {
                case "Freehand":
                    for (int i = 0; i < points.size() - 1; i++) {
                        Point p1 = points.get(i);
                        Point p2 = points.get(i + 1);
                        g2.drawLine(p1.x, p1.y, p2.x, p2.y);
                    }
                    break;
                case "Line":
                    g2.drawLine(startPoint.x, startPoint.y, endPoint.x, endPoint.y);
                    break;
                case "Rectangle":
                    g2.drawRect(Math.min(startPoint.x, endPoint.x), Math.min(startPoint.y, endPoint.y),
                            Math.abs(startPoint.x - endPoint.x), Math.abs(startPoint.y - endPoint.y));
                    break;
                case "Oval":
                    g2.drawOval(Math.min(startPoint.x, endPoint.x), Math.min(startPoint.y, endPoint.y),
                            Math.abs(startPoint.x - endPoint.x), Math.abs(startPoint.y - endPoint.y));
                    break;
                case "Dot":
                    g2.fillOval(startPoint.x - thickness / 2, startPoint.y - thickness / 2, thickness, thickness);
                    break;
            }
        }
    }
}
