class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1, j = n-1, k = m+n-1;
        if (n==1&&m==0){
            nums1[0]=nums2[0];
            return;
        }
        while(k>=0&&i>=0&&j>=0){
            nums1[k--]= (nums1[i]>nums2[j])?nums1[i--]:nums2[j--];
        }
        while(j>=0&&i<0){
            nums1[k--] = nums2[j--];
        }


    }
            


} 
