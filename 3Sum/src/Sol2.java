import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Sol2 {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> value = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int j = i+1, k = nums.length-1;
                while (j<k){
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        value.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        while (j<k && nums[j] == nums[j+1]){
                            j++;
                        }
                        while (j<k && nums[k] == nums[k-1]){
                            k--;
                        }
                        j++;
                        k--;
                    }

                    else if(nums[i] + nums[j] + nums[k] < 0){
                        j++;
                    }else {
                        k--;
                    }
                }
            }
        }
        return value;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,0,0,0};//{0,0,0,0,0};//{-4,-1,-1,0,1,2}
        List<List<Integer>> ans = threeSum(nums);
        System.out.println(ans);
    }
}