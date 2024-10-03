package br.com.java.datastructures.linkedlist.findmiddle;

public class RunFindMiddle {
    public static void main(String[] args) {

        LinkedListFindMiddle myLinkedList = new LinkedListFindMiddle(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);
        myLinkedList.append(6);
        myLinkedList.append(7);
        myLinkedList.append(8);
        myLinkedList.append(9);


        System.out.println("1 -> 2 -> 3 -> 4 -> 5");
        System.out.println("Middle Node: " + myLinkedList.findMiddleNode().value);


        myLinkedList.append(10);


        System.out.println("===========================");
        System.out.println("1 -> 2 -> 3 -> 4 -> 5 -> 6");
        System.out.println("Middle Node: " + myLinkedList.findMiddleNode().value);


        /*
            EXPECTED OUTPUT:
            ----------------
            1 -> 2 -> 3 -> 4 -> 5
            Middle Node: 3
            ===========================
            1 -> 2 -> 3 -> 4 -> 5 -> 6
            Middle Node: 4

        */

    }
}
