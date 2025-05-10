class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        // if possible
        // arr with less zeo cnt: array sum + no pf zeros

        //not possible
        // no of zero diff > sum diff return -1

        long sum1 = 0, sum2 = 0, cnt1 = 0, cnt2 = 0;
        for(int i=0; i<nums1.length; i++){
            sum1 += nums1[i];
            if(nums1[i] == 0) cnt1++;
        }
        for(int i=0; i<nums2.length; i++){
            sum2 += nums2[i];
            if(nums2[i] == 0) cnt2++;
        }

        if ((cnt1 == 0 && sum2+cnt2 > sum1+cnt1) || (cnt2 == 0 && sum1+cnt1 > sum2+cnt2)) {
            return -1;
        }

        return Math.max(sum1+cnt1, sum2+cnt2);
    }
}