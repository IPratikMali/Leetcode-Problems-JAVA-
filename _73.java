package Leetcode;

import java.util.Arrays;

public class _73 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        System.out.println(Arrays.deepToString(find(arr)));
    }
    static int[][] find(int[][] arr){
        int[][] ans = new int[arr.length][arr[0].length];

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                ans[i][j] = arr[i][j];
            }
        }

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                if(ans[i][j] == 0){
                    for (int k = 0; k < arr.length; k++) {
                        for (int l = 0; l < arr[k].length; l++) {
                            if(k == i){
                                arr[k][l] = 0;
                            }
                            else{
                                if(l == j){
                                    arr[k][l] = 0;
                                     break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return arr;
    }
}
