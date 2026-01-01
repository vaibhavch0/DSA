public class evenodd {
    Node head;

    public void segregateEvenOdd() {
        if (head == null || head.next == null) {
            return;
        }

        Node evenHead = null;
        Node evenTail = null;
        Node oddHead = null;
        Node oddTail = null;

        Node current = head;
        while (current != null) {
            if (current.data % 2 == 0) {
                if (evenHead == null) {
                    evenHead = current;
                    evenTail = current;
                } else {
                    evenTail.next = current;
                    evenTail = evenTail.next;
                }
            } else {
                if (oddHead == null) {
                    oddHead = current;
                    oddTail = current;
                } else {
                    oddTail.next = current;
                    oddTail = oddTail.next;
                }
            }
            current = current.next;
        }

        if (evenTail != null) {
            evenTail.next = oddHead;
        }
        if (oddTail != null) {
            oddTail.next = null;
        }

        head = evenHead != null ? evenHead : oddHead;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
// is code me hamne linked list ko even aur odd elements me segregate kiya hai.
// odd elements ko even elements ke baad daal diya gaya hai. odd ko head rkha or even ko head.next