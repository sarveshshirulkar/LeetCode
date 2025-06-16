class Solution {
    public int maximumDifference(int[] nums) {
        int currDiff = 0, maxDiff = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                if(nums[j] >= nums[i]){
                    currDiff = Math.max(currDiff, nums[j] - nums[i]);
                }               
            }
            maxDiff = Math.max(maxDiff, currDiff);
        }
        return maxDiff == 0 ? -1 : maxDiff;
    }
}