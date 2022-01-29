/*
Rotated Binary Search in Array with Duplicate Values
 */
public class Soluton2 {
    public static int search(int[] nums, int target) {
        int pivot = findPivotwithduplicate(nums);

        // if we did not find a pivot it means the array is not rotated
        if (pivot == -1){
            // just do normal binary search
            return binarysearch(nums,target,0,nums.length-1);
        }
        // if pivot is found we have found 2 sorted array
        if (nums[pivot] == target){
            return pivot;
        }
        if (target >= nums[0]){
            return binarysearch(nums,target,0, pivot-1);
        }
        return binarysearch(nums,target,pivot+1,nums.length-1);
    }
    static int binarysearch(int[] nums, int target, int start, int end){
        while (start <= end){
            int mid = start + (end-start)/2;
            if (target < nums[mid]){
                end = mid -1;
            }
            else if (target > nums[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    public static int findPivotwithduplicate(int[] nums){
        int start = 0;
        int end = nums.length -1;
        while (start <= end){
            int mid = start + (end - start)/2;
            // 4 cases here
            if (mid < end && nums[mid] > nums[mid+1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid-1]) {
                return mid - 1;
            }
            // if elements at middle, start, end are equal then just skip the duplicates
            if (nums[mid] == nums[start] && nums[mid] == nums[end]){
                if (nums[start] > nums[start+1]){
                    return start;
                }
                start++;
                if (nums[end] < nums[end-1]){
                    return end-1;
                }
                end--;
            }
            else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])){
                start = mid+1;
            }
            else {
                end = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,2,2,9};
        int target = 0;
        int ans = search(nums,target);
        System.out.println(ans);
    }
}
