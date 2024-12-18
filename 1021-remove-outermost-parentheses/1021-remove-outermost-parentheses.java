class Solution {
    public String removeOuterParentheses(String s) {
        //  String Approach
        // int n = s.length();
        // int cnt = 0;
        // StringBuilder str = new StringBuilder();
        // for(char ch : s.toCharArray()){
        //     if(ch == '('){
        //         if(cnt > 0){
        //             str.append(ch);
        //         }
        //         cnt++;
        //     }else{
        //         cnt--;
        //         if(cnt > 0){
        //             str.append(ch);
        //         }
        //     }
        // } 
        // return str.toString();  

        // Stack Approach
        Stack<Character> st = new Stack<>();
        StringBuilder str = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                if(!st.isEmpty()){
                    str.append(ch);
                }
                st.push(ch);
            }else{
                st.pop();
                if(!st.isEmpty()){
                    str.append(ch);
                }
            }
        }
        return str.toString();
    }
}