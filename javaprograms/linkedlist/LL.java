package javaprograms.linkedlist;

public class LL {
    public Node head;
    public Node tail;
    public int size;

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

    public LL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = node;
        }
        size++;
    }

    public void insertLast(int value) {
        if (size <= 0) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        }

        if (index >= size) {
            insertLast(value);
            return;
        }

        Node node = head;
        for (int i = 0; i < index - 1; i++) {
            node = node.next;
        }

        if (node == null) {
            System.out.println("Can't insert");
            return;
        }

        Node newNode = new Node(value);
        newNode.next = node.next;
        node.next = newNode;
        size++;
    }

    public void recursiveInsert(int value, int index) {
        if (index <= 0) {
            insertFirst(value);
            return;
        }

        if (index >= size - 1) {
            insertLast(value);
            return;
        }

        recursiveInsert(value, index - 1, head);
    }

    public void recursiveInsert(int value, int index, Node node) {
        if (index == 0) {
            Node newNode = new Node(value);
            newNode.next = node.next;
            node.next = newNode;
            size++;
            return;
        }

        node = node.next;
        recursiveInsert(value, index - 1, node);
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("Can't delete");
            return;
        }

        head = head.next;
        size--;
    }

    public void deleteLast() {
        if (head == tail) {
            deleteFirst();
            return;
        }

        Node node = get(size - 2);
        tail = node;
        tail.next = null;
        size--;
    }

    public void delete(int index) {
        if (index == 0) {
            deleteFirst();
            return;
        }

        if (index > size - 1) {
            deleteLast();
            return;
        }

        Node node = get(index - 1);
        node.next = node.next.next;
        size--;
    }

    public void display() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        Node node = head;
        while (node != null) {
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.print("END");
    }

    public static void main(String[] args) {
        LL ll = new LL();

        ll.insertFirst(1);
        ll.insertFirst(20);
        ll.insertLast(17);
        ll.insertLast(55);
        ll.insert(10, 3);
        ll.recursiveInsert(99, 1);
        ll.display();
    }
}
