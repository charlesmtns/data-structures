package br.com.java.datastructures.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<Integer> myList = List.of(1, 2, 3, 4, 1, 2, 5, 6, 7, 3, 4, 8, 9, 5);
        List<Integer> newList = removeDuplicates(myList);
        System.out.println(newList);

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6, 7, 8, 9]

            (Order may be different as sets are unordered)
        */

    }

    private static List<Integer> removeDuplicates(List<Integer> myList) {
        Set<Integer> mySet = new HashSet<>();
        for (Integer num : myList) {
            if (!mySet.contains(num)) {
                mySet.add(num);
            }
        }
        return new ArrayList<Integer>(mySet);
    }
}
