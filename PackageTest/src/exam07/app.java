package exam07;

public class app {
    public static void main(String[] args) {

        String strA = " C#  "; // C#
        String strB = " Java  "; // Java

        String strC = strA.concat(strB); // C# Java

        System.out.println(strC); // C# Java

        System.out.println(strA == strC); // false

        System.out.println(strA.trim()); // C#
        System.out.println(strB.replace("va", "++")); // Ja++a

        String strD = new String("apple,banana,mango"); // apple,banana,mango

        String[] strArray = strD.split(","); // apple, banana, mango
        for (String strItem : strArray) {
            System.out.println(strItem);
        }

        System.out.println(strD.substring(0, 5)); // apple
        System.out.println(strD.substring(6,12)); // banana
        System.out.println(strD.charAt(5)); // ,
        System.out.println(strD.charAt(12));    // ,
        

    }
}
