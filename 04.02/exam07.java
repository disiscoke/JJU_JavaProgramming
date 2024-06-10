public class exam07 {
    public static void main(String[] args) {

        int[] nums = { 3, 7, 4, 9, 5, 12, 8, 2 };

        int nMAX = -999;

        int nSum = 0;

        for (int i = 0; i < nums.length; i++) {
            int _num = nums[i];

            if (nMAX < _num) {
                nMAX = _num;
            }
            System.out.println(" " + _num);
            nSum += nums[i];
        }
        System.out.println("sum: " + nSum);
        System.out.println("average: " + nSum / nums.length);
        System.out.println("최대값: " + nMAX);
    }
}
