class Solution {
    static boolean checkHalfSum(int index, int target, int[] nums, int[][] dp){
        if(target == 0) return true;
        if(index == 0) return (nums[index] == target);

        if(dp[index][target] != -1) return dp[index][target] == 1;

        boolean notTake = checkHalfSum(index-1, target, nums, dp);
        boolean take = false;
        if(nums[index] <= target){
            take = checkHalfSum(index-1, target-nums[index], nums, dp);
        }
        boolean result = take || notTake;
        dp[index][target] = result ? 1 : 0;
        return result;

    }
    public boolean canPartition(int[] nums) {
        // check if we can get 1 subset with sum = 0.5*(totalSum)
        int n = nums.length;
        int sum = 0;
        for(int num : nums) sum += num;
        if(sum % 2 != 0) return false;
        int[][] dp = new int[n][(sum/2)+1];
        for(int[] row : dp) Arrays.fill(row, -1);
        return checkHalfSum(n-1, sum/2, nums, dp);
    }
}