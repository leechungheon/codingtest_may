import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {
    boolean flag=false;
    private int light_number=0;
    public MyPanel(){
        setLayout(new BorderLayout());
        JButton b=new JButton("traffic light turn on");
        b.addActionListener(this);
        add(b,BorderLayout.SOUTH);
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        /*
        이 줄은 상위 클래스(JComponent)의 paintComponent 메서드를 호출합니다.
        이 호출은 컴포넌트의 표면을 지우는 등의 기본 페인팅 작업을 수행합니다.
        이를 통해 이전에 그려진 내용이 지워지고, 컴포넌트가 올바르게 다시 그려질 수 있게 됩니다.
         */
        g.setColor(Color.BLACK);
        g.drawOval(100, 100, 100, 100);
        g.drawOval(100, 200, 100, 100);
        g.drawOval(100, 300, 100, 100);
        if (light_number == 0) {
            g.setColor(Color.RED);
            g.fillOval(100, 100, 100, 100);
        } else if (light_number == 1) {
            g.setColor(Color.GREEN);
            g.fillOval(100, 200, 100, 100);
        } else {
            g.setColor(Color.YELLOW);
            g.fillOval(100, 300, 100, 100);
        }
    }
        public void actionPerformed(ActionEvent arg0){
            if(++light_number>=3)
                light_number=0;
            repaint();
        }
    }