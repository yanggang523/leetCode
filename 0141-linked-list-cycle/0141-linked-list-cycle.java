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
        ListNode fast = head; 
        // ListNode slow = head;
        HashSet<ListNode> nums = new HashSet<>();

        // if (head == null || head.next == null){
        //     return false; 
        // }

        // fast = fast.next;
        // 중복인지 확인 
        while(fast != null ){
            // if (fast.next == null){
            //     return false;
            // }
            if (nums.contains(fast)){
                return true; 
            }
            nums.add(fast);
            fast = fast.next;
            // if (fast.next != null){
            //     fast = fast.next;
            //     // slow = slow.next;
            // }else{
            //     return false;
            // }

        }
        return false;
    }
}