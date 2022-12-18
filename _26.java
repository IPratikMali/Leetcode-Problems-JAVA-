/*
26. Remove Duplicates from Sorted Array
 */
package Leetcode;

import java.util.Arrays;

public class _26 {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(find(arr));
    }
    static int
    find(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {

            if(arr[i] == arr[i+1]){
                arr[i] = Integer.MAX_VALUE;
                count++;
            }
        }
        Arrays.sort(arr);
        return arr.length-count;
    }
}
