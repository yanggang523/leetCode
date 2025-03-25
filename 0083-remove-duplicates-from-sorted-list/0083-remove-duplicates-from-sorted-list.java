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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null){
            return head;
        }
        // int preNode = head.val;
        ListNode dummy = new ListNode(-111, head);
        dummy.next = head; 
        ListNode bef = head;
        ListNode point = head.next;
        // ListNode aft = head;
        while(point != null ){
            if (bef.val == point.val){
                // bef.next = point.next;
                point = point.next;
            }else{
                // 앞으로 이동 
                bef.next = point;
                point = point.next; 
                bef = bef.next;
            }
        }
        bef.next = null;
        return dummy.next;
        
    }
}