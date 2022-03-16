/*
A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the
same.

Given an array of numbers arr, return true if the array can be rearranged to form an arithmetic progression. Otherwise,
return false.

Example 1:--
Input: arr = [3,5,1]
Output: true
Explanation: We can reorder the elements as [1,3,5] or [5,3,1] with differences 2 and -2 respectively, between each
consecutive elements.

Example 2:--
Input: arr = [1,2,4]
Output: false
Explanation: There is no way to reorder the elements to obtain an arithmetic progression.


Constraints:--
2 <= arr.length <= 1000
-106 <= arr[i] <= 106
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        if (arr.length==2||arr.length==1){
            return true;
        }
        ArrayList<Integer> value = new ArrayList<>();
        for (int j : arr) {
            value.add(j);
        }
        int diff = value.get(1)-value.get(0);
        for (int i = 2; i < value.size(); i++) {
            if (value.get(i)-value.get(i-1)!=diff){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int []arr = {3,5,1};//{13,12,-12,9,9,16,7,-10,-20,0,18,-1,-20,-10,-8,15,15,16,2,15};
        System.out.println(canMakeArithmeticProgression(arr));
    }
}
