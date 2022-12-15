/*
832. Flipping an Image
Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.

For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

For example, inverting [0,1,1] results in [1,0,0].
 */
package Leetcode;

import java.util.Arrays;

public class _832 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,0,0},
                {1,0,0,1},
                {0,1,1,1},
                {1,0,1,0}
        };
        System.out.println(Arrays.deepToString(flipAndInvertImage(arr)));
    }
    static int[][] flipAndInvertImage(int[][] arr){
        for(int[] ints : arr){
            int j = ints.length-1;
            for (int i = 0; i < ints.length/2; i++) {
                int temp = ints[i];
                ints[i] = ints[j];
                ints[j] = temp;
                j--;
            }
        }
        for(int[] ints : arr){
            for (int i = 0; i < ints.length ; i++) {
               if(ints[i] == 0) ints[i] = 1;
               else if (ints[i] == 1) ints[i] = 0;
            }
        }
        return arr;
    }
}
