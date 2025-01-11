class Solution {
    public boolean canConstruct(String s, int k) {
        if(k == s.length()) return true;
        if(k > s.length()) return false;
        int[] arr = new int[26];
        for(char c : s.toCharArray()){
            arr[c-'a'] += 1;
        }
        int oddCnt = 0, evenCnt = 0;
        for(int i=0; i<26; i++){
            if(arr[i] != 0 && arr[i] % 2 == 0){
                evenCnt++;
            }else if(arr[i] != 0 && arr[i] % 2 != 0){
                oddCnt++;
            }
        }
        
        return !(oddCnt > k) ;   
    }
}