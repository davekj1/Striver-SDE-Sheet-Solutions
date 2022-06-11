/*Given the head of a linked list, remove the nth node from the end of the list and return its head.*/
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
class Solution4{
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode start1=head;
       ListNode start2=head;
       for(int i=0;i<n;i++){
           start1=start1.next;
       }
       if(start1==null){
           return head.next;
       }
       while(start1.next!=null){
           start1=start1.next;
           start2=start2.next;
       }
       start2.next=start2.next.next;
       return head;
    }
}