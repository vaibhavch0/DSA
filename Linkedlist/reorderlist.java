class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class reorderlist {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        // Step 1: Find middle using slow/fast pointer
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        // Step 2: If odd length, skip middle element
        ListNode second = fast == null ? slow : slow.next;
        ListNode first = prev;

        // Step 3: Merge reversed first half with second half
        while (first != null && second != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;
            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;
        }
    }
}
// is code me ListNode class ka istemal hua hai , logic linked list ko reorder karne ka hai ki pehle half ko reverse karke dusre half ke sath merge kiya jaye
