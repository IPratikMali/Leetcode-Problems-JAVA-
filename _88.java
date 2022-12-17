package Leetcode;

import java.util.Arrays;

public class _88 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        int m = 3;
        int n = 3;
        find(arr1,m,arr2,n);
    }
    static void find(int[] nums1, int m, int[] nums2, int n){
        if(m == 0){
            Arrays.sort(nums2);
            System.out.println(Arrays.toString(nums2));
            return;
        }
        if(n == 0){
            Arrays.sort(nums1);
            System.out.println(Arrays.toString(nums1));
            return;
        }
        int[] ans = new int[m+n];
        int j = 0;
        for (int i = 0; i < ans.length ; i++) {
            if(i < m) ans[i] = nums1[i];
            else {
                ans[i] = nums2[j];
                j++;
            }
        }
        Arrays.sort(ans);
       System.out.println(Arrays.toString(ans));
       return;
    }
}
