package br.com.java.datastructures.linkedlist.removeduplicates;

public class RunRemoveDuplicates {

    public static void main(String[] args) {

        LinkedListRemoveDuplicates myLinkedList = new LinkedListRemoveDuplicates(1);

        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(3);
        myLinkedList.append(3);
        myLinkedList.append(4);

        myLinkedList.removeDuplicates();

        myLinkedList.printList();

        /*
            EXPECTED OUTPUT:
            ----------------
            1
            2
            3
            4

        */

    }
}
