import java.util.Arrays;

class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for (int num : nums) sum += num;

        int rem = sum % k;
        if (rem == 0) return 0;

        // Sort in descending order
        Arrays.sort(nums);
        int n = nums.length;

        int ops = 0;
        for (int i = n - 1; i >= 0 && rem > 0; i--) {
            int take = Math.min(nums[i], rem);
            rem -= take;
            ops += take;
        }

        return rem == 0 ? ops : -1;  // Just in case, though -1 shouldn't happen in constraints
    }
}

