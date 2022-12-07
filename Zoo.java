package HackerEarth;

public class Zoo {
    public static void main(String[] args) {
        String s = "zzzoooooo";
        System.out.println(Check(s));
    }
    static String Check(String s){
        int counts = 0;
        for(char ints : s.toCharArray()){
            if(ints == 'z'){
                counts++;
            }
            if((counts*2) == (s.length()-counts)){
                return "Yes";
            }
        }
        return "No";
    }
}
