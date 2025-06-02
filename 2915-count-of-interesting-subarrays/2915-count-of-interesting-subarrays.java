class Solution {
    public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
        int n = nums.size();
        if(k > n) return 0;
        List<Integer> prefixSum = new ArrayList<>(Collections.nCopies(n + 1, 0));

        for(int i = 0; i< n ; i++){
            prefixSum.set(i+1, prefixSum.get(i) + (nums.get(i) % modulo == k ? 1 : 0));
        }
        long res = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);

        for(int i = 1; i <= n; i++){
            int currMod = prefixSum.get(i) % modulo;
            int targetMod = (currMod - k + modulo) % modulo;
            res += hm.getOrDefault(targetMod,0);

            hm.put(currMod,hm.getOrDefault(currMod,0)+1);
        }
        return res;
    }
}