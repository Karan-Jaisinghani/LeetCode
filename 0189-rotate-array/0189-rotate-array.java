class Solution {
    public void rotate(int[] nums, int k) {
        int [] arr = new int[nums.length];
        int n =k%nums.length;
        int i = nums.length-n;
        for(int j=0;j<n;j++){
            arr[j]=nums[i];
            i++;
        }
        i=0;
        for(int j=n;j<nums.length;j++){
            arr[j]=nums[i];
            i++;
        }
        for(int l=0;l<nums.length;l++){
            nums[l]=arr[l];
        }
    }
}