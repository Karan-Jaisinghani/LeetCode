class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = sq(slow);
            fast = sq(sq(fast));
        }
        while(slow!=fast);
        return slow==1;
    }
     public static int sq(int n){
        int ans = 0;
        while(n>0){
            ans = ans + (n%10)*(n%10);
            n=n/10;
        }
        return ans;
     }
}