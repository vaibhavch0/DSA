package DDL;

class Node{

    int data;
    Node next;
    Node prev;

     Node(int data,Node next,Node prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    } 

    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }   
}


public class ddlcovertarr {
    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next; 
        }   
    }
public static Node covert(int arr[]){
if (arr.length==0){
    return null;
}
    Node head=new Node(arr[0]);
    Node prev=head;

    for(int i=1;i<arr.length;i++){
        Node temp=new Node(arr[i],null,prev);
        prev.next=temp;
        prev=temp;
    }
    return head;
} 

public static void main(String args[]){

    int arr[] = {1,2,3,4,5};
    Node head = covert(arr);
    printlist(head);

}
}