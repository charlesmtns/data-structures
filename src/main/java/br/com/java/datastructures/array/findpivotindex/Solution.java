package br.com.java.datastructures.array.findpivotindex;

/**
 * You are given an integer array nums where the largest integer is unique.
 * <p>
 * Determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, return the index of the largest element, or return -1 otherwise.
 */
public class Solution {

    public int pivotIndex(int[] nums) {
        int[] sumLeft = new int[nums.length];
        int[] sumRight = new int[nums.length];
        int pivot = 0;
        int index = 1;
        int pivotIndex = 0;
        while (pivot < nums.length && index < nums.length) {
            sumRight[pivot] = sumRight[pivot] + nums[index];
            index++;
            if (index == nums.length) {
                pivot++;
                index = pivot + 1;
            }
        }

        pivot = nums.length - 1;
        index = pivot - 1;

        while (pivot >= 0 && index >= 0) {
            sumLeft[pivot] = sumLeft[pivot] + nums[index];
            index--;
            if (index < 0) {
                pivot--;
                index = pivot - 1;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (sumRight[i] == sumLeft[i]) {
                pivotIndex = i;
                return pivotIndex;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.pivotIndex(new int[]{2, 1, -1}));
    }
}
