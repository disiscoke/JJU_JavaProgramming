public class exam10 {
    public static void main(String[] args) {

        double sum = 0;
        
        System.out.println("argv length: " + args.length);

        for (String _arg : args) {
            System.out.println(_arg);

            double value = Double.parseDouble(_arg);

            sum += value;
        }

        System.out.println("Sum: " + sum);
    }
}
