/*
1859. Sorting the Sentence
A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.

A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.

For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.
 */
package Leetcode;

public class _1859 {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(find(s));
    }
    static String find (String s){
       String s2 = "";
       int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' '){
                count++ ;
            }
        }
        String[] ans = new String[count + 1];
        for (int i = 0; i < s.length(); i++) {
            if( s.charAt(i) == ' ') continue;
            if(!Character.isDigit(s.charAt(i))){
                s2  = s2 + s.charAt(i);
                continue;
            }
            int  index = Integer.parseInt(String.valueOf(s.charAt(i)));
           ans[index-1] = s2;
            s2 = "";
        }
        for (int i = 0; i < ans.length; i++) {
            s2 = s2 + ans[i];
            if(i != ans.length-1){
                s2 = s2 + ' ';
            }
        }
        return  s2;
    }
}
