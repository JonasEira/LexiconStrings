package org.example;

public class Exercise6 {
    public Exercise6(){
        String s = "Java is the worst programming language!";
        String result = s.substring(0,s.indexOf("worst") - 1) + " best " + s.substring(s.indexOf("prog"));
        System.out.println(result);
    }
}
