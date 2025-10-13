

//Insertion at the head of LL

/*Definition for singly Linked List


class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}

class Solution {
    public ListNode insertAtHead(ListNode head, int X) {
        ListNode temp=new ListNode(X);
        temp.next=head;
        head=temp;
        return head;
    }
}
    isme hmne ek naya node bnaya jisme data X h
    fir us node ka next head pr point kraya
    fir head ko temp pr point kraya
    fir head return kr diya 
*/



//237. DELETE NODE IN A LINKED LIST


/*
class Solution {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
    isme hmne us node ka value uske next node ke value se replace kr diya
    fir us node ka next uske next ke next pr point kraya
    isse wo node delete ho jayega
*/



// 141. Linked List Cycle

/* 
 * 
 * public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null){
            return false;
        }
        ListNode n1 = head;
        ListNode n2 = head.next;
        while(n2!=null && n2.next!=null){
            n1= n1.next;
            n2=n2.next.next;
            if(n1==n2){
                return true;
            }
        }
        return false;

    }
}
    isme hmne do pointer bnaye n1 and n2
    n1 ek step chalta h or n2 do step chalta h
    agr linked list m cycle h to dono pointer ek din milenge hi
    agr koi cycle nhi h to n2 null pr chala jayega or hm false return kr denge
*/



//876. Middle of the Linked List

/*
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null && fast.next!=null ){
            
            fast=fast.next.next;
            
            slow=slow.next;  
            
        }
        
        
        return slow;
    }
}
    isme hmne do pointer bnaye slow and fast
    slow ek step chalta h or fast do step chalta h
    jab fast null pr chala jayega to slow middle pr hoga
    agr linked list m even number of nodes h to bhi slow second middle pr hoga
    fir hm slow return kr denge
*/



//142. Linked List Cycle II
/*
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode n1=head;
        ListNode n2=head;
        ListNode prev = head;
        
        while(n2!=null && n2.next!=null){
            n2=n2.next.next;
            n1=n1.next;
            if(n2==n1){
               break;

            }
        }
        if(n2==null|| n2.next==null){
            return null;
        }
        n1=head;
        while(n2!=n1){
                n2= n2.next;
                
                n1=n1.next;
        }
        return n1;
    }
}
    isme hmne do pointer bnaye n1 and n2
    n1 ek step chalta h or n2 do step chalta h
    agr linked list m cycle h to dono pointer ek din milenge hi
    agr koi cycle nhi h to n2 null pr chala jayega or hm null return kr denge
    jab dono pointer mil jaye to hm n1 ko head pr le aayenge or n2 ko jaha wo mile the waha se chalu krenge
    fir dono pointer ek step ek step chalte rahenge
    jaha dono pointer milenge wahi cycle ka starting point hoga
    fir hm n1 or n2 return kr denge 
*/



//206. REVERSE LINKED LIST
/*

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode next1=null;
        ListNode prev=null;
        while(curr!=null){
            next1=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next1;
        }
        return prev;
    }
}

code me hmne 3 pointer bnaye h
curr jo ki current node ko point krta h
next1 jo ki curr ke next node ko point krta h
prev jo ki curr ke previous node ko point krta h
fir hmne while loop chalaya jab tak curr null nhi ho jata
fir hmne next1 ko curr ke next pr point kraya
fir hmne curr ke next ko prev pr point kraya
fir hmne prev ko curr pr point kraya
fir hmne curr ko next1 pr point kraya
fir hmne prev return kr diya jo ki new head h
*/