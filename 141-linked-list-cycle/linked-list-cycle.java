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
        Set<ListNode> visited = new HashSet<>();
        ListNode h1 = head;

        while(h1 != null){
            if (!visited.add(h1)){
                 return true;
            }
            h1 = h1.next;

        }

        return false;
        
    }
}