class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        int indP = 0, indN = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                arr[indP] = nums[i];
                indP += 2;
            }else{
                arr[indN] = nums[i];
                indN += 2;
            }
        }
        return arr;
    }
}