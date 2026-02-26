class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans [] = new int[nums.length];
        int i=0;
        for(;i<nums.length;i++){
            if(nums[i]>=0){
                break;
            }
        }
        int j = i-1;
        int k=0;
        while(j>=0 && i<nums.length){
            if(nums[i]*nums[i]>nums[j]*nums[j]){
                ans[k]=nums[j]*nums[j];
                j--;
                k++;
            }
            else if(nums[i]*nums[i]<=nums[j]*nums[j]){
                ans[k]=nums[i]*nums[i];
                i++;
                k++;
            }
        }
        while(j>=0){
            ans[k]=nums[j]*nums[j];
                j--;
                k++;
        }
        while(i<nums.length){
            ans[k]=nums[i]*nums[i];
                i++;
                k++;
        }
        return ans;
    }
}