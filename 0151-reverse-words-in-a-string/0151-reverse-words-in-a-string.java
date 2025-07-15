class Solution {
    public void swap(int a, int b, String[] ans){
        String temp = ans[a];
        ans[a] = ans[b];
        ans[b] = temp;
    }
    public String reverseWords(String s) {
        String[] ans = s.trim().split("\\s+");
        for(int i=0; i<ans.length / 2; i++){
            swap(i, ans.length - i - 1, ans);
        }
        String str = String.join(" ", ans);
        return str ;
    }
}