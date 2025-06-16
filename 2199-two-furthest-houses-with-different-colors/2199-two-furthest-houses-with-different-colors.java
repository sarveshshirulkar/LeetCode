class Solution {
    public int maxDistance(int[] colors) {
        int currDiff = 0, maxDiff = 0;
        for(int i=0; i<colors.length; i++){
            for(int j=i; j<colors.length; j++){
                if(colors[j] != colors[i]){
                    currDiff = Math.max(currDiff, j - i);
                }               
            }
            maxDiff = Math.max(maxDiff, currDiff);
        }
        return maxDiff;
    }
}