class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int j= s.length-1;
        int i = g.length-1;
        int count =0;
        while (i>=0 && j>=0){
            if(s[j]>=g[i]){
                j--;
                i--;
                count++;
            }
            else{
                i--;
            }
        }
        return count;
        }
}