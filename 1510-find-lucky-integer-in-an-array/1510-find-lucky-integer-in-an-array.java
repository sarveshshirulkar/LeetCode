class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            mp.put(arr[i], mp.getOrDefault(arr[i],0)+1);
        }
        int max = -1;
        for(int key : mp.keySet()){
            if(key == mp.get(key)){
                max = Math.max(max, key);
            }
        }
        return max;
    }
}