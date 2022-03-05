/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k,
and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

Example 1:--
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]

Example 2:--
Input: nums = []
Output: []

Example 3:--
Input: nums = [0]
Output: []


Constraints:
0 <= nums.length <= 3000
-105 <= nums[i] <= 105
 */

// wrong ans
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> value = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int j = i+1, k = nums.length-1;
                while (j<k){
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        value.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        while (j<k && nums[j] == nums[j+1]){
                            j++;
                        }
                        while (j<k && nums[k] == nums[k-1]){
                            k--;
                        }
                    }
                    else if(nums[i] + nums[j] + nums[k] < 0){
                        j++;
                    }else {
                        k--;
                    }
                }
            }
        }
        return value;
    }

    public static void main(String[] args) {
        int[] nums = {-4,-1,-1,0,1,2};//{-4,-1,-1,0,1,2}
        List<List<Integer>> ans = threeSum(nums);
        System.out.println(ans);
    }
}