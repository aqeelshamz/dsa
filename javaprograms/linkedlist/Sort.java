package javaprograms.linkedlist;

public class Sort {

    public static void main(String[] args) {
        LL ll = new LL();

        ll.insertLast(3);
        ll.insertLast(5);
        ll.insertLast(1);
        ll.insertLast(2);
        ll.insertLast(4);
        ll.display();

        System.out.println("Sorting: ");

        for (int i = 0; i < ll.size; i++) {
            for (int j = 0; j < i - 1; j++) {
                if (ll.get(j + 1) == null) {
                    break;
                }
                if (ll.get(j).value > ll.get(j + 1).value) {
                    // if (ll.get(j - 1) != null) {
                    // ll.get(j - 1).next = ll.get(j + 1);
                    // }
                    // ll.get(j).next = ll.get(j + 1).next;
                    // ll.get(j + 1).next = ll.get(j);
                }
                System.out.println(ll.get(j).value);
                System.out.println(ll.get(j + 1).value);
                System.out.println("");
            }
        }

        ll.display();
    }
}
