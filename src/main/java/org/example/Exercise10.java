package org.example;

public class Exercise10 {
    public Exercise10(){
        String s = "Carl,Susie,Fredrick,Bob,Erik";
        String[] names = s.split(",");
        for(String name : names){
            System.out.print(name + " ");
        }
    }
}
