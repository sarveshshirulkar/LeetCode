class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();

        for(String str : strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String currentStr = new String(arr);

            // if(!mp.containsKey(currentStr)){
            //     mp.put(currentStr, new ArrayList<>());
            // }
            mp.putIfAbsent(currentStr, new ArrayList<>());

            mp.get(currentStr).add(str);
        }
        return new ArrayList<>(mp.values());
    }
}