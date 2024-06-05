import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyPanel_rec extends JPanel implements MouseListener {
    Rectangle[] array=new Rectangle[100];
    int index=0;
    public MyPanel_rec(){
        this.addMouseListener(this);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(Rectangle r:array)
            if(r!=null)
                g.drawRect(r.x,r.y,r.w,r.h);
        /*r 객체의 x, y 좌표와 너비(w), 높이(h)를 사용하여 사각형을 그립니다.*/
    }
    public void mousePressed(MouseEvent e){
        if(index>100)
            return;
        array[index]=new Rectangle();
        array[index].x=e.getX();
        array[index].y=e.getY();
        array[index].w=50;
        array[index].h=50;
        index++;
        repaint();
    }
    public void mouseReleased(MouseEvent e) {
    }
    public void mouseClicked(MouseEvent e) {
    }
    @Override
    public void mouseEntered(MouseEvent e) {
    }
    @Override
    public void mouseExited(MouseEvent e) {
    }

}
