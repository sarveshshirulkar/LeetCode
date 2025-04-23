class Solution {
    public int countLargestGroup(int n) {
        int[] freq = new int[37];
        for(int i=1; i<=n; i++){
            int sum = 0;
            int num = i;
            while(num > 0){
                sum += num % 10;
                num /= 10;
            }
            freq[sum]++;
        }
        int maxi = 0;
        int cnt = 0;
        for(int i=0; i<freq.length; i++){
            maxi = Math.max(maxi, freq[i]);
        }   
        for(int i=0; i<freq.length; i++){
            if(freq[i] == maxi) cnt++;
        }   
        return cnt;
    }
}