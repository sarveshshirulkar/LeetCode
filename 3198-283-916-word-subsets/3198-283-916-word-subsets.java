class Solution {
    public int[] count(String S){
        int[] arr = new int[26];
        for(char c : S.toCharArray()){
            arr[c-'a']++;
        }
        return arr;
    }
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] bmax = new int[26];
        for (String b : words2) {
            int[] bCount = count(b);
            for (int i = 0; i < 26; ++i) {
                bmax[i] = Math.max(bmax[i], bCount[i]);
            }
        }

        List<String> list = new ArrayList<>();
        for(String a : words1){
            int[] aCount = count(a);
            boolean isSubset = true;
            for(int i=0; i<26 ; i++){
                if(aCount[i] < bmax[i]){
                    isSubset = false;
                    break;
                }
            }
            if (isSubset) {
                list.add(a);
            }
        }
        return list;
    }
}