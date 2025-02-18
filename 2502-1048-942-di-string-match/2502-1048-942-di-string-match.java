class Solution {
    public int[] diStringMatch(String s) {
        int a[]=new int[s.length()+1];
        int low=0, high=s.length();
        int c=0;
        for(char i: s.toCharArray()){
            if(i=='I'){
                a[c]=low;
                c++;
                low++;
            }
            else{
                a[c]=high;
                c++; high--;
            }
        }
        a[c]=low;
        return a;
    }
}