/*
191. Number of 1 Bits
Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).
 */
package Leetcode;

public class _191 {
    public static void main(String[] args) {
        int n = 00000000000000000000000000001011;
        System.out.println(hammingWeight(n));
    }
    static int hammingWeight(int n){
        String s1 = Integer.toBinaryString(n);
        int count = 0;
        for(char ints : s1.toCharArray()){
            if(ints == '1')
                count++;
        }
        return count;
    }

}
