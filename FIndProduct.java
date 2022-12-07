/*
print the product of all elements in an given array.
 */
package HackerEarth;

import java.util.Scanner;

public class FIndProduct {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(product(arr));
    }
    static int product(int[] arr){
        int ans = 1;
        for(int ints : arr){
            ans = ans * ints;
        }
        return ans;
    }
}
