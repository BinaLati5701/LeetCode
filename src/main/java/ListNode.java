import java.util.List;

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

public class ListNode {
    int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

          /* a dummy first node to hang the result on */
        ListNode dummy = new ListNode(0);

        /* tail points to the last result node */
        ListNode tail = dummy;
        while(true){
            /* if either list runs out,  use the other list */
            if(l1 == null){
                tail.next = l2;
                break;
            }
            if(l2 == null){
                tail.next = l1;
                break;
            }

            /* Compare the value of the two
        lists whichever lists' value is
        smaller, append it into tail and
        advance the head to the next Node
        */
            if(l1.val <= l2.val){
                tail.next = l1;
                l1 = l1.next;
            }
            else{
                tail.next = l2;
                l2 = l2.next;
            }

            /* Advance the tail */
            tail = tail.next;
        }
        return dummy.next;

    }

}
