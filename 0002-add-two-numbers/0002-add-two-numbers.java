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

 // 새로운 목표: 무조건 재귀 1회 이상 사용 
class Solution {
    ListNode dummy = new ListNode(0); // 여기를 옮겨야만 (수정 예정)
    ListNode ans = dummy;
    ListNode a = new ListNode(0);
    ListNode b = new ListNode(0);

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        a.next = l1;
        b.next = l2;
        if (plusNode(0) == 1){
            ans.next = new ListNode(1);
            return dummy.next;
        }else{
            return dummy.next;
        }
    }

    // private class Result{
    //     ListNode a;
    //     ListNode b;
    //     int carry;

    //     public Result(ListNode a, ListNode b, int carry){
    //         this.a = a;
    //         this.b = b;
    //         this.carry = carry;
    //     }

    // }

    public int plusNode(int carry){ 
        int sum = 0; // 나중에 옮기기 -> 옮기면 안돼!
        if (a.next == null || b.next == null){ // 한쪽 노드가 이미 끝난 경우 
            if(a.next == null && b.next == null){
                return carry; 
            }else if(a.next == null){
                sum = b.next.val + carry; 
                b = b.next;
                ans.next = new ListNode(sum % 10);
                ans = ans.next;
                return plusNode(sum / 10);
            }else{ // b.next == null
                sum = a.next.val + carry;
                a = a.next; 
                ans.next = new ListNode(sum % 10);
                ans = ans.next;
                return plusNode(sum / 10);
            }

        }else{
            sum = a.next.val + b.next.val + carry;

            if (sum / 10 == 1){ // 받아올림 상황
                ans.next = new ListNode(sum % 10);
                ans = ans.next; 
                a = a.next;
                b = b.next;
                return plusNode(1);
            }else{ // 받아올림 아님 상황
                ans.next = new ListNode(sum % 10);
                ans = ans.next;
                a = a.next;
                b = b.next;
                return plusNode(0);
            }
        }        
    }
}