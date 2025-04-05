class Solution {
    public int subsetXORSum(int[] nums) {
        int sum = 0, totalSum = 0;
        for(int num : nums){
            sum |= num;
        }
        return sum << (nums.length - 1);
    }
}