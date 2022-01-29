/*
Floor of the Number:-- Greater element in array smallest or equal target
Suppose:--
Example:-- arr = [2,3,5,9,14,16,18], target = 13 then Floor:-- 9
Example:-- arr = [2,3,5,9,14,16,18], target = 15 then Ceiling number:-- 14
 */
public class Solution {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 13;
        int ans = floor_number(arr, target);
        System.out.println(ans);
    }

    public static int floor_number(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {

            int mid = start + (end - start) / 2;

            if(target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return arr[end];
    }
}
