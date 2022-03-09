/*
Given an array A, find the maximum number of consecutive 1s in the array.

Examples
A: [1, 1, 3, 2, 3, 1, 1, 1]
Max consecutive 1s: 3

Testing
Input Format
First line contains an integer ‘T’ denoting the number of test cases.
For each test case, the input has two lines:
An integer ‘n’ denoting the size of the array.
n space-separated integers denoting the elements of the array.

Output Format
For each test case, the output has a line with an integer denoting the maximum continuous 1s in the array A.

Sample Input
3
5
1 1 1 2 2
6
1 2 1 1 1 2
8
1 1 3 2 3 1 1 1

Expected Output
3
3
3


Constraints
1 <= T <= 100
1 <= n <= 104
0 <= Ai <= 105
 */


class Solution {
    static int getMaxConsecutiveOnes(int[] nums) {
        int max_ones = 0;
        int i;
        for ( i = 0; i < nums.length; i++) {
            int count=0;
            while (i<nums.length&&nums[i]==1){
                i++;
                count++;
            }
            max_ones=Math.max(max_ones,count);
        }
        return max_ones;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 1, 1, 2};
        System.out.println(getMaxConsecutiveOnes(nums));
    }
}