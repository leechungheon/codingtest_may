import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MyPanel_draw extends JPanel implements MouseMotionListener {
    private int index=0;
    Point[] array=new Point[1000];
    public MyPanel_draw(){
        this.addMouseMotionListener(this);
    }
    public void mouseDragged(MouseEvent e){
        int x=e.getX();
        int y=e.getY();
        if(index>1000)
            return;
        array[index]=new Point();
        array[index].x=e.getX();
        array[index].y=e.getY();
        index++;
        repaint();
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Point p : array)
            if (p != null)
                g.drawRect(p.x, p.y, 1, 1);
    }
    @Override
    public void mouseMoved(MouseEvent arg0) {
    }
}
