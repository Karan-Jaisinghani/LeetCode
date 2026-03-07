class Solution {
    public boolean lemonadeChange(int[] bills) {
        int f =0;
        int t = 0;
        int tw = 0;
        for(int i =0;i<bills.length;i++){
            if(bills[i]==5){
                f++;
                continue;
            }
            else if(bills[i]==10){
                t++;
                f--;
            }
            else{
                if(t>0 && f>0){
                    t--;
                    f--;
                }
                else{
                    f=f-3;
                }
            }
            if(f<0 || t<0){
                return false;
            }
        }
        return true;
    }
}