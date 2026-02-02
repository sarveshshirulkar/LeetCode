class Solution {
    public boolean nonPositive(int[] nums, int k){
        long cnt = 0;
        long limit = 1L*k*k;
        
        for(int num : nums){

            // if(num%k == 0) cnt+= num / k;
            // else cnt += (num / k) + 1;
            cnt += (num + k - 1) / k;
            if(cnt > limit) return false;
        }
        return true;
    }
    public int minimumK(int[] nums) {
        int maxi = Arrays.stream(nums).max().getAsInt();
        int n = nums.length;
        int start = 1, end = 100000;
        int ans = 100000;
        while(start <= end){
            int mid = start+ (end-start) / 2;
            if(nonPositive(nums, mid)){
                ans = mid;
                end = mid - 1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
}