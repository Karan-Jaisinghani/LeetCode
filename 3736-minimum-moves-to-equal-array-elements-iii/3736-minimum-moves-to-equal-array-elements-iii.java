class Solution {
    public int minMoves(int[] nums) {
        int k =0;
        int ans =0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]>k){
                k=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            ans = ans + k - nums[i];
        }
        return ans;
    }
}