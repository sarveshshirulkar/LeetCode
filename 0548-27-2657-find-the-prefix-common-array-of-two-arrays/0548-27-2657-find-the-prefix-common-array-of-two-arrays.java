class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] freq = new int[51];
        int[] ans = new int[A.length];
        int cnt = 0;

        for(int i=0; i<A.length; i++){
            freq[A[i]]++;
            if(freq[A[i]] == 2){
                cnt++;
            }
            freq[B[i]]++;
            if(freq[B[i]] == 2){
                cnt++;
            }
            ans[i] = cnt;
           
        }

        return ans;
    }
}