class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // List<Integer> ls = new ArrayList<>();
        // Map<Integer, Integer> mp = new HashMap<>();

        // for(int i=0; i<nums.length; i++){
        //     mp.put(nums[i], mp.getOrDefault(nums[i] ,0) +1);
        // }
        // for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
        //     if(entry.getValue() > nums.length / 3){
        //         ls.add(entry.getKey());
        //     }
        // }
        // return ls;

        // Boyer-Moore Voting Algo
        int ele1 = 0, ele2 =0;
        int cnt1 = 0, cnt2 = 0;
        List<Integer> ls = new ArrayList<>();

        for(int num : nums){
            if(num == ele1){
                cnt1++;
            }else if(num == ele2){
                cnt2++;
            }else if(cnt1 == 0){
                cnt1 = 1;
                ele1 = num;
            }else if(cnt2 == 0){
                cnt2 = 1;
                ele2 = num;
            }else{
                cnt1--;
                cnt2--;
            }
        }

        // second pass to check if two most freq no's have freq > n/3
        cnt1=0; cnt2=0;
        for(int num : nums){
            if(num == ele1) cnt1++;
            else if(num == ele2) cnt2++;
        }
        
        if(cnt1 > nums.length/3) ls.add(ele1);
        if(cnt2 > nums.length/3) ls.add(ele2);
        return ls;
    }
}