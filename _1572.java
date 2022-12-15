/*
1572. Matrix Diagonal Sum
Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.


 */
package Leetcode;

public class _1572 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(diagonalSum(arr));
    }
    static int diagonalSum(int[][] arr) {
        int sum = 0;
        int j = 0;
        int i = 0;
        int k = arr[0].length-1;
        while(i < arr.length) {
            if (j == k) {
                sum = sum + arr[i][j];
                i++;
                j++;
                k--;
                continue;
            }

            sum = sum + arr[i][j] + arr[i][k];
            i++;
            j++;
            k--;
        }
        return sum;
        }
    }
