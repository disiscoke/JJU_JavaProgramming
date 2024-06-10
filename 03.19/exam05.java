public class exam05 {
    public static void main(String[] args) {
        
        int a = 3;
        int b = 7;
        System.out.println((a < b));
        System.out.println((a > b));

        int nAge = 27;

        System.out.println( "20대가 맞나요? " + ((nAge > 20) && (nAge < 30)) );

        String strName = "lee";

        System.out.println("이씨가 맞나요? " + (strName == "lee"));
        System.out.println("김씨가 맞나요? " + (strName == "kim"));

        String strResult = a > b ? "a is big" : "b is big";
        System.out.println(strResult);

    }
}
