
public class SumAndAverage {
    public static void main(String[] args) {
        int[] nums = {5, 10, 15, 20, 25};
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        double average = (double) sum / nums.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
