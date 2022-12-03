package Leetcode;

public class AvgSalary {
    public static void main(String[] args) {
        double[] arr = {4000,3000,1000,2000};
        System.out.println(average(arr));
    }
    static double average(double[] arr){
        double max = Integer.MIN_VALUE;
        double min = Integer.MAX_VALUE;
        for(double ints : arr){
            if(ints > max)
                max = ints;
            if(ints < min)
                min = ints;
        }
        double sum = 0;
        for(double ints2 : arr){
            if(max == ints2 || min == ints2)
                continue;
            sum = sum + ints2;
        }
        sum = sum/(arr.length-2);
        return  sum;
    }
}
