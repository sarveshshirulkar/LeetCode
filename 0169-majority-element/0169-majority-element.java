class Solution {
    public int majorityElement(int[] nums) {
        int freq = 1;
        int majorityEle = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] != majorityEle){
                if(freq > 1) freq--;
                else majorityEle = nums[i];
            }else{
                freq++;
            }
        }
        return majorityEle;
    }
}