class Solution {
    public long countSubarrays(int[] nums, long k) {
        long cnt = 0;
        int l=0, r=0;
        long[] prefix = new long[nums.length];
        prefix[0] = nums[0];
        // if(nums[0] < k) cnt++;
        for(int i=1; i<nums.length; i++){
            // if(nums[i] < k) cnt++;
            prefix[i] = prefix[i-1] + nums[i];
        }
        while(r < nums.length && l<=r){
            long rangeSum = 0;
            if(l == 0){
                rangeSum = prefix[r];
            }else{
                rangeSum = prefix[r] - prefix[l-1];
            }
            if((rangeSum * (r-l+1)) < k){
                cnt += r-l+1;
                r++;
            }else{
                l++;
                if(r < l) r = l; 
            }

        }
        return cnt;
    }
}