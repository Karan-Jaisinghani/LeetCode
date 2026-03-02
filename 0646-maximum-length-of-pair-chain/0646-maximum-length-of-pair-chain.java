class Solution {
    public int findLongestChain(int[][] intervals) {
        Arrays.sort(intervals , Comparator.comparingDouble(o->o[1]));
        int count = 1;
        int add = intervals[0][1];
        for(int i =1;i<intervals.length;i++){
            if(intervals[i][0]>add){
                count++;
                add=intervals[i][1];
            }
        }
        return count;
    }
}