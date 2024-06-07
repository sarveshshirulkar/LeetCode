class Solution {
    public String interpret(String command) {
        int i=0;
        StringBuilder ans = new StringBuilder();
        while(i<command.length()){
            if(command.charAt(i) == 'G'){
                ans.append("G");
                i++;
            }else{
                if(command.charAt(i) == '('){
                    if(command.charAt(i+1) == ')'){
                        ans.append("o");
                        i+=2;
                    }else{
                        ans.append("al");
                        i+=4;
                    }
                }
            }
        }
        return ans.toString();

        // return command.replace("()","o").replace("(al)","al");
    }
}