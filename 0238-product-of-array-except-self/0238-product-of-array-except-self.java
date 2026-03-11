class Solution {
    public int[] productExceptSelf(int[] nums) {
       int [] arr = new int[nums.length]; 
       int [] arr1 = new int[nums.length]; 
       int x = nums.length;
       arr[0]=1;
       arr1[x-1]=1;
       for(int i =1;i<x;i++){
        arr[i]=nums[i-1]*arr[i-1];
      }
      for(int i=x-2;i>=0;i--){
        arr1[i]=nums[i+1]*arr1[i+1];
      }
      for(int i=0;i<x;i++){
        nums[i]=arr[i]*arr1[i];
      }  
      return nums;    
    }
}