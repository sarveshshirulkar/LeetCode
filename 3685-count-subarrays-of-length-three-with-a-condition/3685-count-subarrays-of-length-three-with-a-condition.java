class Solution {
    public int countSubarrays(int[] nums) {
        int cnt = 0;
        int l = 0, r = 2;
        for(int i=0; i<nums.length - 2; i++){
            if((nums[i] + nums[i+2])*2 == nums[i+1]) cnt++;
        }
        return cnt;
    }
}