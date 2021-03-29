package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;

public class Hlavna {
    public static void main(String [] args){
        JFrame F = new JFrame();
        F.setSize(300,300);
        F.setVisible(true);
        F.add(new TestCanvas());



    }


}

