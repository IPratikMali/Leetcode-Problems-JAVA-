/*
2089. Find Target Indices After Sorting Array
You are given a 0-indexed integer array nums and a target element target.

A target index is an index i such that nums[i] == target.

Return a list of the target indices of nums after sorting nums in non-decreasing order. If there are no target indices, return an empty list. The returned list must be sorted in increasing order.
 */
package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _2089 {
    public static void main(String[] args) {
        int[] arr = {1,2,5,2,3};
        int target = 2;
        System.out.println(find(arr , target));
    }
    static List find(int[] arr , int target){
        Arrays.sort(arr);
        List l = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) l.add(i);
        }
        return l;
    }
}
