/*
1051. Height Checker
A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.

You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).

Return the number of indices where heights[i] != expected[i].
 */
package Leetcode;

import java.util.Arrays;

public class _1051 {
    public static void main(String[] args) {
        int[] h = {5,1,2,3,4};
        System.out.println(heightChecker(h));
    }
    static int heightChecker (int[] h){
        int count = 0;
        int[] e = h.clone();
        Arrays.sort(h);
        for (int i = 0; i < h.length; i++) {
            if(e[i] != h[i]) count++;
        }
        return count;
    }
}
