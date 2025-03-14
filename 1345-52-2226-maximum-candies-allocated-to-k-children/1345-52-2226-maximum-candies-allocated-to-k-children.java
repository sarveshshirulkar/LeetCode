class Solution {
    boolean canDistribute(int[] candies, long k, int portionSize){
        long cnt = 0;
        for(int pile:candies){
            cnt += pile/portionSize;
        }
        return cnt >= k;
    }

    public int maximumCandies(int[] candies, long k) {
        int maxPile = Arrays.stream(candies).max().getAsInt();

        int l = 1, r = maxPile, ans = 0;
        while(l <= r){
            int mid = l + (r-l)/2;
            if(canDistribute(candies, k, mid)){
                l = mid+1;
                ans = mid;
            }else{
                r = mid-1;
            }
        }
        return ans;
    }
}