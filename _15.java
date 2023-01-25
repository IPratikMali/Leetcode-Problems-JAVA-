/*
15 . 3sum
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.
 */
package Leetcode;

import java.util.*;

public class _15 {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(find(arr));
    }
    public static List<List<Integer>> find(int[] arr){
        Arrays.sort(arr);
        Set<List<Integer>> list = new HashSet<>();
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                for (int k = arr.length-1; k > j ; k--) {
                    if(arr[j] + arr[k] < Math.abs(arr[i])) break;
                    if(arr[j] + arr[k] == arr[i]*(-1)){
                        list.add(Arrays.asList(arr[i],arr[j],arr[k]));
                    }
                }
            }
        }

        return new ArrayList<>(list);
    }
}
