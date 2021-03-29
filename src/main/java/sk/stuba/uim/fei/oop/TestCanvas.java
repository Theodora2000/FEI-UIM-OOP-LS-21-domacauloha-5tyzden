package sk.stuba.uim.fei.oop;
import java.awt.*;

public class TestCanvas extends Canvas{

    public void paint(Graphics g){
        Dimension d = getSize();
        int w = d.width;
        int h = d.height;
/*
        g.drawLine(0,0,w-1,h-1);
        g.drawLine(0,h-1,w-1,0);//zlava dole doprava dole
        g.drawRect(0,0,w-1,h-1);*/

        int i=1;
        Color C;
        while(i < w-1 - i  && i < h-1 - i){
            if(2*i < 256){
                C = new Color(2*i,255 - 2*i,255);
            }else{
                C = new Color(255,0,255);
            }
            g.setColor(C);
            g.drawRect(i,i,w-1-2*i, h-1-2*i);
            i++;
        }
    }
}
