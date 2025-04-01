
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Deletion {

    public static Node headDeletion(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        return head.next;
    }

    public static Node tailDeletion(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static Node KthELementRemove(Node head, int k) {
        if (head == null) {
            return null;
        }
        if (k == 1) {
            head = head.next;
            return head;
        }
        Node temp = head;
        int cnt = 0;
        Node prev = null;
        while (temp != null) {
            cnt++;
            if (cnt == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 10, 12};
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        System.out.print("Original List: ");
        print(head);
        System.out.print("After Head Deletion: ");
        head = headDeletion(head);
        print(head);
        System.out.print("After Tail Deletion: ");
        tailDeletion(head);
        print(head);
        System.out.print("After Kth Element Deletion: ");
        head = KthELementRemove(head, 1);
        print(head);
    }
}
