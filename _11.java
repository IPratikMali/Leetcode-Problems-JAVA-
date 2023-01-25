/*
11. Container With Most Water
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.


 */
package Leetcode;

public class _11 {
    public static void main(String[] args) {
        int[] arr = {1,8};
        System.out.println(find(arr));
    }
    public static int find(int[] arr){
        int i = 0 , j = arr.length-1;
        int max = Integer.MIN_VALUE;
        int min;
        while(i < j){
            min = Math.min(arr[i] , arr[j]);
            int ans = (j - i) * min;
            max = Math.max(max , ans);

            if(arr[i] > arr[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return max;
    }
}
