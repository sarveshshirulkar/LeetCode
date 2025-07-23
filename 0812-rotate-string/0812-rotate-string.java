class Solution {
    public boolean rotateString(String s, String goal) {
        String str = s + s;
        return str.contains(goal) && s.length() == goal.length();
    }
}