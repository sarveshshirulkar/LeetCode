class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int maxi = 0;
        if(citations.length == 1 && citations[0] != 0) return 1;

        for(int i=0; i<citations.length; i++){
            if(citations[i] >= (citations.length - i)){
                return citations.length - i;
            }
        }
        return 0;
    }
}