class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0, r = n-1;
        int maxAmt = 0;
        while(l < r){
            int breadth = r - l;
            int length = Math.min(height[r], height[l]);
            maxAmt = Math.max(maxAmt, length*breadth);

            if(height[l] < height[r]) l++;
            else r--;
        }
        return maxAmt;
    }
}