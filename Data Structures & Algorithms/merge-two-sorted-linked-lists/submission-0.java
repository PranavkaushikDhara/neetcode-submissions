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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head;
        ListNode curr1=list1, curr2=list2;

        if(list1 == null || list2 == null){
                if(list1==null){
                    return list2;
                }
                else return list1;
        }
        if(list1.val <= list2.val){
            head = list1;
            curr1 = curr1.next;
        }
        else{
            head = list2;
            curr2 = curr2.next;
        }
        ListNode joiner = head;
        while(curr1!=null && curr2!=null){
            if(curr1.val > curr2.val){
                joiner.next = curr2;
                curr2 = curr2.next;
                joiner = joiner.next;
            }
            else{
                joiner.next = curr1;
                curr1 = curr1.next;
                joiner = joiner.next;
            }
        }
        if(curr1==null){
            joiner.next=curr2;
        }
        if(curr2==null){
            joiner.next=curr1;
        }
        
        return head;
    }
}