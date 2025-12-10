class Solution {
    static int memoFun(int ind, int[] coins, int target, int[][] dp){
        if(ind == 0){
            return (target % coins[ind] == 0) ? 1 : 0;
        }
        if(dp[ind][target] != -1) return dp[ind][target];
        int notTake = memoFun(ind-1, coins, target, dp);
        int take = 0;
        if(coins[ind] <= target){
            take = memoFun(ind, coins, target-coins[ind], dp);
        }
        return dp[ind][target] = take + notTake;
    }
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n][amount+1];
        for(int[] row : dp) Arrays.fill(row, -1);
        return memoFun(n-1, coins, amount, dp);
    }
}