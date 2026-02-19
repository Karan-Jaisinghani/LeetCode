class Solution {
    public boolean isPowerOfThree(int n) {
        double k=(double)n;
        while(k>=3){
            k=k/3;
        }
        return (k==1);
    }
}