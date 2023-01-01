/*
128. Longest Consecutive Sequence
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.
 */
package Leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class _128 {
    public static void main(String[] args) {
        int[] arr = {100,200,2,1,4,3};
        System.out.println(find(arr));
    }

     static int find(int[] arr) {
         if(arr.length == 0) return 0;
         Arrays.sort(arr);
         int count = 1;
         int max = 1;
         for (int i = 0; i < arr.length-1; i++) {
             if(arr[i] == arr[i+1]) continue;
             if(arr[i+1] == arr[i] + 1) {
                 count++;
                 max = Math.max(max , count);
             }
             else count = 1;
         }
         return max ;
    }
}
