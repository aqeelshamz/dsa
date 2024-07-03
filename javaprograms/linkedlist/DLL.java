package javaprograms.linkedlist;

public class DLL {
    private Node head;
    private Node tail;
    private int size;

    class Node {
        public int value;
        public Node prev;
        public Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }

    public DLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public Node get(int index) {
        Node node = head;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    public void insert(int value, int index) {
        if (index <= 0) {
            insertFirst(value);
            return;
        }

        if (index >= size) {
            insertLast(value);
            return;
        }

        Node node = get(index - 1);
        Node newNode = new Node(value);
        newNode.next = node.next;
        node.next.prev = newNode;
        node.next = newNode;
        newNode.prev = node;
        size++;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        tail.next = node;
        node.prev = tail;
        node.next = null;
        if (head == null) {
            head = tail;
        }
        size++;
    }

    public void delete(int index) {
        if (index <= 0) {
            deleteFirst();
            return;
        }

        if (index >= size - 1) {
            deleteLast();
            return;
        }

        Node node = get(index - 1);
        node.next = node.next.next;
        if (node.next.next != null) {
            node.next.next.prev = node;
        }
        size--;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("Can't delete");
            return;
        }

        if (head == tail) {
            head = tail = null;
            size = 0;
            return;
        }

        head = head.next;
        head.prev = null;
        size--;
    }

    public void deleteLast() {
        if (tail == null) {
            System.out.println("Can't delete");
            return;
        }

        if (head == tail) {
            head = tail = null;
            size = 0;
            return;
        }

        Node node = tail.prev;
        tail.prev = null;
        node.next = null;
        tail = node;
        size--;
    }

    public void display() {
        if (size == 0) {
            System.out.println("Linked list is empty");
            return;
        }

        Node node = head;

        while (node != null) {
            System.out.print(node.value + " -> ");
            node = node.next;
        }

        System.out.print(" END ");
    }

    public void displayReverse() {
        if (size == 0) {
            System.out.println("Linked list is empty");
            return;
        }

        Node node = tail;

        while (node != null) {
            System.out.print(node.value + " -> ");
            node = node.prev;
        }

        System.out.print(" START ");
    }

    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.insertFirst(1);
        dll.insertFirst(10);
        dll.insertFirst(2);
        dll.insertFirst(20);
        dll.insertFirst(45);
        dll.insert(99, 1);
        dll.deleteFirst();
        dll.deleteLast();
        dll.deleteLast();
        dll.deleteLast();
        dll.deleteLast();
        dll.display();
        dll.displayReverse();
    }
}
