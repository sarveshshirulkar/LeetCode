class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder str = new StringBuilder(s);

        while(str.indexOf(part) != -1){
            int start = str.indexOf(part);
            str.delete(start, start+part.length());
        }
        return str.toString();
    }
}