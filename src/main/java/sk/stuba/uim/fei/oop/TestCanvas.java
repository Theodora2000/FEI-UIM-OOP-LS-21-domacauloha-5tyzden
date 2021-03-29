package sk.stuba.uim.fei.oop;
import java.awt.*;

public class TestCanvas extends Canvas{

    public void paint(Graphics g){
        Dimension d = getSize();
        int w = d.width;
        int h = d.height;



        g.setColor(Color.orange);
        g.fillOval(90, 80, 100, 100);
        g.setColor(Color.PINK);
        g.fillOval(90, 200, 100, 100);
        g.setColor(Color.RED);
        g.fillOval(30, 140, 100, 100);
        g.setColor(Color.MAGENTA);
        g.fillOval(150, 140, 100, 100);
        g.setColor(Color.YELLOW);
        g.fillOval(130, 180, 20, 20);
        g.setColor(Color.YELLOW);
        g.drawLine(130, 180, 250, 250);






    }
}
