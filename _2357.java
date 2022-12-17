/*
2357. Make Array Zero by Subtracting Equal Amounts
You are given a non-negative integer array nums. In one operation, you must:

Choose a positive integer x such that x is less than or equal to the smallest non-zero element in nums.
Subtract x from every positive element in nums.
Return the minimum number of operations to make every element in nums equal to 0.
 */
package Leetcode;
import java.util.Arrays;

public class _2357 {
    public static void main(String[] args) {
        int[] arr = {1,5,0,3,5};
        System.out.println(find(arr));
    }
    static int find(int[] arr){
        int count = 0;
        Arrays.sort(arr);
        while(true) {
            int x = 0;
            for (int i = count; i < arr.length; i++) {
                if (arr[i] != 0) {
                    x = arr[i];
                    break;
                }
            }
            if(x == 0) break;
            for (int i = arr.length-1; i >= 0; i--) {
                if(arr[i] != 0) {
                    arr[i] = arr[i] - x;
                }
                else{
                    break;
                }
            }
            count++;
        }
        return count;
    }
}
