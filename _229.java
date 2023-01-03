/*
229. Majority Element II
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
 */
package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _229 {
    public static void main(String[] args) {
        int[] arr = {0,0,0};
        System.out.println(find(arr));
    }
    static List find(int[] arr){

        Arrays.sort(arr);
        int prev = Integer.MAX_VALUE;
        ArrayList li = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            if(prev != arr[i]) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) count++;
                    if (count > arr.length / 3) {
                        li.add(arr[i]);
                        break;
                    }
                }
                prev = arr[i];
            }
        }

        return li;
    }
}
