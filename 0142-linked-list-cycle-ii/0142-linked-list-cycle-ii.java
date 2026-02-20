/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode start = head;
        ListNode f = head;
        ListNode s = head;
        while (f!=null && f.next!=null){
            f = f.next.next;
            s = s.next;
            if(f==s){
               ListNode temp = head;
               while(f!=temp){
                temp = temp.next;
                f = f.next;
               }
               return temp;  
            
            }
        }
        return null;
    }
}