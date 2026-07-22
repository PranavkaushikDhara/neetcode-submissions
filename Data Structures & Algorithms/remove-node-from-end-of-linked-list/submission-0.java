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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }
        ListNode tail = reverse(head);
        ListNode curr = tail, prev = null;
        
        int count = 1;
        if(n==1){
            return reverse(tail.next);
        }
        while(count< n ){
            count+=1;
            prev = curr;
            curr = curr.next;
        }
        prev.next = curr.next;

        return reverse(tail);

    }

    public ListNode reverse(ListNode node){
        ListNode curr = node, prev = null, next = node;
        while(curr!=null){
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        return prev;
    }
}
