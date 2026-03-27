class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum =0;
        int ans = 0;
        int k =0;
        for(int num : apple){
            sum+= num;
        }
        Arrays.sort(capacity);
        for(int i=capacity.length-1;i>=0;i--){
            ans = ans + capacity[i];
            k++;
            if(ans>=sum){
                break;
            }
        }
        return k;
    }
}