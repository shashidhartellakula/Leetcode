import java.util.Arrays;

public class Solution {
    public int[] transformArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                nums[i] = 0;
            } else {
                nums[i] = 1;
            }
        }
        
        Arrays.sort(nums);
        
        return nums;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums1 = {4, 3, 2, 1};
        System.out.println(Arrays.toString(solution.transformArray(nums1))); 
        
        int[] nums2 = {1, 5, 1, 4, 2};
        System.out.println(Arrays.toString(solution.transformArray(nums2))); 
    }
}

