class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Long> set = new HashSet<>();
        for(int n : nums){
            if(n>0){
                set.add((long)n);
            }
        }
        long i =1;
        while(true){
            if(!set.contains(i)){
                break;
            }
            i++;
        }
        return (int)i;
    }
}