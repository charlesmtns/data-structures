package br.com.java.datastructures.doublylinkedlist.palindrome;

public class RunDoublyLinkedListPalidrome {

    public static void main(String[] args) {

        DoublyLinkedListPalindrome myDLL1 = new DoublyLinkedListPalindrome(1);
        myDLL1.append(2);
        myDLL1.append(3);
        myDLL1.append(2);
        myDLL1.append(1);

        System.out.println("myDLL1 isPalindrome:");
        System.out.println( myDLL1.isPalindrome() );



        DoublyLinkedListPalindrome myDLL2 = new DoublyLinkedListPalindrome(1);
        myDLL2.append(2);
        myDLL2.append(3);

        System.out.println("\nmyDLL2 isPalindrome:");
        System.out.println( myDLL2.isPalindrome() );



        /*
       		EXPECTED OUTPUT:
        	----------------
            DLL before swap:
            1
            2
            3
            4
            5

            DLL after swap:
            5
            2
            3
            4
            1

     	*/

    }
}
