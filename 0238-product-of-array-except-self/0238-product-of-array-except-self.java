class Solution {
    public int[] productExceptSelf(int[] nums) {
       int [] arr = new int[nums.length]; 
       int [] arr1 = new int[nums.length]; 
       int ans =1;
       int ans1 = 1;
       for(int i =0;i<nums.length;i++){
        arr[i]=ans;
        ans = nums[i]*ans;
        arr1[nums.length-1-i]=ans1;
        ans1=nums[nums.length-1-i]*ans1;
      }
      for(int i=0;i<nums.length;i++){
        nums[i]=arr[i]*arr1[i];
      }  
      return nums;    
    }
}