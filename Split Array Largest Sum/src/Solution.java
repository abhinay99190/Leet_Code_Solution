/*
Given an array num which consists of non-negative integers and an integer m, you can split the array into m non-empty
continuous sub arrays.

Write an algorithm to minimize the largest sum among these m sub arrays.

Example 1:-- Input:-- num = [7,2,5,10,8], m = 2
Output: 18
Explanation:
There are four ways to split num into two sub arrays.
The best way is to split it into [7,2,5] and [10,8],
where the largest sum among the two sub arrays is only 18.

Example 2:-- Input:-- num = [1,2,3,4,5], m = 2
Output: 9

Example 3:-- Input:-- num = [1,4,4], m = 3
Output: 4


Constraints:--
1 <= nums.length <= 1000
0 <= nums[i] <= 106
1 <= m <= min(50, nums.length)
 */

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int m = 2;
        System.out.println(splitArray(nums,m));
    }

    public static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;
        for (int j : nums) {
            start = Math.max(start, j); // in the end of the loop this will contain the max item from the array
            end += j;
        }
        // binary search
        while (start < end){
            // try for middle as potential ans
            int mid = start + (end - start)/2;

            // calculate how many pieces you divide this in wit this max sum
            int sum = 0;
            int pieces = 1;
            for(int num: nums){
                if (sum + num>mid){
                    // we can not add this in this sub array make new one
                    // say we add this num in new sub array then sum = num
                    sum = num;
                    pieces++;
                }
                else {
                    sum+= num;
                }
            }
            if (pieces > m){
                start = mid +1;
            } else {
                end = mid;
            }
        }
        return end; // here start == end
    }
}
