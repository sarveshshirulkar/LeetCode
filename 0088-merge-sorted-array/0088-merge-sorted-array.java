class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = m - 1; // Pointer for the end of the actual elements in nums1
        int b = n - 1; // Pointer for the end of nums2
        int c = m + n - 1; // Pointer for the end of nums1 (including the space for nums2 elements)

        // Iterate from the end of nums1 and nums2
        while (a >= 0 && b >= 0) {
            // Place the larger of the two elements at the end of nums1
            if (nums1[a] > nums2[b]) {
                nums1[c] = nums1[a];
                a--;
            } else {
                nums1[c] = nums2[b];
                b--;
            }
            c--;
        }

        // If there are any remaining elements in nums2, place them in nums1
        while (b >= 0) {
            nums1[c] = nums2[b];
            b--;
            c--;
        }
    }
}
