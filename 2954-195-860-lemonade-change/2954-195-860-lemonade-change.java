class Solution {
    public boolean lemonadeChange(int[] bills) {
        int count5=0, count10=0;
        boolean flag = true;
        for(int i=0; i<bills.length; i++){
            if(bills[i] == 5){
                count5++;
            }else if(bills[i] == 10){
                count10++;
                count5--;
            }else if(bills[i] == 20){
                if(count10 == 0){
                    count5 -= 3;
                }else{
                    count10--;
                    count5--;
                }
            }
            if(count10 < 0 || count5 < 0){
                flag = false;
                break;
            }
        }
        return flag;
    }
}