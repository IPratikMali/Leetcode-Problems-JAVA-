package Leetcode;

public class _557 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(find(s));

    }
    static String find(String s){
        StringBuilder sb = new StringBuilder();
        String ans = new String();
        for (int i = 0; i < s.length() ; i++) {
            if(s.charAt(i) != ' '){
                sb.append(s.charAt(i));
            }
            else{
                sb.reverse();
                sb.append(' ');
                ans = ans + String.valueOf(sb);
                sb = new StringBuilder("");
            }
            if(i == s.length()-1){
                sb.reverse();
                ans = ans + String.valueOf(sb);
            }

        }
        return ans;
    }
}
