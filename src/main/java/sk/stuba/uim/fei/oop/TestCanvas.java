package sk.stuba.uim.fei.oop;
import java.awt.*;

public class TestCanvas extends Canvas{

    public void paint(Graphics g){
        Dimension d = getSize();
        int w = d.width;
        int h = d.height;

        g.setColor(Color.RED);
        g.fillRect(10, 100, 100, 100);
        g.setColor(Color.BLACK);
        g.drawRect(10, 100, 100, 100);

        g.setColor(Color.RED);
        g.fillOval(120, 200, 100, 100);
        g.setColor(Color.BLACK);
        g.drawOval(120, 200, 100, 100);




    }
}
