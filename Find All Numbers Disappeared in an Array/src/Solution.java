/*
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range
[1, n] that do not appear in nums.

Example 1:--
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]

Example 2:--
Input: nums = [1,1]
Output: [2]

Constraints:--
n == nums.length
1 <= n <= 105
1 <= nums[i] <= n


Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
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
                value.add(i+1);
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
