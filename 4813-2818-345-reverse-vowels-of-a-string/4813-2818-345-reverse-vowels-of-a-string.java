class Solution {
    public boolean isVowel(char c){
        return c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u' ||
        c == 'A' ||c == 'E' || c == 'I' ||c == 'O' ||c == 'U';
    }
    public String reverseVowels(String s) {
        StringBuilder str = new StringBuilder(s);
        int start = 0, end = s.length()-1;
        while(start < end){
            char startChar = str.charAt(start);
            char endChar = str.charAt(end);
            if(isVowel(startChar) && isVowel(endChar)){
                str.setCharAt(start, endChar);
                str.setCharAt(end, startChar);
                start++;
                end--;
            }else if(isVowel(startChar) && !isVowel(endChar)){
                end--;
            }else if(!isVowel(startChar) && isVowel(endChar)){
                start++;
            }else{
                start++;
                end--;
            }
        }
        return str.toString();
    }
}