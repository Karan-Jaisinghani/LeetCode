class Solution {
    public int[] productExceptSelf(int[] nums) {
       int [] arr = new int[nums.length]; 
       int [] arr1 = new int[nums.length]; 
       arr[0]=1;
       arr1[nums.length-1]=1;
       for(int i =1;i<nums.length;i++){
        arr[i]=nums[i-1]*arr[i-1];
        arr1[nums.length-1-i]=nums[nums.length-i]*arr1[nums.length-i];
      }
      for(int i=0;i<nums.length;i++){
        nums[i]=arr[i]*arr1[i];
      }  
      return nums;    
    }
}