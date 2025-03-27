class Solution {
    List<String> result = new ArrayList<>();
    private void validate(int n,int l,int t,StringBuilder sb){
        //base condition
        if(t == 2*n){
            if(l == 0) result.add(sb.toString());
            return;
        }
        if(t == 0){
            sb.append('(');
            validate(n,l+1,t+1,sb);
            sb.deleteCharAt(sb.length() - 1);
        }else if(t == 2*n-1){
            sb.append(')');
            validate(n,l-1,t+1,sb);
            sb.deleteCharAt(sb.length() - 1);
        }
        else{
            sb.append('(');
            validate(n,l+1,t+1,sb);
            sb.deleteCharAt(sb.length() - 1);
            if(l != 0){
                sb.append(')');
                validate(n,l-1,t+1,sb);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
    public List<String> generateParenthesis(int n) {
        validate(n, 0, 0, new StringBuilder());
        return result;
    }
}