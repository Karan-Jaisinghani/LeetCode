class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(nums[nums.length-1]);
        int a = 0;
        for(int i=nums.length-2;i>=0 && a<k-1 ;i--){
            if(nums[i]!=arr.get(a)){
                arr.add(nums[i]);
                a++;
            }
        }
        int [] ans = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            ans[i]= arr.get(i);
        }
        return ans;
    }
}