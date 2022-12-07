package HackerEarth;

public class Divisible {
    public static void main(String[] args) {
        int[] arr = {85 ,25 ,65 ,21 ,84};
        System.out.println(Check(arr));
    }
    static String Check(int[] arr){
        int temp = 0;
        for(int ints : arr){
            temp = (temp * 10) + (ints % 10);
        }
        if(temp % 10 == 0)
            return "Yes";
        else
            return "No";
    }
}
