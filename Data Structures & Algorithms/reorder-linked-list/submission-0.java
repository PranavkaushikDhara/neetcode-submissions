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
        int length = 0, count=0;
        ListNode curr = head;
        while(curr != null){
            length+=1;
            curr=curr.next;
        }
        curr = head;
        while(count%2!=0? count<=length/2: count<=(length/2)-1){
            curr=curr.next;
            count+=1;
        }
        ListNode tail = reverse(curr);

        curr = head;
        ListNode next=curr.next;
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
