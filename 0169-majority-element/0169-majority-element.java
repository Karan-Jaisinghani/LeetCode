class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer , Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        Set<Integer> ks = hm.keySet();
        for(Integer key : ks){
            if(hm.get(key)>nums.length/2){
                 return key.intValue();
            }
        }
        return 0;
    }
}