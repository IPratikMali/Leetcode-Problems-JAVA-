/*
1486. XOR Operation in an Array
You are given an integer n and an integer start.

Define an array nums where nums[i] = start + 2 * i (0-indexed) and n == nums.length.

Return the bitwise XOR of all elements of nums.
 */
package Leetcode;

public class _1486 {
    public static void main(String[] args) {
        int start = 0;
        int n = 5;
        System.out.println(xorOperation(n , start));
    }
    static int xorOperation(int n, int start){
        int xor = 0;
        for(int i = 0; i<n; i++){
             xor = xor ^ start ;
            start = start + 2;
        }
        return xor;
    }
}
