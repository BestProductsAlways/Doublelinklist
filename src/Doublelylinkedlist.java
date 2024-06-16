// Define the Node class for the doubly linked list
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

// Define the DoublyLinkedList class
class DoublyLinkedList {
    Node head;
    Node tail;

    // Method to add a node to the end of the list
    void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Method to reverse traverse the list
    void reverseTraverse() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
    }

    public static void main(String[] args) {
        // Create an instance of the doubly linked list
        DoublyLinkedList dll = new DoublyLinkedList();

        // Add nodes to the list
        dll.addNode(10);
        dll.addNode(20);
        dll.addNode(30);
        dll.addNode(40);
        dll.addNode(50);

        // Perform reverse traversal
        System.out.println("Reverse traversal of the doubly linked list:");
        dll.reverseTraverse();  // Output: 50 40 30 20 10
    }
}

