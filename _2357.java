package Leetcode;

public class _2357 {
    public static void main(String[] args) {
        String[] arr = {"feh","w","w","lwd","c","s","vk","zwlv","n","w","sw","qrd","w","w","mqe","w","w","w","gb","w","qy","xs","br","w","rypg","wh","g","w","w","fh","w","w","sccy"};
        String s = "w";
        System.out.println(find(arr , s));
    }
    static int find(String[] words, String s){
        int count = 0;
        for(int i = 0; i < words.length; i++){
            String s1 = words[i];
            if(s1.charAt(0) == s.charAt(0)) {
                count++;
            }
        }
        return count;
    }
}
