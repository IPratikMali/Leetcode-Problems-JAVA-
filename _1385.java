/*
1385. Find the Distance Value Between Two Arrays
Given two integer arrays arr1 and arr2, and the integer d, return the distance value between the two arrays.

The distance value is defined as the number of elements arr1[i] such that there is not any element arr2[j] where |arr1[i]-arr2[j]| <= d.
 */
package Leetcode;

import java.util.Arrays;

public class _1385 {
    public static void main(String[] args) {
        int[] arr1 = {-8,-7};
        int[] arr2 = {4,10,-4,5,2};
        int d = 55;
        System.out.println(find(arr1,arr2,d));
    }
    static int find(int[] arr1 , int[] arr2 , int d){
        int count1 = 0;
        Arrays.sort(arr2);
        for(int ints1 : arr1){
            //the range of numbers that gives us (<= d)
            //starting of range = arr[i] + d
            //ending of the range = arr[i]-d
            int nums = ints1-d ;
            int nums2 = ints1 + d;
            for(int ints2 : arr2){
                //if we found any number in arr2 from above number range then break the loop
                if(ints2 >= nums && ints2 <= nums2) {
                    count1++;
                    break;
                }
            }
        }
        //total elements in array - the element that violeted the condition
        count1 = arr1.length - count1;
        return count1;
    }

}
