class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int[][] numWithIndex = new int[n][2];
        for (int i = 0; i < n; i++) {
            numWithIndex[i][0] = nums[i];
            numWithIndex[i][1] = i; 
        }
        
        Arrays.sort(numWithIndex, (a,b) -> b[0] - a[0]);
        
        int[][] topK = Arrays.copyOf(numWithIndex, k);
        
        Arrays.sort(topK, (a,b) -> a[1] - b[1]);
        
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = topK[i][0];
        }
        return res;
    }
}
