package br.com.java.datastructures.array.thirdmaximum;

import java.util.Arrays;


/**
 * Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.
 */
public class Solution {

    public int thirdMax(int[] nums) {
        int thirdMaximum = 0;
        int maximum = -1;
        int third = 1000;

        for (int num : nums) {
            if (num > maximum) {
                maximum = num;
            }
        }

        Arrays.sort(nums);

        for (int i = nums.length - 1; i >= 0 && thirdMaximum < 3; i--) {
            if (nums[i] != third) {
                third = nums[i];
                thirdMaximum++;
            }
        }

        return thirdMaximum == 3 ? third : maximum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int thirdMax = solution.thirdMax(new int[]{3, 2, 1});
        System.out.println(thirdMax);
    }
}
