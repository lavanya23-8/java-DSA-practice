public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {5, 10, 20, 15};
        int sum = 0;

        for (int i : arr)
            sum += i;

        System.out.println("Sum = " + sum);
    }
}
