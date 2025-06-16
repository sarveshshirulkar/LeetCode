class Solution {
    public int[] replaceElements(int[] arr) {
        int[] greatestArr = new int[arr.length];
        greatestArr[arr.length - 1] = -1;
        int currrGreatest = -1;
        for(int i = arr.length - 1; i>=0; i--){
            greatestArr[i] = currrGreatest;
            currrGreatest = Math.max(currrGreatest, arr[i]);
        }
        return greatestArr;
    }
}