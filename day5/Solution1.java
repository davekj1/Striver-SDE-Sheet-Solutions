/*Given the head of a singly linked list, reverse the list, and return the reversed list.*/
class Solution1{
    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode prev=null;
        ListNode next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
       return head;
    }
}
