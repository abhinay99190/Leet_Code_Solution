/*
Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears
once or twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant extra space.

Example 1:--
Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]

Example 2:--
Input: nums = [1,1,2]
Output: [1]

Example 3:--
Input: nums = [1]
Output: []


Constraints:--
n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
Each element in nums appears once or twice.

 */

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> value = new ArrayList<>();
        for (int i = 0; i < nums.length;) {
            int correct_index = nums[i] - 1;
            if (nums[i]!=nums[correct_index]){
                swap(nums,i,correct_index);
            }else{
                i++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=i+1){
                value.add(nums[i]);
            }
        }
        return value;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> value = findDisappearedNumbers(nums);
        System.out.println(value);
    }
}
