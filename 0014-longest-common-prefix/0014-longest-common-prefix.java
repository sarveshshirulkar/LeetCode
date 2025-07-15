class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder str = new StringBuilder();
        int mini = Integer.MAX_VALUE;;
        for(int i=0; i<strs.length; i++){
            mini = Math.min(mini, strs[i].length());
        }
        for(int i=0; i<mini; i++){
            char ch = strs[0].charAt(i);
            for(int j=0; j<strs.length; j++){
                char currentChar = strs[j].charAt(i);
                if(currentChar != ch) return str.toString();
            }
            str.append(ch);
        }
        return str.toString();
    }
}