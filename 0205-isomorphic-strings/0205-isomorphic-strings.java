class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mp = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char first = s.charAt(i);
            char second = t.charAt(i);

            if(mp.containsKey(first)){
                if(mp.get(first) != second) return false;
            }else if(mp.containsValue(second)){
                return false;
            }
            mp.put(first, second);
        }
        return true;
    }
}