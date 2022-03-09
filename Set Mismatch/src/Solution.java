/*
You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error,
one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss
of another number.

You are given an integer array nums representing the data status of this set after the error.
Find the number that occurs twice and the number that is missing and return them in the form of an array.

Example 1:--
Input: nums = [1,2,2,4]
Output: [2,3]

Example 2:--
Input: nums = [1,1]
Output: [1,2]


Constraints:--
2 <= nums.length <= 104
1 <= nums[i] <= 104

 */

import java.util.Arrays;

public class Solution {
    public static int[] findErrorNums(int[] nums) {
        for (int i = 0; i < nums.length;) {
            int correct_index = nums[i]-1;
            if (nums[i]<nums.length  && nums[i]!=nums[correct_index]){
                swap(nums,i,correct_index);
            }else{
                i++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=i+1){
                return new int[]{nums[i], i+1};
            }
        }
        return new int[]{-1, -1};
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    public static void main(String[] args) {
        int[] nums = {3,2,2};
        int[] value = findErrorNums(nums);
        System.out.println(Arrays.toString(value));
    }
}
