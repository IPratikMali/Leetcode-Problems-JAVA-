/*
2176. Count Equal and Divisible Pairs in an Array
Given a 0-indexed integer array nums of length n and an integer k, return the number of pairs (i, j) where 0 <= i < j < n, such that nums[i] == nums[j] and (i * j) is divisible by k.
 */
package Leetcode;

public class _2176 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int k = 2;
        System.out.println(countPairs(arr, k));
    }

    static int countPairs(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[i] == arr[j]) {
                    if ((i * j) % k == 0)
                        count++;
                }
            }

        }
        return count;
    }
}