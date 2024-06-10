import java.util.Scanner;

public class exam04 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(">>");
            String text = scanner.nextLine();
            if (text.equals("help")) {
                System.out.println("종료하려면 exit.");
            }
            else if (text.equals("exit")) {
                break;
            }
            else if (text.equals("exit2")) {
                bExit = true;
                break;
            }
            else {
                System.out.println("명령어를 확인해주세요.");
            }
        }
        if (bExit) break;
    }
}