/*
Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.

Example 1:--
Input: c = 5
Output: true
Explanation: 1 * 1 + 2 * 2 = 5

Example 2:--
Input: c = 3
Output: false


//long sum;
        long start = 1;
        long end = c;
        while (start<=end){
            long mid = start + (end - start) / 2;
            if(start*start + end*end == c){
                return true;
            }
            else if(start*start + end*end>c){
                end = mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return false;

Constraints:--
0 <= c <= 231 - 1

long sum = 0;
        for (long i = 1; i < c; i++) {
            sum = sum*sum + i*i;
            if (sum==c){
                return true;
            }
        }
        return false;
 */

public class Solution {
    public static boolean judgeSquareSum(int c) {
        long start = 0;
        long end = (long) Math.sqrt(c);
        while (start<=end){
            if(start*start + end*end == c){
                return true;
            }
            else if(start*start + end*end>c){
                end--;
            }
            else {
                start++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int c = 4;
        boolean ans = judgeSquareSum(c);
        System.out.println(ans);
    }
}
