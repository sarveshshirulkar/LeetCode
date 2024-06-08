class Solution {
    public String reverseStr(String s, int k) {
        char[] charArray = s.toCharArray();
        
        for (int start = 0; start < charArray.length; start += 2 * k) {
            int end = Math.min(start + k - 1, charArray.length - 1);
            reverse(charArray, start, end);
        }
        
        return new String(charArray);
    }

    private void reverse(char[] charArray, int start, int end) {
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
    }
}
