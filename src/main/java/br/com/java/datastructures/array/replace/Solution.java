package br.com.java.datastructures.array.replace;

import java.util.Arrays;

/**
 * Replace elements with the greatest element on right side
 * Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1
 */
public class Solution {

    public static void main(String[] args) {
        int[] array = {17, 18, 5, 4, 6, 1};

        int[] result = replaceElements(array);

        System.out.println(Arrays.toString(result));
    }

    public static int[] replaceElements(int[] array) {
        for (int i = array.length - 1, mx = -1; i >= 0; i--) {
            mx = Math.max(array[i], array[i] = mx);
        }

        return array;
    }
}
