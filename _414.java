/*
414. Third Maximum Number
Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.
 */
package Leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class _414 {
    public static void main(String[] args) {
        int[] nums = {3,3,3,3,4,3,2,3,3};
        System.out.println(find(nums));
    }
    static int find(int[] nums){
        HashSet hs = new HashSet();
        Arrays.sort(nums);
        int count = 0;
        int psize = hs.size();
        for (int i = nums.length-1; i >= 0; i--) {
           if(count > 3) break;
            hs.add(nums[i]);
            int nsize = hs.size();
            if(nsize != psize){
                count++;
                psize = nsize;
            }
        }
        Object[] ans = hs.toArray(new Integer[hs.size()]);
        Arrays.sort(ans);
        if(ans.length >= 3){
            return (int)ans[ans.length-3];
        }

        return (int)ans[ans.length-1];
    }
}
