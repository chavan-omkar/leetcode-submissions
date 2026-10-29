/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode d1 = headA;
        ListNode d2 = headB;


        // Map<ListNode,Integer>map = new HashMap<>();
        Set<ListNode>visited = new HashSet<>();

        while(d1 != null){
            visited.add(d1);
            d1 = d1.next;
        }

        while(d2 != null){
             
            if(visited.contains(d2)){
                return d2;
            }
            d2 = d2.next;
        }

        return null;
        
    }
}
