package br.com.java.datastructures.hashset;

import java.util.*;

public class FindPairs {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8, 10};
        int target = 7;

        List<int[]> pairs = findPairs(arr1, arr2, target);
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }

        /*
            EXPECTED OUTPUT:
            ----------------
            [5, 2]
            [3, 4]
            [1, 6]

        */

    }

    private static List<int[]> findPairs(int[] arr1, int[] arr2, int target) {
        Set<Integer> numSet = new HashSet<>();
        List<int[]> result = new ArrayList<>();
        for (int num : arr1) {
            numSet.add(num);
        }
        for (int num : arr2) {
            int complement = target - num;
            if (numSet.contains(complement)) {
                result.add(new int[]{complement, num});
            }
        }
        return result;
    }
}
