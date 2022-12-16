/*
2108. Find First Palindromic String in the Array
Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".

A string is palindromic if it reads the same forward and backward.
 */
package Leetcode;


public class _2108 {
    public static void main(String[] args) {
        String[] arr = {"abc","car","ada","racecar","cool"};
        System.out.println(find(arr));

    }
    static String find(String[] arr){
        for (int i = 0; i < arr.length ; i++) {
            String s = arr[i];
            int k = s.length()-1;
            int count = 0;
            for (int j = 0; j < s.length()/2; j++,k--) {
                if(s.charAt(j) != s.charAt(k)) {
                    count++;
                    break;
                }
            }
            if(count == 0) return s;
        }
        return "";
    }
}
