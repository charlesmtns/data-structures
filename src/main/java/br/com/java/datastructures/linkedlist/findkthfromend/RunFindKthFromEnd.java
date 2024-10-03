package br.com.java.datastructures.linkedlist.findkthfromend;

public class RunFindKthFromEnd {
    public static void main(String[] args) {
        LinkedListFindKthFromEnd myLinkedList = new LinkedListFindKthFromEnd(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        int k = 6;
        int result = myLinkedList.findKthFromEnd(k).value;

        System.out.println(result); // Output: 4

        /*
            EXPECTED OUTPUT:
            ----------------
            4
        */
    }
}
