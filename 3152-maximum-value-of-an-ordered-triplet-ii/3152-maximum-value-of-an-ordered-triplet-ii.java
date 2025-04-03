class Solution {
    public long maximumTripletValue(int[] nums) {
        long maxsum = 0;
        int maxBeforeJ = nums[0];
        long maxDiff = Integer.MIN_VALUE;

        if (nums.length < 3) return 0;


        for(int j=1; j<nums.length-1; j++){
            int temp = nums[j];
            maxDiff = Math.max(maxDiff, maxBeforeJ-temp);
            maxsum = Math.max(maxsum, maxDiff*nums[j+1]);
            maxBeforeJ = Math.max(maxBeforeJ, temp);
        }
        return maxsum;
    }
}