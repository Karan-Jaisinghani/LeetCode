class Solution {
    public int minimumPairRemoval(int[] nums) {
        boolean isSorted = true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]<nums[i]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            return 0;
        }

        ListNode a = new ListNode(nums[0]);
        ListNode curr = a;
        int ans =0;
        int min = Integer.MAX_VALUE;
        ListNode sum = null;
        for(int i = 1;i<nums.length;i++){
            ListNode temp = new ListNode();
            curr.next=temp;
            temp.val = nums[i];
            curr=temp;
        }
        curr = a;
        while(a.next.next!=null){
            boolean sort = true;
            while (curr.next != null) {
            if (curr.val > curr.next.val) {
                sort = false; 
            }
            curr = curr.next;
        }
        curr = a;
        if(sort){
            return ans;
        }
            ListNode temp = a;
            ListNode pres = a.next;
            while(pres!=null){
                if(temp.val+pres.val<min){
                    min = temp.val+pres.val;
                    sum = temp;
                }
                temp=pres;
                pres=pres.next;

            }

            sum.val = sum.val + sum.next.val;
            sum.next=sum.next.next;
            ans+=1;
            sum = a;
            min = Integer.MAX_VALUE;
            }
        if(a.val>a.next.val){
           ans++;
        }
        return ans;

    }
}