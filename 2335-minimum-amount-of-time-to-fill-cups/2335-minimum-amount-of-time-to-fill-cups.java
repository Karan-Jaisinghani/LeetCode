class Solution {
    public int fillCups(int[] nums) {
        Arrays.sort(nums);
        int ans =0;
        while(nums[0]+nums[1]>nums[2]){
            nums[0]--;
            nums[1]--;
            ans++;
        }
        return nums[2]+ans;
    }
}