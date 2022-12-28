/*
350. Intersection of Two Arrays II
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
 */
package Leetcode;

import java.util.*;

public class _350 {
    public static void main(String[] args) {
       int[] nums1 = {4,9,5};
       int[] nums2 = {9,4,9,8,4};
       System.out.println(Arrays.toString(addToArrayForm(nums1 , nums2)));
    }
     static int[] addToArrayForm(int[] nums1 , int[] nums2) {
        ArrayList li = new ArrayList();
        if( nums1.length > nums2.length){
            for (int i = 0; i < nums2.length ; i++) {
                for (int j = 0; j < nums1.length ; j++) {
                    if(nums2[i] == nums1[j]){
                    li.add(nums2[i]);
                    nums1[j] = -1;
                    break;
                    }
                }
            }
        }
        else{
            for (int i = 0; i < nums1.length ; i++) {
                for (int j = 0; j < nums2.length ; j++) {
                    if(nums1[i] == nums2[j]){
                        li.add(nums1[i]);
                        nums2[j] = -1;
                        break;
                    }
                }
            }
        }
        int[] ans = new int[li.size()];
         for (int i = 0; i < ans.length; i++) {
             ans[i] = (int)li.get(i);
         }
        return  ans;
    }

}
