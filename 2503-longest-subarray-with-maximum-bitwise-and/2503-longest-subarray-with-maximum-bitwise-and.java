class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int max = 0;
        int ans = 1;
        int cnt = 0;

        for(int i : nums){
            max = Math.max(i, max);
        }

        for(int i : nums){
            if(i == max){
                cnt++; 
            } else {
                ans = Math.max(cnt, ans);  
                cnt = 0;  
            }
        }
        ans = Math.max(cnt, ans);  

        return ans;
    }
}