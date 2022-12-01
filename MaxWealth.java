package Leetcode;
import java.util.*;
/*
1672. Richest Customer Wealth
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the jth bank. Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
 */
public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {3,2,1},
                {5,4,1}
        };
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts){
        int max = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
}
