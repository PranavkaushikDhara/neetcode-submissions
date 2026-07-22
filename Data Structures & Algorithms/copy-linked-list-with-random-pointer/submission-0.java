/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> hm = new HashMap<>();
        Node curr = head;
        if(head == null){
            return null;
        }
        while(curr!=null){
            Node newNode = new Node(curr.val);
            hm.put(curr,newNode);
            curr = curr.next;
        }

        curr = head;
        Node ans = hm.get(head), sol = ans;
        while(curr!=null){
            ans.next = hm.get(curr.next);
            ans.random = hm.get(curr.random);
            curr = curr.next;
            ans = ans.next;
        }

        return sol;
    }
}
