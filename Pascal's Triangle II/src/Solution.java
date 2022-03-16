/*
Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:--
Input: rowIndex = 3
Output: [1,3,3,1]

Example 2:--
Input: rowIndex = 0
Output: [1]

Example 3:--
Input: rowIndex = 1
Output: [1,1]


Constraints:

0 <= rowIndex <= 33
 */

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> val1, pre = null;
        for (int i = 0; i <= rowIndex; i++) {
            val1 = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j==0||j==i){
                    val1.add(1);
                }else{
                    assert pre != null;
                    val1.add(pre.get(j-1)+ pre.get(j));
                }
            }
            pre = val1;
        }

        return pre;
    }

    public static void main(String[] args) {
        int rowIndex = 3;
        System.out.println(getRow(rowIndex));
    }
}
