import java.util.Arrays;
public class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int[] result = new int[length];
        int pos = 0;
        for (int element : nums1) {
            result[pos] = element;
            pos++;
        }

        for (int element : nums2) {
            result[pos] = element;
            pos++;
        }
        Arrays.sort(result);
        if (length % 2 == 1) {
            return result[length / 2];
        }
        return (double)(result[(length - 1) / 2] + result[length / 2]) / 2.0;
    }

    public static void main(String[] args) {
        int [] nums1 = {1,3,4};
        int [] nums2 = {2};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}


