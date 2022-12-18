/*
2154. Keep Multiplying Found Values by Two
You are given an array of integers nums. You are also given an integer original which is the first number that needs to be searched for in nums.

You then do the following steps:

If original is found in nums, multiply it by two (i.e., set original = 2 * original).
Otherwise, stop the process.
Repeat this process with the new number as long as you keep finding the number.
Return the final value of original.
 */
package Leetcode;

import java.util.*;

public class _2154 {
    public static void main(String[] args) {
        int[] arr = {5,3,6,1,12};
        int target = 3;
        System.out.println(find(arr,target));
    }
    static int find(int[] arr , int target) {
        Arrays.sort(arr);

        while(true){

        if (BinSearch(arr , target)) {
            target = target * 2;
        }
        else {
            break;
        }
    }
        return target;
    }
    static boolean BinSearch (int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}


