class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        List<List<Integer>> ls = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;
        for(int i=0; i<n-1; i++){
            minDiff = Math.min(minDiff, arr[i+1] - arr[i]);
        }
        for(int i=0; i<n-1; i++){
            if((arr[i+1] - arr[i]) == minDiff) ls.add(Arrays.asList(arr[i], arr[i+1]));
        }
        return ls;
    }
}