class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans= new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if( i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int l = i+1;
            int r = nums.length-1;
            
            while(l<r){
                int sum = -1*nums[i];
                if(nums[l]+nums[r]==sum){
                    List<Integer> ans1 = new ArrayList<>();
                    ans1.add(nums[l]);
                    ans1.add(nums[r]);
                    ans1.add(-1*sum);
                    ans.add(ans1);
                   
                    l++;
                    while(nums[l]==nums[l-1] && l<r){
                        l++;
                    }
                    
                }
                else if(nums[l]+nums[r]<sum){
                    l++;
                }
                else{
                    r--;
                }
            }
            
        }
        return ans;
    }
}