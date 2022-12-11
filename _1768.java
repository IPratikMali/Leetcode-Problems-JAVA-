/*
1768. Merge Strings Alternately
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.


 */
package Leetcode;

import java.util.Arrays;

public class _1768 {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1 , word2));
        
    }
    static public String mergeAlternately(String word1, String word2) {
        StringBuilder  sb = new StringBuilder();
        int length = word1.length() + word2.length();
        for(int i =0; i<length; i++){
            if(i < word1.length()){
                sb.append(word1.charAt(i));
            }
            if(i < word2.length()){
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();

    }
}

