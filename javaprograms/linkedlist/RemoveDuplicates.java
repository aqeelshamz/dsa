package javaprograms.linkedlist;

import java.util.HashMap;

public class RemoveDuplicates {
    public static void main(String[] args) {
        LL ll = new LL();

        ll.insertLast(1);
        ll.insertLast(2);
        ll.insertLast(2);
        ll.insertLast(3);
        ll.insertLast(4);
        ll.insertLast(4);
        ll.insertLast(4);
        ll.insertLast(4);
        ll.insertLast(4);
        ll.insertLast(5);
        ll.display();

        LL.Node node = ll.head;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int i = 0;
        while(node != null){
            if(hashMap.get(node.value) == null){
                hashMap.put(node.value, 1);
            }
            else{
                ll.delete(i);
                i--;
            }
            i++;
            node = node.next;
        }

        System.out.println("");
        ll.display();
    }
}
