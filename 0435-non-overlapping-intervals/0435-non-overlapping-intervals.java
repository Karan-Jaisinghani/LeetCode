class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals , Comparator.comparingDouble(o->o[1]));
        int count = 1;
        int add = 0;
        for(int i =1;i<intervals.length;i++){
            if(intervals[i][0]>=intervals[add][1]){
                count++;
                add=i;
            }
        }
        return intervals.length - count;
    }
}