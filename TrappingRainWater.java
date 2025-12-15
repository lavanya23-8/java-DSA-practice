public class TrappingRainWater {
    public static int trap(int[] h) {
        int left = 0, right = h.length - 1;
        int leftMax = 0, rightMax = 0, water = 0;

        while (left < right) {
            if (h[left] < h[right]) {
                leftMax = Math.max(leftMax, h[left]);
                water += leftMax - h[left];
                left++;
            } else {
                rightMax = Math.max(rightMax, h[right]);
                water += rightMax - h[right];
                right--;
            }
        }
        return water;
    }

    public static void main(String[] args) {
        int[] arr = {4,2,0,3,2,5};
        System.out.println(trap(arr));
    }
}
