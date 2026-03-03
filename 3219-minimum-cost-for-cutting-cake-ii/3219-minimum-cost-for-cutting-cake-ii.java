class Solution {
    public long minimumCost(int m, int n, int[] hcut, int[] vcut) {
        Arrays.sort(hcut);
        Arrays.sort(vcut);
        for (int i = 0; i < vcut.length / 2; i++) {
            int temp = vcut[i];
            vcut[i] = vcut[vcut.length - 1 - i];
            vcut[vcut.length - 1 - i] = temp;
        }
        for (int i = 0; i < hcut.length / 2; i++) {
            int temp = hcut[i];
            hcut[i] = hcut[hcut.length - 1 - i];
            hcut[hcut.length - 1 - i] = temp;
        }
        long cost = 0;
        int i=0;
        int j=0;
        int v=1;
        int h=1;
        while(i<vcut.length && j<hcut.length){
            if(vcut[i]>=hcut[j]){
                cost = cost + vcut[i]*v;
                i++;
                h++;
            }
            else{
                cost = cost + hcut[j]*h;
                j++;
                v++;
            }
        }
        while(i<vcut.length){
             cost = cost + vcut[i]*v;
                i++;
                h++;
        }
        while(j<hcut.length){
            cost = cost + hcut[j]*h;
                j++;
                v++;
        }
        return cost;
    }
}