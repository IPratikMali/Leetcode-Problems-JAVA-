/*
287. Find the Duplicate Number
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.
 */
package Leetcode;

public class _287 {
    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
        System.out.println(find(arr));
    }
    static int find(int[] arr){
        int i = 0;
        while(i< arr.length){
            if(arr[i] != i+1){
                int correct = arr[i]-1;
                if(arr[i] != arr[correct]){
                    int temp = arr[i];
                    arr[i] = arr[correct];
                    arr[correct] = temp;
                }
                else {
                    return arr[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }
}
