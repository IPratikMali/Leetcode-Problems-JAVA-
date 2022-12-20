/*
4. Median of Two Sorted Arrays
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).
 */
package Leetcode;

import java.util.Arrays;

public class _4 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] ans = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (j < nums1.length && k < nums2.length) {
            if (i > ans.length / 2) break;
            if (nums1[j] > nums2[k]) {
                ans[i] = nums2[k];
                k++;
                i++;
            } else {
                ans[i] = nums1[j];
                j++;
                i++;
            }
        }
        if (j >= nums1.length) {
            while (i <= ans.length / 2) {
                ans[i] = nums2[k];
                k++;
                i++;
            }
        } else {
            while (i <= ans.length / 2) {
                ans[i] = nums1[j];
                j++;
                i++;
            }
        }
        i--;
        if (ans.length % 2 == 0) {
            double med = (double)(ans[i] + ans[i - 1]) / 2;
            return med;
        }
        return ans[i];
    }
}