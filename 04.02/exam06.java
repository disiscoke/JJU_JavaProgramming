public class exam06 {
    public static void main(String[] args) {

        int[] array1 = {1,2,3,4,5};
        int[] refValue;

        refValue = array1;

        System.out.println(array1[0]);//1st element
        System.out.println(array1[array1.length-1]);//last element

        refValue[2] = 9;
        System.out.println(array1[2]);//3rd element

    }
}
