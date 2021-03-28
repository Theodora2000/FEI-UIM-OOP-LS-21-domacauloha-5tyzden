package sk.stuba.uim.fei.oop;

import java.util.ArrayList;

public class Hlavna {
    public static void main(String [] args){

        ArrayList<String> str = new ArrayList<String>();
        for(int i=0;i<5;i++){
            str.add(Zklavesnice.readString("Zadaj string: "));
        }

        str.forEach(s -> System.out.println(s));
    }
}

