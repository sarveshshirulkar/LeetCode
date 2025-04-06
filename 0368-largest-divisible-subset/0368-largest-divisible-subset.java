class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int[][] arr = new int[nums.length][2];
        Arrays.sort(nums);


        for(int i=nums.length-1; i>=0; i--){
            arr[i][1] = nums.length;
            for(int j=i+1; j<nums.length; j++){
                if(nums[j] % nums[i] == 0){
                    if(arr[i][0] < arr[j][0] + 1){
                        arr[i][0] = arr[j][0] + 1;
                        arr[i][1] = j;
                    }
                }
            }

        }
        List<Integer> list = new ArrayList<>();
        int maxInd = 0;
        int maxVal = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i][0] > maxVal){
                maxVal = arr[i][0];
                maxInd = i;
            }
        }

        while(maxInd < nums.length){
            list.add(nums[maxInd]);
            maxInd = arr[maxInd][1];
        }
        return list;
    }
}