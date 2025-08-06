// Last updated: 8/6/2025, 11:54:11 AM
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
        if(head==null){
            return null;
        }
        int size=0;
        ListNode curr=head;
        while(curr!=null){
            curr=curr.next;
            size++;
        }
        if(size==n){
            return head.next;
        }
        ListNode prev=getNode(head, size-n-1);
        ListNode currr=prev.next;
        prev.next=currr.next;
        currr.next=null;
        size--;
        return head;
    }
    public ListNode getNode(ListNode head, int n){
        ListNode temp=head;
        for(int i=0;i<n;i++){
            temp=temp.next;
        }
        return temp;
    }
}