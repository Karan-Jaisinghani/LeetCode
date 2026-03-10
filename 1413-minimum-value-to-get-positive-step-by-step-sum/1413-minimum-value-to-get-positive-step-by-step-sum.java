class Solution {
    public int minStartValue(int[] nums) {
        int ans =0;
        int low =101;
        for(int i=0;i<nums.length;i++){
            ans = ans + nums[i];
            nums[i]=ans;
            if(nums[i]<low){
                low=nums[i];
            }
        }
        if(low<0){
            return (low-1)*-1;
        }
        return 1;
    }
}