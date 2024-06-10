package exam02;



public class app {
    public static void main(String[] args) {
        Point p = new Point(3,4);

        System.out.println(p.getClass().getName());
        System.out.println(p.hashCode());
        System.out.println(p.toString());
        System.out.println(p);
    }
}