import java.util.Arrays;

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);

        int[] dp = new int[n];
        int[] dp2 = new int[n];

        dp[n - 2] = nums[n - 2];
        dp[n - 3] = Math.max(nums[n - 3], dp[n - 2]);
        for (int i = n - 4; i >= 0; i--) {
            dp[i] = Math.max(dp[i + 1], dp[i + 2] + nums[i]);
        }
        int maxi1 = dp[0];

        dp2[n - 1] = nums[n - 1];
        dp2[n - 2] = Math.max(nums[n - 2], dp2[n - 1]);
        for (int i = n - 3; i >= 1; i--) {
            dp2[i] = Math.max(dp2[i + 1], dp2[i + 2] + nums[i]);
        }
        int maxi2 = dp2[1];

        return Math.max(maxi1, maxi2);
    }
}
