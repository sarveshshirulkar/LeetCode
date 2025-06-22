class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int size = 0;
        if((n % k) == 0) size = n / k;
        else size = (n/k)+1;

        String[] res = new String[size];
        int ind = 0;
        for(int i=0; i<n; i+=k){
            StringBuilder currStr = new StringBuilder();
            for(int j=i; j<i+k; j++){
                if(j < n) currStr.append(s.charAt(j));
                else currStr.append(fill);
            }
            res[ind] = currStr.toString();
            ind++;
        }
        return res;
    }
}