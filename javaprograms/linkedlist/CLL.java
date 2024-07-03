package javaprograms.linkedlist;

public class CLL {
    private Node head;
    private Node tail;
    private int size;

    class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public CLL() {
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
        if (index <= 0 || head == null) {
            insertFirst(value);
            return;
        }

        if (index >= size - 1) {
            insertLast(value);
            return;
        }

        Node node = get(index - 1);
        Node newNode = new Node(value);

        newNode.next = node.next;
        node.next = newNode;
        size++;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            head = node;
        }
        size++;
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        node.next = head;
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void delete(int index) {
        if(index <= 0){
            deleteFirst();
            return;
        }

        if(index >= size - 1){
            deleteLast();
            return;
        }

        Node node = get(index - 1);
        node.next = node.next.next;
        size--;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("Can't delete");
            return;
        }

        if (head.next == head) {
            head = tail = null;
            size = 0;
            return;
        }

        tail.next = head.next;
        head = head.next;
        size--;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("Can't delete");
            return;
        }

        if (head.next == head) {
            head = tail = null;
            size = 0;
            return;
        }

        Node node = get(size - 2);
        node.next = tail.next;
        tail = node;
        size--;
    }

    public void display() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        Node node = head;
        do {
            System.out.print(node.value + " -> ");
            node = node.next;
        } while (node != head);

        System.out.print(" END ");
    }

    public static void main(String[] args) {
        CLL cll = new CLL();
        cll.insertFirst(5);
        cll.insertFirst(4);
        cll.insertFirst(10);
        cll.insertFirst(22);
        cll.delete(1);
        cll.delete(1);
        cll.delete(0);
        cll.display();
    }
}
