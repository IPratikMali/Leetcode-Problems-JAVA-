package Leetcode;


import java.util.Arrays;

public class _976 {
    public static void main(String[] args) {
        int[] arr = {1,2,1,10};
        System.out.println(find(arr));
    }
    static int find(int[] arr){
        int ans = 0;
        Arrays.sort(arr);
        for (int i = 0; i <= arr.length-3 ; i++) {
            if(arr[i] + arr[i+1] > arr[i+2]){
                if(ans < arr[i] + arr[i+1] + arr[i+2]){
                    ans = arr[i] + arr[i+1] + arr[i+2];
                }
            }

        }
        return ans;
    }
}
