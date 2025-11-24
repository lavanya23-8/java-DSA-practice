public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {12, 45, 3, 89, 22};
        int max = arr[0];

        for (int i : arr)
            if (i > max)
                max = i;

        System.out.println("Maximum = " + max);
    }
}
