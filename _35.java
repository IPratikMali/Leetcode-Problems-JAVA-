/*
35. Search Insert Position
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.
 */
package Leetcode;

public class _35 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 7;
        System.out.println(searchInsert(arr , target));
    }
    static int searchInsert(int[] nums , int target){
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid == nums.length-1){
                return nums.length;
            }
            else if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                if(nums[mid-1] < target){
                    return mid;
                }
                end = mid - 1 ;
            }
            else if (nums[mid] < target) {
                if(nums[mid+1] > target){
                    return mid+1;
                }
                start = mid + 1;
            }


        }
        return -1;

    }
}
