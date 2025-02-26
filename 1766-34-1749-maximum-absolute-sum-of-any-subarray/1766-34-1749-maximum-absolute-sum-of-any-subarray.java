class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum = 0, minSum=0, currentSum = 0, maxAbsSum = 0;
        for(int num : nums){
            currentSum += num;

            maxAbsSum = Math.max(maxAbsSum, Math.max(Math.abs(currentSum - minSum), 
                                                        Math.abs(currentSum - maxSum)));
            minSum = Math.min(minSum, currentSum);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxAbsSum;
    }
}