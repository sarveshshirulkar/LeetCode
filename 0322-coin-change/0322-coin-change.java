class Solution {
    static int memoFun(int ind, int[] coins, int target, int[][] dp){
        if(ind == 0){
            if(target % coins[ind] == 0) return target / coins[ind];
            return (int)1e9;
        }
        if(dp[ind][target] != -1) return dp[ind][target];
        int notTake = 0 + memoFun(ind-1, coins, target, dp);
        int take = Integer.MAX_VALUE;
        if(target >= coins[ind]){
            take = 1 + memoFun(ind, coins, target-coins[ind], dp);
        }
        return dp[ind][target] = Math.min(take, notTake);
    }
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        Arrays.sort(coins);
        int[][] dp = new int[n][amount+1];
        for(int[] row : dp) Arrays.fill(row, -1);
        int ans = memoFun(n-1, coins, amount, dp);
        if(ans >= (int)1e9) return -1;
        else return ans;
    }
}