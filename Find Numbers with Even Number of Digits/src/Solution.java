/*
Given an array numbs of integers, return how many of them contain an even number of digits.

Example 1:--
Input:-- numbs = [12,345,2,6,7896]
Output:-- 2
Explanation:--
12 contains 2 digits (even number of digits).
345 contains 3 digits (odd number of digits).
2 contains 1 digit (odd number of digits).
6 contains 1 digit (odd number of digits).
7896 contains 4 digits (even number of digits).
Therefore, only 12 and 7896 contain an even number of digits.

Example 2:--
Input:-- numbs = [555,901,482,1771]
Output:-- 1
Explanation: -- Only 1771 contains an even number of digits.


Constraints:

1 <= numbs.length <= 500
1 <= numbs[i] <= 10^5
 */

import java.util.Scanner;
public class Solution {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    // function to check whether a number is even or not
    static boolean even(int num) {
        int number = digit(num);
        return number % 2 == 0;
    }

    static int digit(int num) {
        if(num < 0){
            num = num * -1;
        }
        return (int) Math.log10(num) + 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] num = new int[n];  // array of primitive
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }
        int ans = findNumbers(num);
        System.out.println(ans);
    }
}


