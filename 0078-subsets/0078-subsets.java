class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        backtrack(nums,0,new ArrayList<>(),result);
        return result;
    }
    private void backtrack(int[] nums,int top,List<Integer> list,List<List<Integer>> result){
        if(top == nums.length) return;
        for(int i = top;i<nums.length;i++){
            list.add(nums[i]);
            result.add(new ArrayList<>(list));
            backtrack(nums,i+1,list,result);
            list.remove(list.size()-1);
        }
    }
}