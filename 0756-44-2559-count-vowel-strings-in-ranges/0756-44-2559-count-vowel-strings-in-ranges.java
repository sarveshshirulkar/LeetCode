class Solution {
    boolean isVowel(char ch) {
            return ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
        }

    public int[] vowelStrings(String[] words, int[][] queries) {
    
        int n = words.length;
        // 1-indexed prefix sum
        int[] prefixVowelCount = new int[n+1];
        for(int i=1; i<=n; i++){
            String currentWord = words[i-1];
            prefixVowelCount[i] = prefixVowelCount[i-1] + 
                (isVowel(currentWord.charAt(0)) && isVowel(currentWord.charAt(currentWord.length() - 1)) ? 1 : 0);
        }
        int[] ans = new int[queries.length];
        for(int i=0; i<queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1];
            ans[i] = prefixVowelCount[end+1] - prefixVowelCount[start];
        }
        return ans;
    }
}