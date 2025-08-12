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
        ListNode node = new ListNode(0);
        ListNode newList = node;

        while(list1 != null && list2 != null){
             if (list2.val >= list1.val){
                 newList.next = list1;
                 list1 = list1.next;
             }
             else{
                newList.next = list2;
                list2 = list2.next;
            }
            newList = newList.next;
        }
        
        if(list1 == null){
            newList.next = list2;
        }
        else{
            newList.next = list1;
        }

        return node.next;
    }
}