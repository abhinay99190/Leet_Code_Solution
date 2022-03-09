/*
Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest
to target.

Return the sum of the three integers.
You may assume that each input would have exactly one solution.

Example 1:--
Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

Example 2:--
Input: nums = [0,0,0], target = 1
Output: 0

Constraints:
3 <= nums.length <= 1000
-1000 <= nums[i] <= 1000
-104 <= target <= 104
 */

import java.util.Arrays;
public class Solution {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        int value = 0;
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                int closest_val = Math.abs(sum - target);
                if (closest_val == 0) {
                    return sum;
                }
                if (closest_val < diff) {
                    diff = closest_val;
                    value = sum;
                }
                if (sum <= target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return value;
    }


    public static void main(String[] args) {
        int[] nums = {0,1,2};//{-1,2,1,-4};//2,-1,2,4,12
        int target = 3;
        System.out.println(threeSumClosest(nums,target));
    }
}
