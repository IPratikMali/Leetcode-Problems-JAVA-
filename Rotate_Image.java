package Leetcode;
import java.util.Arrays;

public class Rotate_Image {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.deepToString(find(arr)));
    }
    static int[][] find(int[][] arr){
        int[][] ans = new int[arr.length][arr[0].length];
         int k = arr.length-1;
        for (int i = 0; i < arr.length ; i++ , k--) {
                for (int j = 0; j < arr[0].length ; j++) {
                    ans[j][k] = arr[i][j];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = ans[i][j];
            }
        }
        return arr;
    }
}
