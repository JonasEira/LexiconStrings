package org.example;

public class Exercise11 {
    public Exercise11() {
        String s  = "ThisShouldBeConverted";
        System.out.println();
        char[] s_chars = new char[s.length()];
        for(int n = 0; n < s.length(); n++){
            s_chars[n] = s.charAt(n);
        }
        for(char c : s_chars){
            System.out.print(c + " ");
            
        }
    }
}
