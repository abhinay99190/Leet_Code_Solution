/*
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.

Example 1:--
Input:-- nums = [1,2,3,4]
Output:-- [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

Example 2:--
Input:-- nums = [1,1,1,1,1]
Output:-- [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].

Example 3:--
Input:-- nums = [3,1,2,10,1]
Output:-- [3,4,6,16,17]


Constraints:

1 <= nums.length <= 1000
-10^6 <= nums[i] <= 10^6
 */

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            ans[i] = sum;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] num = new int[n];  // array of primitive
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(getConcatenation(num)));
    }
}

