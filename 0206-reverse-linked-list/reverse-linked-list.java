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
    public ListNode reverseList(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        ListNode newHead = reverseList(head.next);
        ListNode frontNode = head.next;
        frontNode.next = head;
        head.next = null;
        return newHead;


        // if(head == null){
        //     return head;
        // }
        // ListNode prev = null;
        // ListNode curr = head;

        // while(curr != null){
        //     ListNode temp = curr.next;
        //     curr.next = prev;
        //     prev = curr;
        //     curr = temp;
        // }

        // return prev;

        // Stack<ListNode> stack = new Stack<>();
        // ListNode dummy = new ListNode(0);
        // ListNode current = dummy;
        // while (head != null) {
        //     stack.push(head);
        //     head = head.next;
        // }

        // while (!stack.isEmpty()) {
        //     ListNode node = stack.pop();
        //     current.next = node;
        //     current = current.next;
        //     // dummy = dummy.next;
        // }
        // current.next = null;
        // return dummy.next;

    }
}
