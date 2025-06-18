class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        int col=0, row = 0;
        int rowCnt = n/3;
        int[][] arr = new int[rowCnt][3];
        Arrays.sort(nums);
        for(int i=2; i<n; i+=3){
            if(nums[i] - nums[i-2] > k){
                return new int[][]{};
            }
            arr[row][0] = nums[i-2];
            arr[row][1] = nums[i-1];
            arr[row][2] = nums[i];
            row++;
        }
        return arr;
    }
}