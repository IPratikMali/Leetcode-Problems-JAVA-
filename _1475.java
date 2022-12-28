/*
1475. Final Prices With a Special Discount in a Shop
 */
package Leetcode;

import java.util.Arrays;

public class _1475 {
    public static void main(String[] args) {
        int[] arr = {10,1,1,6};
        System.out.println(Arrays.toString(find(arr)));
    }
    static int[] find(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i] >= arr[j]){
                    arr[i] = arr[i] - arr[j];
                    break;
                }
            }
        }
        return arr;
    }
}
