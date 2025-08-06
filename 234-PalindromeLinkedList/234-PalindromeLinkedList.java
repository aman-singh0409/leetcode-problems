// Last updated: 8/6/2025, 11:52:46 AM
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
    public ListNode getMiddle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        ListNode node=null;
        ListNode cur=head;
        while(cur!=null){
            ListNode temp=cur.next;
            cur.next=node;
            node=cur;
            cur=temp;
        }
        return node;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode FHE=getMiddle(head);
        ListNode SHS=reverse(FHE.next);
        ListNode FHS=head;
        while(SHS!=null){
            if(FHS.val!=SHS.val){
                return false;
            }
            FHS=FHS.next;
            SHS=SHS.next;
        }
        return true;
    }
}