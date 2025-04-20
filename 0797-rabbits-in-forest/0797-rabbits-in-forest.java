class Solution {
    public int numRabbits(int[] answers) {
        int[] arr = new int[1001];
        int cnt = 0;
        for(int i=0; i<answers.length; i++){
            arr[answers[i]]++;
        }
        for(int i=1; i<arr.length; i++){
            if(arr[i] > 0){
                cnt += ((arr[i] + i) / (i + 1)) * (i + 1);
            }
        }
        return cnt + arr[0];
    }
}