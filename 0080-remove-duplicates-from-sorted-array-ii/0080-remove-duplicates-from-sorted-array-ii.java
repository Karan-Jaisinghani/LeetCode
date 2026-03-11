class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        int ans =1;
        boolean a = false;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[j] && a == false){
                nums[j+1]=nums[i];
                j++;
                ans++;
                a=true;
            }
            else if(nums[i]==nums[j] && a == true){
                continue;
            }
            else{
                nums[j+1]=nums[i];
                j++;
                ans++;
                a=false;
            }
        }
        return ans;
    }
}