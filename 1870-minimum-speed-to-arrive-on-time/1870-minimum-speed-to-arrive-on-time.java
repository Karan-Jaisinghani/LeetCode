class Solution {
    public int minSpeedOnTime(int[] nums, double k) {
        if(k<=nums.length-1) return -1;
        int max = 0;
        int res = 0;
        double l = 1;
        double r = 10000000;
        while(l<=r){
            double count =0;
            int mid =(int)(r - (r - l)/2);
            for(int i=0;i<nums.length-1;i++){
                count = count + Math.ceil((double)nums[i]/mid);
            }
            if(count+((double)nums[nums.length-1]/mid)<=k){
                res=mid;
                r = mid -1;
            }
            else{
                l = mid+1;
            }
        }
        if(res==0){
            return -1;
        }
        return res;
    }
}