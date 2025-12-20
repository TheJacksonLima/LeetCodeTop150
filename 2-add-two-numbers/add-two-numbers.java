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
        ListNode h1 = l1;
        ListNode h2 = l2;
        ListNode h3 = new ListNode();
        ListNode h = h3;
        ListNode tmp;
        
        int r,plusOne=0,h1Value,h2Value,sum;
        while( h1!=null || h2!=null){
            tmp = new ListNode();
           
            if (h1 == null){
              h1Value = 0;
            } 
            else{
              h1Value = h1.val;
            }
            
            if (h2 == null){
              h2Value = 0;
            } 
            else{
              h2Value = h2.val;
            }


            sum = h1Value + h2Value + plusOne;
            if (sum > 9){
                sum = (sum % 10);
                plusOne = 1;
            }
            else{
                plusOne = 0;
            }

            tmp.val = sum;
            h3.next = tmp;
            h3 = h3.next;
            
            if (h1 !=null){
                h1 = h1.next;
            }
            
            if (h2 !=null){
                h2 = h2.next;
            }
        }

        if (plusOne == 1){
            tmp = new ListNode();
            tmp.val = plusOne;
            h3.next = tmp;
        }


        return h.next;
    }
}