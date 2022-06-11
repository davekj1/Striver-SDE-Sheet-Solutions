/*Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.

For example, the following two linked lists begin to intersect at node c1:*/
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA=0;
        int lenB=0;
        ListNode startA=headA;
        ListNode startB=headB;
        while(startA!=null){
            lenA+=1;
            startA=startA.next;
        }
        while(startB!=null){
            lenB+=1;
            startB=startB.next;
        }
        int diff=Math.abs(lenA-lenB);
        startA=headA;
        startB=headB;
        if(lenA>lenB){
            for(int i=0;i<diff;i++){
                startA=startA.next;
            }
        }
        else{
            for(int i=0;i<diff;i++){
                startB=startB.next;
            }
        }
        while(startA!=null && startB!=null){
            if(startA==startB)
                return startA;
            startA=startA.next;
            startB=startB.next;
        }
        return null;
    }
}
