class Solution {
    public int minimumCost(int[] cost) {
        int ans =0;
        int k=0;
        Arrays.sort(cost);
        for(int i=cost.length-1;i>=0;i--){
            k++;
            if(k%3==0){
                continue;
            }
            ans=ans+cost[i];
        }
        return ans;
    }
}