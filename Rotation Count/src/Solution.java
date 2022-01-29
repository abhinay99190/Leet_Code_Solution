/*
Count number of rotation in array
 */

public class Solution {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int[] arr2 = {2,2,2,2,9};
        System.out.println(countRotation(arr));
    }

    public static int countRotation(int[] arr) {
        int pivot = findPivot(arr);
        return pivot+1;
    }

    public static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int findPivotwithduplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases here
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            // if elements at middle, start, end are equal then just skip the duplicates
            if (nums[mid] == nums[start] && nums[mid] == nums[end]) {
                if (nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;
                if (nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
