/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode a = head.next;
        ListNode prev = null;
        int sum = 0;
        while(a!=null){
            if(a.val==0){
                ListNode temp = new ListNode();
                temp.val = sum;
                if(prev!=null){
                    prev.next=temp;
                }
                else{
                    head=temp;
                }
                prev=temp;
                sum=0;
            }
            else{
                sum = sum+ a.val;
            }
            a=a.next;

        }
        prev.next=null;
        return head;
    }
}