public class MedianSortedArrays {
    public static double findMedian(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length)
            c[k++] = a[i] < b[j] ? a[i++] : b[j++];

        while (i < a.length) c[k++] = a[i++];
        while (j < b.length) c[k++] = b[j++];

        int n = c.length;
        return n % 2 == 0 ? (c[n/2] + c[n/2 - 1]) / 2.0 : c[n/2];
    }

    public static void main(String[] args) {
        System.out.println(findMedian(new int[]{1,3}, new int[]{2}));
    }
}
