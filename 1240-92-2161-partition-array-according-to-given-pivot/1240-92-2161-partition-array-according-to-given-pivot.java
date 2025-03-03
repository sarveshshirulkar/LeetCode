class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int less = 0, equal = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] < pivot) less++;
            if(nums[i] == pivot) equal++;
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i] < pivot){
                list.add(nums[i]);
            } 
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i] == pivot){
                list.add(nums[i]);
            } 
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i] > pivot){
                list.add(nums[i]);
            } 
        }
        return convertListToArray(list);
    }
    public int[] convertListToArray(List<Integer> list) {
    int[] array = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
        array[i] = list.get(i);
        }
        return array;
    }
}