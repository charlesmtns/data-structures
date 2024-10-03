package br.com.java.datastructures.linkedlist.binaryToDecimal;

public class RunBinaryToDecimal {
    public static void main(String[] args) {

        // ---------------
        // Convert 1011 to 11
        // ---------------
        LinkedListBinaryToDecimal list1 = new LinkedListBinaryToDecimal(1);
        list1.append(0);
        list1.append(1);
        list1.append(1);
        System.out.println("Convert 1011 to 11:");
        System.out.println("Input: 1 -> 0 -> 1 -> 1");
        System.out.println("Output: " + list1.binaryToDecimal());
        System.out.println("---------------");

        // ---------------
        // Convert 1100 to 12
        // ---------------
        LinkedListBinaryToDecimal list2 = new LinkedListBinaryToDecimal(1);
        list2.append(1);
        list2.append(0);
        list2.append(0);
        System.out.println("Convert 1100 to 12:");
        System.out.println("Input: 1 -> 1 -> 0 -> 0");
        System.out.println("Output: " + list2.binaryToDecimal());
        System.out.println("---------------");

        // ---------------
        // Convert 1 to 1
        // ---------------
        LinkedListBinaryToDecimal list3 = new LinkedListBinaryToDecimal(1);
        System.out.println("Convert 1 to 1:");
        System.out.println("Input: 1");
        System.out.println("Output: " + list3.binaryToDecimal());
        System.out.println("---------------");

        // ---------------
        // Convert empty list to 0
        // ---------------
        LinkedListBinaryToDecimal list4 = new LinkedListBinaryToDecimal(0);
        list4.makeEmpty();
        System.out.println("Convert empty list to 0:");
        System.out.println("Input: empty");
        System.out.println("Output: " + list4.binaryToDecimal());
        System.out.println("---------------");
    }
}
