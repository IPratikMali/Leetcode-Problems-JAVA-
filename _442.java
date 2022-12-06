/*
442. Find All Duplicates in an Array
Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant extra space.

 */
package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _442 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(find(arr));
    }
    static List<Integer> find(int[] arr){
        int i = 0;
        List l = new ArrayList<Integer>();
        while(i < arr.length){
            // index = value - 1
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else{
                i++;
            }

            }
        for (int index = 0; index <arr.length ; index++) {
            if(arr[index] != index+1){
                l.add(arr[index]);
            }
        }
        return l;
    }
}


