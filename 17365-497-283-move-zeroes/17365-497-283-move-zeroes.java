class Solution {
    public void moveZeroes(int[] nums) {
        int snowBallSize = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                snowBallSize++;
            }else if(snowBallSize > 0){
                nums[i-snowBallSize] = nums[i];
                nums[i] = 0;
            }
        }
        return;
    }
}