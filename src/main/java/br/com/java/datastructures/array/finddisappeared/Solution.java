package br.com.java.datastructures.array.finddisappeared;

import java.util.*;

/**
 * Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
 */
public class Solution {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer, Boolean> hashTable = new HashMap<>();
        for (int num : nums) {
            hashTable.put(num, true);
        }
        List<Integer> result = new LinkedList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!hashTable.containsKey(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findDisappearedNumbers(new int[]{1, 1}));

        System.out.println(solution.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }
}
