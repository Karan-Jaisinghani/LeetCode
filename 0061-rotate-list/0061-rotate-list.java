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
    public ListNode rotateRight(ListNode head, int k) {
        if(k<=0 || head==null || head.next == null){
            return head;
        }
       int l =1;
       ListNode temp = head;
       while(temp.next!=null){
        temp=temp.next;
        l++;
       }
       temp.next=head;
       for(int i =0 ; i< l - (k%l);i++){
        temp = temp.next;
       }
       head = temp.next;
       temp.next = null;
       return head;
        
    }
}