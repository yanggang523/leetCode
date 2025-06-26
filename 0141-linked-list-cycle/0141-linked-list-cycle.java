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
        if (head == null){
            return false;
        }
        if (head.next == null){
            return false; 
        }
        ListNode fast = head.next;
        ListNode slow = head; 
        // int fastNow = fast.val;
        // int slowNow = slow.val; 
        while (slow != fast){
            if (slow.next == null || fast.next == null || fast.next.next == null){
                return false; 
            }
            slow = slow.next;
            fast = fast.next.next;
            // slowNow = slow.val;
            // fastNow = fast.val;
        }
        return true;
    }
}