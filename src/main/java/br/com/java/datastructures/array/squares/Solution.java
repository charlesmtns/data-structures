package br.com.java.datastructures.array.squares;

import java.util.Arrays;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 */
public class Solution {

    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.sortedSquares(new int[]{-4, -1, 0, 3, 10})));

        System.out.println(Arrays.toString(solution.sortedSquares(new int[]{-7, -3, 2, 3, 11})));
    }
}
