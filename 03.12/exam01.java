public class exam01 {

    public static void main(String[] args) {
        //int num1;
        //int _1num;
        //int num_1;
        //int Num1;
        //int _$$$$;
        //int _****;
        //int _public //이미 있는 키워드 비추천
        //int _숫자; //한글 사용 가능하지만 용량, 보편화 문제로 비추천

        int a,b,c;
        a = 1;
        b = 2;

        System.out.println("a :" + a);
        System.out.println("b :" + b);

        a = 3;

        System.out.println("a :" + a);
        System.out.println("b :" + b);

        c = b;
        b = a;
        a = c;
        System.out.println("a :" + a);
        System.out.println("b :" + b);
    }
}