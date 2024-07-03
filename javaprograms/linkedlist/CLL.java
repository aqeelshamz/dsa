package javaprograms.linkedlist;

public class CLL {
    private Node head;
    private Node tail;
    private int size;

    class Node{
        public int value;
        public Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public CLL(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insert(int value, int index){

    }

    public void insertFirst(int value){

    }

    public void insertLast(int value){

    }

    public void delete(int index){

    }

    public void deleteFirst(){

    }

    public void deleteLast(){

    }

    public void display(){

    }

    public void displayReverse(){

    }

    public static void main(String[] args) {
        CLL cll = new CLL();
    }
}
