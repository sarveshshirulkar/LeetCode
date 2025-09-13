class Solution {
    public int maxFreqSum(String s) {
        int cnt1 = 0, cnt2 = 0;
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }
        for(int i=0; i<26; i++){
            if(i == 0 || i == 4 || i == 8 || i == 14 || i == 20) continue;
            cnt2 = Math.max(cnt2, freq[i]);
        }
        cnt1 = Math.max(freq[0], Math.max(freq[4], Math.max(freq[8], Math.max(freq[14], freq[20]))));
        return cnt1+cnt2;
    }
}