import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame {
    private JButton button;
    private JLabel label;

    public MyFrame() {
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("이벤트 예제");

        button = new JButton("버튼을 누르시오");
        label = new JLabel("아직 버튼이 눌려지지 않았습니다");

        button.addActionListener(e -> {
            label.setText("마침내 버튼이 눌려졌습니다.");
        });

        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);
        this.add(panel);

        this.setVisible(true);
    }

}
