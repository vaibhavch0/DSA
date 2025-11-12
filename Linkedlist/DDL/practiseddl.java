package DDL;

class Node{
    int data;
    Node next;
    Node prev;

    Node(int data,Node next,Node prev){
        this.data=data;
        this.next=next;
        this.prev=prev;
    }

    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }

}


public class practiseddl {

    public static Node covert(int[]arr){
        Node head=new Node(arr[0]);
        Node prev=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i],null,prev);
            prev.next=temp;
            prev=temp;

            
        }
        return head;
    }
    public static void main(String[]args){

        int[]arr={1,2,3,4,5};
        
        convert(head);
    }
    
}
