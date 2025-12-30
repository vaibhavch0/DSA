import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}
public class mergetwonode {

public static Node createLinkedList(int[] arr) {
    if (arr.length == 0)
        return null;
    Node head = new Node(arr[0]);
    Node curr = head;
    for (int i = 1; i < arr.length; i++) {
        curr.next = new Node(arr[i]);
        curr = curr.next;
    }
    return head;
}

public static Node mergeLists(Node l1, Node l2) {
    if (l1 == null && l2 == null)
        return null;
    Node dummy = new Node(1);
    Node tail = dummy;

    while (l1 != null && l2 != null) {
        if (l1.data <= l2.data) {
            tail.next = l1;
            l1 = l1.next;
        } else {
            tail.next = l2;
            l2 = l2.next;
        }
        tail = tail.next;
    }
    if (l1 != null) {
        tail.next = l1;
    }
    if (l2 != null) {
        tail.next = l2;
    }
    return dummy.next;
}

public static void printList(Node head) {
    while (head != null) {
        System.out.println(head.data);
        head = head.next;
    }
}





    public static void main(String[] args) {
        int arr1[] = { 1, 3, 5, 7 };
        int arr2[] = { 2, 4, 6, 8 };
        Node head1 = createLinkedList(arr1);
        Node head2 = createLinkedList(arr2);
        Node mergedHead = mergeLists(head1, head2);
        printList(mergedHead);
    }
}
