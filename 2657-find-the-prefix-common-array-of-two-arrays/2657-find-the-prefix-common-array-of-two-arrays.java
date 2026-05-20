class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Set<Integer> mpA = new HashSet<>();
        Set<Integer> mpB = new HashSet<>();
        int n = A.length;
        int[] ans = new int[n];
        int common = 0;
        for (int i = 0; i < n; i++) {
            mpA.add(A[i]);
            mpB.add(B[i]);
            if (A[i] == B[i]) {
                common++;
            } else {
                if (mpA.contains(B[i])) {
                    common++;
                }
                if (mpB.contains(A[i])) {
                    common++;
                }
            }

            ans[i] = common;
        }
        return ans;
    }
}