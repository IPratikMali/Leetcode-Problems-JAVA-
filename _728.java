/*
728. Self Dividing Numbers
A self-dividing number is a number that is divisible by every digit it contains.

For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
A self-dividing number is not allowed to contain the digit zero.

Given two integers left and right, return a list of all the self-dividing numbers in the range [left, right].
 */
package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class _728 {

    public static void main(String args[]){
        int start = 47;
        int end = 85;
        System.out.println(selfDividingNumbers(start , end));
    }
     static List<Integer> selfDividingNumbers(int start , int end){
       List ans = new ArrayList();
        int count = 0;
        for (int i = start; i <= end; i++) {
            int numb = i;
            while(numb>0){
                int temp = numb % 10;
                if(temp == 0){
                    count++;
                    break;
                }
                if(i % temp != 0){
                    break;
                }
                count++;
                numb = numb / 10;
            }
            if(count == (int)(Math.log10(i)+1)){
                ans.add(i);
            }
            count = 0;
        }
        return ans;
    }
}
