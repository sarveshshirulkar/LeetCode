class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = Arrays.stream(nums).max().getAsInt();
        int left = 0;
        long maxiOccurence = 0;
        long res = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == max) maxiOccurence++;
            while (maxiOccurence >= k) {
                if (nums[left] == max) maxiOccurence--;
                left++;
            }
            res += left;
        }
        return res;
    }
}