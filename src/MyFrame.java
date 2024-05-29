import javax.swing.*;
//JFrame을 새로이 구현한다.
class MyFrame extends JFrame {
    private JButton button;
    private JLabel label;
    public MyFrame() {
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("이벤트 예제");
        button = new JButton("버튼을 누르시오");
        label = new JLabel("아직 버튼이 눌려지지 않았습니다");
        button.addActionListener(new MyListener());


        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);
        this.add(panel);

        this.setVisible(true);
    }
}