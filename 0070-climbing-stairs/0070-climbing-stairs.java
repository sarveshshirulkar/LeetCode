class Solution {
    public int climbStairs(int n) {
        if(n == 0 || n == 1) return 1;
        int a = 0 , b = 1 ,c = 1;
        for(int i = 1;i<n+1;i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}