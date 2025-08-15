class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int[] freq = new int[26];
        int cnt = 0;
        for(char ch : allowed.toCharArray()){
            freq[ch - 'a'] = 1;
        }
        for(String word : words){
            boolean flag = true;
            for(int ch : word.toCharArray()){
                if(freq[ch - 'a'] == 0){
                    flag = false;
                    break;
                }
            }
            if(flag) cnt++;
        }
        return cnt;
    }
}