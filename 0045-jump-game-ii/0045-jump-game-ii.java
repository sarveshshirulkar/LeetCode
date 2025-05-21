class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        // if(nums.length == 1) return 1;

        int currentPos = 0, maxJump = 0;
        while(maxJump < nums.length-1){
            int farthest = 0;
            for(int i=currentPos; i<= maxJump; i++){
                farthest = Math.max(farthest, i+nums[i]);
            }
            currentPos = maxJump+1;
            maxJump = farthest;
            jumps++;
        }
        return jumps;
    }
}