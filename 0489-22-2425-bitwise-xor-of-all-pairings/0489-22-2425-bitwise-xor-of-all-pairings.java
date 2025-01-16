class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int ans = 0;
        if((len1 & 1) == 0 && (len2&1) == 0){
            return 0;
        }else if((len2&1) == 0){
            for(int i=0; i<len2; i++){
                ans ^= nums2[i];
            }
            return ans;
        }else if((len1&1) == 0){
            for(int i=0; i<len1; i++){
                ans ^= nums1[i];
            }
            return ans;
        }else{
            for(int i=0; i<len1; i++){
                ans ^= nums1[i];
            }
            for(int i=0; i<len2; i++){
                ans ^= nums2[i];
            }
            return ans;
        }  
    }
}