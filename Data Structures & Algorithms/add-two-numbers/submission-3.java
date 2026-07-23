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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0, carry = 0;
        ListNode dummy = new ListNode();
        ListNode ans = dummy;
        ListNode curr1 = l1, curr2 = l2;
        while(curr1!=null && curr2!=null){
            sum = curr1.val + curr2.val + carry;
            dummy.next = new ListNode(sum%10);
            carry = sum/10;
            curr1 = curr1.next;
            curr2 = curr2.next;
            dummy = dummy.next;
        }
        if(curr1!=null || curr2!=null){
            while(curr1!=null){
                sum = curr1.val + carry;
                carry = sum/10;
                dummy.next = new ListNode(sum%10);
                curr1 = curr1.next;
                dummy = dummy.next;
            }
            while(curr2!=null){
                sum = curr2.val + carry;
                carry = sum/10;
                dummy.next = new ListNode(sum%10);
                curr2 = curr2.next;
                dummy = dummy.next;
            }
        }
        if(carry!=0){
            dummy.next = new ListNode(carry);
        }
        return ans.next;
    }

    public ListNode reverse(ListNode node){
        if(node == null){
            return null;
        }
        ListNode curr = node, prev = null, next = curr.next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
