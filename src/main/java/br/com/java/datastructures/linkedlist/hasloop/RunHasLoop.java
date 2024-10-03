package br.com.java.datastructures.linkedlist.hasloop;

public class RunHasLoop {

    public static void main(String[] args) {

        LinkedListHasLoop myLinkedList = new LinkedListHasLoop(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        // create a loop by connecting the tail to the second node
        myLinkedList.getTail().next = myLinkedList.getHead().next;

        System.out.println("Has Loop:");
        System.out.println( myLinkedList.hasLoop());


        /*
            EXPECTED OUTPUT:
            ----------------
            Has Loop:
            true

        */

    }
}
