/*
1678. Goal Parser Interpretation
You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order. The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". The interpreted strings are then concatenated in the original order.

Given the string command, return the Goal Parser's interpretation of command.
 */
package Leetcode;

public class _1678 {
    public static void main(String[] args) {
        String c = "(al)G(al)()()G";
        System.out.println(interpret(c));
    }
    static String interpret(String command) {
        StringBuilder sb = new StringBuilder(command);

        for(int i = sb.length()-1; i >= 0; i--){
            if(sb.charAt(i) == ')' && sb.charAt(i-1)=='('){
                sb.deleteCharAt(i);
                sb.deleteCharAt(i-1);
                sb.insert(i-1 , 'o');
            }
            else if(sb.charAt(i) == ')' && sb.charAt(i-1)!='(' || sb.charAt(i)=='('){
                 sb.deleteCharAt(i);
            }
        }
        return sb.toString();
    }
}
