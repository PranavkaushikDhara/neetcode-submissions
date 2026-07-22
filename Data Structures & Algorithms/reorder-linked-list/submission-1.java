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
    public void reorderList(ListNode head) {
        if(head == null){
            return;
        }
       
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
       
        ListNode tail = reverse(slow.next);

        ListNode curr = head;
        ListNode next = curr.next;
        while(curr!=null){
            next = curr.next;
            curr.next=tail;
            tail=next;
            curr = curr.next;
        }

        
    }

    public ListNode reverse(ListNode node){
        if(node == null){
            return node;
        }
        ListNode curr = node, next = node, prev = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
