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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int nn = 0;
        ListNode cur = head;
        while(cur!=null){
            cur = cur.next;
            nn++;
        }

        int idx = nn-n;
        if(idx == 0) return head.next;

        cur = head;

        for(int i = 0; i<nn -1; i++){
            if((i+1) == idx){
                cur.next = cur.next.next;
            }

            cur = cur.next;
        }
        return head;



    }
}
