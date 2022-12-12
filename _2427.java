/*
2427. Number of Common Factors
Given two positive integers a and b, return the number of common factors of a and b.

An integer x is a common factor of a and b if x divides both a and b.
 */
package Leetcode;

public class _2427 {
    public static void main(String[] args) {
        int n1 = 25;
        int n2 = 30;
        System.out.println(commonFactors(n1,n2));
    }

    static int commonFactors(int a, int b) {
           int count = 0;
                for (int i = 1; i <= Math.min(a,b) ; i++) {
                    if(a%i == 0 && b % i ==0){
                        count++;
                    }
            }
            return count;
    }
}