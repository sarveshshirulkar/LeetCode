class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int[] arr = new int[nums.length + 1];
        for(int[] q : queries){
            arr[q[0]]++;
            if(q[1] + 1 < nums.length) arr[q[1] + 1]--; 
        }
        int cnt = 0;
        for(int i=0; i<nums.length; i++){
            cnt += arr[i];
            if(nums[i] > cnt) return false;
        }
        return true;
    }
}