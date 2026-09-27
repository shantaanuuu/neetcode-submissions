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


    
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode dummy = new ListNode(0,head);
        ListNode groupprev = dummy;

        while(true){
            ListNode kth = getk(groupprev,k);
            if(kth == null) break;
            
            ListNode grpnext = kth.next;

            ListNode prev = kth.next;
            ListNode curr = groupprev.next;

            while(curr!=grpnext){
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            ListNode temp = groupprev.next;
            groupprev.next = kth;
            groupprev = temp;
        
        }
        return dummy.next;


    }


    private ListNode getk(ListNode curr,int k){
        while(curr!=null && k>0){
            curr= curr.next;
            k--;

        }
        return curr;
    }
}
