// Last updated: 8/6/2025, 11:53:44 AM
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null|| head.next==null|| k==0){
            return head;
        }
        ListNode cur=head;
        int len=1;
        while(cur.next!=null){
            cur=cur.next;
            len++;
        }
        cur.next=head;
        int steps=len-k%len;
        ListNode tail=head;
        for(int i=1;i<steps;i++){
            tail=tail.next;
        }
        ListNode newHead=tail.next;
        tail.next=null;
        return newHead;
    }
}