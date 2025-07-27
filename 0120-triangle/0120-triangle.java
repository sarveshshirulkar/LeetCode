class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int row = triangle.size();
        int col = triangle.get(row-1).size();
        int[][] dp = new int[row][col];
        // dp[row-1] = new int[triangle.get(row-1).size()];
        for(int i=0; i<triangle.get(row-1).size(); i++){
            dp[row-1][i] = triangle.get(row-1).get(i);
        }
        for(int i=row-2; i>=0; i--){
            // int col = triangle.get(i).size();
            // dp[i] = new int[col];
            for(int j=0; j<triangle.get(i).size(); j++){
                dp[i][j] = triangle.get(i).get(j) + Math.min(dp[i+1][j], dp[i+1][j+1]);
            } 
        }
        return dp[0][0];
    }
}