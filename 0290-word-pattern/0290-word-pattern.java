class Solution {
    public boolean wordPattern(String pattern, String s) {
        char[] chars = pattern.toCharArray();
        String[] str = s.split(" ");

        if(chars.length != str.length) return false;

        Map<Character, String> mp = new HashMap<>();
        for(int i=0; i<chars.length; i++){
            if(mp.containsKey(chars[i])){
                if(!mp.get(chars[i]).equals(str[i])) return false;
            }else if(mp.containsValue(str[i])){
                return false;
            }
            mp.put(chars[i], str[i]);
        }
        return true;
    }
}