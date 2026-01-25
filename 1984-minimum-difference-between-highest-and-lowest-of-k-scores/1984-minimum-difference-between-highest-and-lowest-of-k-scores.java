class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        for(int i=0; i<nums.length-k+1; i++){
            minDiff = Math.min(minDiff, Math.abs(nums[i] - nums[i+k-1]));
        }
        return minDiff == Integer.MAX_VALUE? 0 : minDiff;
    }
}
// 1,4,7,9
