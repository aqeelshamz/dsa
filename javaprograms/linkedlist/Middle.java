package javaprograms.linkedlist;

public class Middle {
    public static void main(String[] args) {
        LL ll = new LL();

        ll.insertLast(1);
        ll.insertLast(2);
        ll.insertLast(3);
        ll.insertLast(4);
        ll.insertLast(5);
        ll.insertLast(6);
        ll.display();

        int size = 0;
        LL.Node node = ll.head;

        while(node != null){
            node = node.next;
            size++;
        }

        int middle = size / 2;

        node = ll.head;
        while(middle > 0){
            node = node.next;
            middle--;
        }

        System.out.println(node.value);
    }
}
