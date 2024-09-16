package java;

import java.util.Arrays;

public class concatenation_of_array {
    public static int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int ans[] = new int[len * 2];
        System.arraycopy(nums, 0, ans, 0, len);
        System.arraycopy(nums, 0, ans, len, len);

        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 1 };
        int[] nums2 = { 1, 3, 2, 1 };

        int[] result1 = getConcatenation(nums1);
        int[] result2 = getConcatenation(nums2);

        System.out.println("Output for nums1: " + Arrays.toString(result1));
        System.out.println("Output for nums2: " + Arrays.toString(result2));

    }
}
