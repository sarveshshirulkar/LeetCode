class Solution {
    public int minimumIndex(List<Integer> nums) {
        
      int currentCnt = 1, domCnt = 0, currentDomCnt = 0;
      int dominant = nums.get(0);

    // finding dominant in O(n)
      for(int i=1; i<nums.size(); i++){
        if(nums.get(i) == dominant) currentCnt++;
        else{
            // currentCnt--;
            if(--currentCnt == 0){
                dominant = nums.get(i);
                currentCnt = 1;
            }
        }
      }

    // count of dominant no.
      for(int num : nums){
        if(num == dominant) domCnt++;
      }
    //   System.out.println(dominant);
    //   System.out.println(domCnt);
    
    for(int i=0; i<nums.size(); i++){
        if(nums.get(i) == dominant) currentDomCnt++;
        if((currentDomCnt*2 > i+1) && ((domCnt - currentDomCnt)*2 > (nums.size()-i-1))){
            return i;
        }
    }
    return -1;
    }
}