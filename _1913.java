/*
1913. Maximum Product Difference Between Two Pairs
The product difference between two pairs (a, b) and (c, d) is defined as (a * b) - (c * d).

For example, the product difference between (5, 6) and (2, 7) is (5 * 6) - (2 * 7) = 16.
Given an integer array nums, choose four distinct indices w, x, y, and z such that the product difference between pairs (nums[w], nums[x]) and (nums[y], nums[z]) is maximized.

Return the maximum such product difference.
 */
package Leetcode;

import java.util.Arrays;

public class _1913 {
    public static void main(String[] args) {
        int[] arr = {4,2,5,9,7,4,8};

        System.out.println(maxProductDifference(arr));

    }
    static int maxProductDifference (int[] arr){
        Arrays.sort(arr);
        return (arr[arr.length-1]* arr[arr.length-2]) - (arr[0]*arr[1]);
    }
}
