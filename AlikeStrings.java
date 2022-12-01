/*
1704. Determine if String Halves Are Alike

You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.

Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.

Return true if a and b are alike. Otherwise, return false.
 */

package Leetcode;

public class AlikeStrings {
    public static void main(String args[]){
        String s = "Uo";

        System.out.println(halvesAreAlike(s));

    }
    static boolean halvesAreAlike(String s){
        String a = new String();
        String b = new String();
        for (int i = 0; i < s.length(); i++) {
            if(i <= (s.length()-1)/2){
                a = a + s.charAt(i);
            }
            else {
                b = b + s.charAt(i);
            }
        }
        return Check(a , b);


    }

    static boolean Check(String a , String b){
        int count1 = 0;
        int count2 = 0;
        for(char a2 : a.toCharArray()){
            if(a2=='a' || a2=='e' || a2=='i' || a2=='o' || a2=='u'|| a2=='A' || a2=='E' || a2=='I' || a2=='O' || a2=='U' ){
                count1++;
            }
        }
        for(char b2 : b.toCharArray()){
            if(b2=='a' || b2=='e' || b2=='i' || b2=='o' || b2=='u' || b2=='A' || b2=='E' || b2=='I' || b2=='O' || b2=='U'){
                count2++;
            }
        }
        if(count1 == count2){
            return true;
        }
        return false;
    }
}
