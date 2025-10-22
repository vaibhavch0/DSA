// 92. Reverse Linked List II
/* 
public class leetcode92 {
    
    class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(head==null|| head.next==null){
            return head;
        }
        
        ListNode list= new ListNode(0);
        list.next=head;

        
        ListNode temp=null;
        ListNode prev=list;
        for(int i=1;i<left;i++){
            prev=prev.next;
        }
        ListNode curr=prev.next;
        for(int i=0;i<right-left;i++){
             temp=curr.next;
            curr.next=temp.next;
            temp.next=prev.next;
            prev.next=temp;
        }
        return list.next;
    }
}
}
// 92 leetcode.com/problems/reverse-linked-list-ii/ 
*/
