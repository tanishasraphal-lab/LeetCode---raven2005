import java.util.*;
// Builds a linked list from user input
// Maintains head and tail pointers for efficient insertion

public class Main {

    // Node class (fixed issue: made it static inside Main)
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Reverse Linked List
    // Reverses a singly linked list in-place
    // Uses three pointers: prev, curr, next
    // Time: O(n), Space: O(1)
    static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    // Print Linked List
    static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int n = sc.nextInt(); // number of nodes

            Node head = null;
            Node tail = null;

            // Input list
            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                Node newNode = new Node(val);

                if (head == null) {
                    head = newNode;
                    tail = newNode;
                } else {
                   if(tail != null) tail.next = newNode;
                    tail = newNode;
                }
            }

            System.out.println("Original List:");

            printList(head);

            head = reverse(head);

            System.out.println("Reversed List:");

            printList(head);
        }
    }
}