/*
747. Largest Number At Least Twice of Others
You are given an integer array nums where the largest integer is unique.

Determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, return the index of the largest element, or return -1 otherwise.


 */
package Leetcode;

import java.util.Arrays;

public class _747 {
    public static void main(String[] args) {
        int[] arr = {3,6,1,0};
        System.out.println(find(arr));
    }
    static int find(int[] arr){
        int[] arr2 = arr.clone();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]*2 > arr[arr.length-1])
               return -1;
        }
        for (int i = 0; i < arr2.length; i++) {
            if(arr[arr.length-1] == arr2[i]){
                return i;
            }
        }
        return -1;
    }
}
