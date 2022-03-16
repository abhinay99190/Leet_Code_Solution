/*
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:-
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

Example 2:--
Input: numRows = 1
Output: [[1]]

Constraints:
1 <= numRows <= 30
 */

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> val = new ArrayList<>();

        List<Integer> val1, pre = null;
        for (int i = 0; i < numRows; i++) {
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
                val.add(val1);
            }

        return val;
    }
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> ans=  generate(numRows);
        System.out.println(ans);
    }
}
