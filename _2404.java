package Leetcode;

import java.util.Arrays;

public class _2404 {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0};
        System.out.println(find(arr));
    }
    static int find(int[] arr){

        int max = 0;
        int count = 1;
        int ans = -1;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {

           if((arr[i] & 1) == 0){
               if(arr[i] == arr[i+1]){
                   count++;
                   if(count > max){
                       max = count;
                       ans = arr[i];
                   }
               }
               else{
                   if(count > max){
                       max = count;
                       ans = arr[i];
                   }
               }
           }

        }
        return ans;
    }
}
