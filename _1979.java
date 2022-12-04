/*
1979. Find Greatest Common Divisor of Array
Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.

The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.
 */
package Leetcode;

public class _1979 {
    public static void main(String[] args) {
        int[] arr = {10,10};
        System.out.println(find(arr));
    }
    static int find(int[] arr){
        int[] nums = minmax(arr);
        int gcd = 0;
        for (int i = 1; i <= nums[0]; i++) {
            if(nums[0] % i == 0 && nums[1] % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
    static int[] minmax(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int ints : arr){
            if(ints > max)
                max = ints;
            if(ints < min)
                min = ints;
        }
        return new int[]{min , max};
    }
}
