/*
1281. Subtract the Product and Sum of Digits of an Integer
Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 */
package Leetcode;

public class _1281 {
    public static void main(String[] args) {
        int n = 234;
        System.out.println(subtractProductAndSum(n));
    }
    static int subtractProductAndSum(int n){
        int ans;
        int temp1=0 , temp2=1;
        while(n > 0){
            temp1 = temp1 + n%10;
            temp2 = temp2 * (n%10);
            n = n/10;
        }
        return ans = temp2 - temp1;
    }
}

