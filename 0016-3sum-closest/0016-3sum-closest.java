class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
       int sum1 =0;
       int maxdif = Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            if( i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int l = i+1;
            int r = nums.length-1;
            
            while(l<r){
                int ans = nums[l]+nums[r]+nums[i];
                int diff = Math.abs(ans - target);
                if(diff<maxdif){
                    maxdif=diff;
                    sum1=ans;
                }
                if(ans == target){
                    
                    return ans;
                    
                }
                else if(ans<target){
                    l++;
                }
                else{
                    r--;
                }
            }
            
        }
        return sum1;
    }
}