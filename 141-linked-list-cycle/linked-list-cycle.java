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
    public boolean hasCycle(ListNode head) {
        /*
        Set<ListNode> visited = new HashSet<>();
        ListNode h1 = head;

        while(h1 != null){
            if (!visited.add(h1)){
                 return true;
            }
            h1 = h1.next;

        }

        return false;
        */

        if ((head == null) || (head.next == null)){
                return false;
        }

        ListNode h1 = head;
        ListNode h2 = head.next;
        
        while (h2 != null && h2.next != null){
            h1 = h1.next;
            h2 = h2.next.next;
            
            if (h1 == h2){
                return true;
            }
        }

        return false;
    }
}