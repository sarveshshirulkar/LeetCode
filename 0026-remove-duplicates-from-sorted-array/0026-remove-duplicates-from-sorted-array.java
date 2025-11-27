class Solution {
    public int removeDuplicates(int[] nums) {
        int ptr = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[ptr]) {
                nums[ptr+1] = nums[i];
                ptr++;
            }
        }
        return ptr+1;
    }
}