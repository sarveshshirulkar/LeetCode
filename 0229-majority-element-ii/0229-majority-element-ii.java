class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> mp = new HashMap<>();

        for(int num : nums){
            mp.put(num, mp.getOrDefault(num, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
            if(entry.getValue() > Math.floor(n / 3)){
                list.add(entry.getKey());
            }
        }
        return list;
    }
}