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
        HashSet<ListNode> numTable = new HashSet<>();        
        ListNode current = head;
        int index = 0;
        while(current != null){
            if (numTable.contains(current)){
                return true; 
            }
            numTable.add(current);
            current = current.next; 
        }
        return false;
    }
}