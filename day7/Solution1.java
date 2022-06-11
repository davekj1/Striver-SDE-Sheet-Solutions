class Solution1{
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
            return null;
        ListNode start1=head;
        ListNode start2=head;
        int len=0;
        while(start1!=null){
            len+=1;
            start1=start1.next;
        }
        int rotateBy=k%len;
        if(rotateBy==0)
            return head;
        start1=head;
        for(int i=0;i<(len-rotateBy-1);i++){
            start1=start1.next;
        }
        ListNode newHead=start1.next;
        start2=start1.next;
        start1.next=null;
        while(start2.next!=null){
            start2=start2.next;
        }
        start2.next=head;
        return newHead;
    }
}
