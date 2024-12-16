class Solution {
    public int countPrimes(int n) {
        if(n == 0 || n == 1) return 0;
        int cnt = 0;
        int[] primes = new int[n+1];
        Arrays.fill(primes, -1);
        for(int i=2; i<=n; i++){
            if(primes[i] == -1){
                for(int j=2*i; j<=n; j+=i){
                    primes[j] = 0;
                }
            }
        }
        for(int i=2; i<n; i++){
            if(primes[i] == -1){
                cnt++;
            }
        }
        return cnt;
    }
}