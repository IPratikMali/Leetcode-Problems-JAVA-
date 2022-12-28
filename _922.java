/*
922. Sort Array By Parity II
Given an array of integers nums, half of the integers in nums are odd, and the other half are even.

Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.

Return any answer array that satisfies this condition.
 */
package Leetcode;

import java.util.Arrays;

public class _922 {
    public static void main(String[] args) {

        int[] arr  = {4,2,5,7};
        System.out.println(Arrays.toString(find(arr)));
    }
    static int[] find(int[] nums){
       int[] ans = new  int[nums.length];
        int i =  0;
        int j = 1;
        int k = 0;
        while(k < nums.length){
            if(nums[k] % 2 == 0){
                ans[i] = nums[k];
                i += 2;
                k++;
            }
            else{
                ans[j] = nums[k];
                j += 2;
                k++;
            }
        }
        return ans;
    }
}
