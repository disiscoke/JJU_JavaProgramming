import java.util.Scanner;

public class exam02 {

    public static void main(String[] args) {
        
        Scanner _s = new Scanner(System.in);

        System.out.println("이름을 입력하세요.");
        String name = _s.nextLine();

        System.out.println(name);

        System.out.println("도시는 ?");
        String city = _s.next();

        System.out.println("나이는 ?");
        int age = _s.nextInt();

        System.out.println("키는 ?");
        double height = _s.nextDouble();


        System.out.println("name : " + name + " city : " + city + " age : " + age + " height : " + height);

        _s.close();
    }
}
