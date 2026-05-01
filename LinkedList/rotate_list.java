class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;
        ListNode temp= head;
        int length= 1;
        while(temp.next!= null){
            length++;
            temp= temp.next;
        }
        temp.next= head;
        k= k%length;
        int distnewtail= length-k;
        ListNode newtail= head;
        for(int i=1;i<distnewtail;i++){
            newtail= newtail.next;
        }
        ListNode newhead= newtail.next;
        newtail.next= null;
        
        return newhead;
    }
}
