public class MaxMinArray {
    public static void main(String[] args) {
        int[] arr = {23, 45, 12, 67, 34, 89, 21};
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
