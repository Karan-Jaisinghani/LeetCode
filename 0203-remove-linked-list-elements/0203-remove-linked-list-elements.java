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
    public ListNode removeElements(ListNode head, int val) {
    ListNode prev = new ListNode(-1);
    prev.next = head;
    ListNode pres = prev;
    while (pres.next != null) {
     if (pres.next.val == val) {
        pres.next = pres.next.next; 
     } else {
    pres = pres.next;
    }
}
return prev.next;

    }
}