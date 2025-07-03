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
        ListNode ptr1 = headA;
        ListNode ptr2 = headB;

        if (ptr1 == null || ptr2 == null)
            return null;

        while (ptr1 != ptr2) {
        
        // Move to the next node in each list and if the one 
        // pointer reaches NULL, start from the other linked list
            ptr1 = (ptr1 != null) ? ptr1.next : headB;
            ptr2 = (ptr2 != null) ? ptr2.next : headA;

            
        }
        //return null;
        return ptr1;
    }
}