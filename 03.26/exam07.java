public class exam07 {
    public static void main(String[] args) {
        int i;
        int j;
        for (i = 2; i < 10; i++) {
            for (j = 1; j < 10; j++) {
                System.out.print(i + " * " + j + " = " + (i * j) + "\t");
            }
            System.out.println();
            if (i % 3 == 0) {
                System.out.println("--------------------");
            }
        }

    }
}