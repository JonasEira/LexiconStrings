package org.example;

public class Exercise9 {
    public Exercise9(){
        String s  = "Oil and Water";
        String[] t  = new String[2];
        t[0] = s.substring(0,s.indexOf("and"));
        t[1] = s.substring(s.indexOf("Wat"));
        for(String tmp : t){
            System.out.println("tmp=" + tmp);
        }
    }
}
