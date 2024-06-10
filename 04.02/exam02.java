public class exam02 {

    public static void main(String[] args) {
        for(int i = 0; i < 19; i++){
            int value;
            double radian = Math.toRadians(i*10);
            value = (int)(50 * Math.sin(radian));
    
            for(int j = 0; j < value; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
            }
    }
}