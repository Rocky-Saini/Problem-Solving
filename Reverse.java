class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Reverse {
    public static void main(String[] args) {
        // Example usage:
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = curr.next;

        while (curr != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if (next != null)
                next = next.next;
        }

        printLL(prev);

    }

    private static void printLL(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            System.out.print("->");
            head = head.next;
        }
        System.out.print("null");
    }
}
