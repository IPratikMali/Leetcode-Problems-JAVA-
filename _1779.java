/*
1779. Find Nearest Point That Has the Same X or Y Coordinate
You are given two integers, x and y, which represent your current location on a Cartesian grid: (x, y). You are also given an array points where each points[i] = [ai, bi] represents that a point exists at (ai, bi). A point is valid if it shares the same x-coordinate or the same y-coordinate as your location.

Return the index (0-indexed) of the valid point with the smallest Manhattan distance from your current location. If there are multiple, return the valid point with the smallest index. If there are no valid points, return -1.

The Manhattan distance between two points (x1, y1) and (x2, y2) is abs(x1 - x2) + abs(y1 - y2).
 */
package Leetcode;

import java.util.TreeSet;

public class _1779 {
    public static void main(String[] args) {
        int[][] arr = {{1,1},{1,1}};
        int x = 1;
        int y = 1;
        System.out.println(nearestValidPoint(x,y,arr));
    }
    static Object nearestValidPoint(int x , int y , int[][] arr){
        int ans = Integer.MAX_VALUE;
        int index = 0;
        int minindex = -1;
        for(int[] ints : arr){
            if(ints[0] == x || ints[1] == y){
                if(ans > (Math.abs(x-ints[0]) + (Math.abs(y-ints[1])))){
                    ans = Math.abs(x-ints[0]) + Math.abs(y-ints[1]);
                    minindex = index;
                }
            }
            index++;
        }
        return minindex;
    }
}
