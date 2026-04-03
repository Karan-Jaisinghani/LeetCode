class Solution {
    public boolean isPowerOfFour(int n) {
         double k=(double)n;
        while(k>=4){
            k=k/4;
        }
        return (k==1);
    }
}