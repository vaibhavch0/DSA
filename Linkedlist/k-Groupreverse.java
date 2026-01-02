
// class Solution {
//     public ListNode reverseKGroup(ListNode head, int k) {
//         if(head==null || k==1) return head;

//         ListNode curr=head;
//         for(int i=0;i<k;i++){
//             if(curr==null) return head;
//             curr=curr.next;
//         }
//         ListNode grp=curr;
//         curr=head;
//         for(int i=1;i<k;i++){
//             curr=curr.next;
//         }
//         curr.next=null;
//         ListNode newhead=reverse(head);

//         head.next=reverseKGroup(grp,k);

//         return newhead;
//     }
//     public ListNode reverse(ListNode head){
//         if(head==null)return null;
//         ListNode prev =null;
//         ListNode curr=head;

//         while(curr!=null){
//             ListNode temp= curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=temp;
//         }
//         return prev;
//     }
// }
// is code ka logic ye hai ki ye linked list ko k group me reverse karta hai
// phle ye check karta hai ki kya linked list me k nodes hai ya nahi
// agar nahi hai to ye original head return karta hai
// agar hai to ye k nodes ko reverse karta hai aur phir recursively agle k nodes ko reverse karta hai