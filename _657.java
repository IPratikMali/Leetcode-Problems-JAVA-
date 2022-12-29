/*
657. Robot Return to Origin
There is a robot starting at the position (0, 0), the origin, on a 2D plane. Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.

You are given a string moves that represents the move sequence of the robot where moves[i] represents its ith move. Valid moves are 'R' (right), 'L' (left), 'U' (up), and 'D' (down).

Return true if the robot returns to the origin after it finishes all of its moves, or false otherwise.

Note: The way that the robot is "facing" is irrelevant. 'R' will always make the robot move to the right once, 'L' will always make it move left, etc. Also, assume that the magnitude of the robot's movement is the same for each move.
 */
package Leetcode;

public class _657 {
    public static void main(String[] args) {
        String s = "LL";
        System.out.println(find(s));
    }
    static boolean find(String s){
        int rl = 0;
        int ud = 0;

        for (int i = 0; i < s.length() ; i++) {
            if(s.charAt(i) == 'R') rl++;
            else if(s.charAt(i) == 'L') rl--;
            else if(s.charAt(i) == 'U') ud++;
            else if(s.charAt(i) == 'D') ud--;
        }
        if(ud == 0 && rl == 0) return true;

        return false;
    }
}
