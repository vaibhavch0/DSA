
class Node {
    
        Node next;
        int data;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
        
    }





public class basic {

   public static void main(String[] args) {
    int arr[]={1,9,8,7,6};
    Node y=new Node(arr[1]);
    System.out.println(y.data);
   }
}