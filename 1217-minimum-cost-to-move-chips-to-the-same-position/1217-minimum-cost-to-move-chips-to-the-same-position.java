class Solution {
    public int minCostToMoveChips(int[] pos) {
        int even = 0;
        for(int i=0;i<pos.length;i++){
            if(pos[i]%2==0){
                even++;
            }
        }
        return Math.min(even , pos.length-even);
    }
}