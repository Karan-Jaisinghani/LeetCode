class Solution {
    public int pivotIndex(int[] nums) {
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            ans = ans + nums[i];
            nums[i] = ans;
        }
        for(int i=0;i<nums.length;i++){
            if(i==0){
                if(nums[nums.length-1]-nums[i]==0){
                return 0;}
                continue;
            }
            if(nums[i-1]==nums[nums.length-1]-nums[i]){
                return i;
            }
        }
        return -1;
    }
}