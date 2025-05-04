class Solution {

    public int numEquivDominoPairs(int[][] dominoes) {
        int[] arr = new int[100];
        int cnt = 0;
        for (int[] domino : dominoes) {
            int val = domino[0] < domino[1] ? domino[0] * 10 + domino[1] : domino[1] * 10 + domino[0];
            cnt += arr[val];
            arr[val]++;
        }
        return cnt;
    }
}
