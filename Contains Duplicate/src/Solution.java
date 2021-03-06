/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every
element is distinct.

Example 1:--
Input: nums = [1,2,3,1]
Output: true

Example 2:--
Input: nums = [1,2,3,4]
Output: false

Example 3:--
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true


Constraints:--
1 <= nums.length <= 105
-109 <= nums[i] <= 109
 */

import java.util.Arrays;

// unsolved
public class Solution {
    public static boolean removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        int res = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[res - 1]) {
                return true;
            }else {
                res++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {2,14,18,22,22}; // Input array
        boolean ans = removeDuplicates(nums);
        System.out.println(ans);
    }
}
