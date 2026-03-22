class Solution {
    public int buyChoco(int[] nums, int money) {
        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<min){
                smin = min;
                min = nums[i];
            }
            else if(nums[i]<smin){
                smin = nums[i];
            }
        }
        int total = min+smin;
        if(total<=money){
            return money-total;
        }
        
        return money;
    }
}