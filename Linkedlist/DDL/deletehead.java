package DDL;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class deletehead {

    public static Node delete(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node prev = head;
        head = head.next;
        prev.next = null;
        head.prev = null;
        return head;
    }

    public static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static Node convert(int arr[]) {
        if (arr.length == 0) {
            return null;
        }
        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};
        Node head = convert(arr);

        System.out.print("Original list: ");
        printlist(head);

        head = delete(head);
        System.out.print("After deleting head: ");
        printlist(head);
    }
}
