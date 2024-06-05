import javax.swing.*;
public class MouseEventTest extends JFrame {
    public MouseEventTest() {
        setSize(300, 300);
        setTitle("마우스로 사각형 그리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new MyPanel_rec());
        setVisible(true);
    }
    public static void main(String[] args) {
        MouseEventTest s = new MouseEventTest();
    }
}
