public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 99, 78};
        int max = arr[0];

        for (int i : arr) {
            if (i > max) max = i;
        }

        System.out.println("Maximum = " + max);
    }
}
