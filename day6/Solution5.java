class Solution {
    int carry=0;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null && l2==null){
            return carry==1? new ListNode(1) : null ;
        }
        if(l1==null){
             l2.val+=carry;
             if(l2.val>=10){
                 l2.val-=10;
                 carry=1;
                 l2.next=addTwoNumbers(l1,l2.next);
                 return l2;
             }
            else{
                carry=0;
                return l2;
            }
        }
        else if(l2==null){
             l1.val+=carry;
             if(l1.val>=10){
                 l1.val-=10;
                 carry=1;
                 l1.next=addTwoNumbers(l1.next,l2);
                 return l1;
             }
            else{
                carry=0;
                return l1;
            }
        }
       else{
           l1.val=l1.val+l2.val+carry;
           if(l1.val>=10){
               l1.val-=10;
               carry=1;
           }
           else
               carry=0;
           l1.next=addTwoNumbers(l1.next,l2.next);
           return l1;
       }
    }
}