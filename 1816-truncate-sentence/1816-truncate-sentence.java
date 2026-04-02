class Solution {
    public String truncateSentence(String s, int k) {
        String [] ans = s.split(" ");
        String a = "";
        for(int i=0;i<k;i++){
            a+=ans[i];
            if(i==k-1){
                break;
            }
            a+= " ";

        }
        return a;
    }
}