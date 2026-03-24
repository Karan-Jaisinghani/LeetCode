class Solution {
    public int maximumUnits(int[][] arr, int truckSize) {
        int ans = 0;
        Arrays.sort(arr, (a, b) -> Integer.compare(b[1], a[1]));
        for(int i =0;i<arr.length;i++){
            if(truckSize==0){
                return ans;
            }
            if(arr[i][0]<=truckSize){
                ans = ans+ arr[i][0]*arr[i][1];
                truckSize = truckSize - arr[i][0];
            }
            else{
                ans = ans + truckSize*arr[i][1];
                return ans;
            }
        }
        return ans;
    }
}