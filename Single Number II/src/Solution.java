/*
Given an integer array nums where every element appears three times except for one, which appears exactly once. Find the
single element and return it.
You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:--
Input: nums = [2,2,3,2]
Output: 3

Example 2:--
Input: nums = [0,1,0,1,0,1,99]
Output: 99


Constraints:--
1 <= nums.length <= 3 * 104
-231 <= nums[i] <= 231 - 1
Each element in nums appears exactly three times except for one element which appears once.
 */

public class Solution {
    public static int singleNumber(int[] nums) {
        int count = nums[0];
        if(nums.length==1){
            return count;
        }
        bubble(nums);
        for (int i = 0; i < nums.length; i++) {
            int j;
            for (j = 0; j < nums.length; j++) {
                if(nums[i]==nums[j] && i!=j)
                    break;
            }
            if (j==nums.length)
                count = nums[i];

        }
        return count;
    }
    static void bubble(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,1,0,1,99};
        int ans = singleNumber(nums);
        System.out.println(ans);
    }
}

