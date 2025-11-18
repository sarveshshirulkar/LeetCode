class Solution {
    public String mergeAlternately(String word1, String word2) {
        int s1 = word1.length();
        int s2 = word2.length();
        String ans = "";

        int mini = Math.min(s1, s2);

        for(int i=0; i<mini; i++){
            ans += word1.charAt(i);
            ans += word2.charAt(i);
        }
        int mid = 0;
        if(s1 > s2){
            for(int i=mini; i<s1; i++){
                ans += word1.charAt(i);
            }
        }else{
            for(int i=mini; i<s2; i++){
                ans += word2.charAt(i);
            }
        }          
        return ans;
    }
}