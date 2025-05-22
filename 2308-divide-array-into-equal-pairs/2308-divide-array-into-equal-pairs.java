class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        for (int cnt : mp.values()) {
            if (cnt % 2 != 0) {
                return false;
            }
        }
        
        return true;
    }
}