import javax.swing.*;
//JFrame을 새로이 구현한다.
class MyFrame extends JFrame {
    //JFrame은 java swing에서 GUI 창을 만드는데 사용
    private JButton button;
    private JLabel label;
    public MyFrame() {//JFrame의 기능을 확장하고 사용자 정의 기능을 추가 -> 서브클래스/생성자
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

        this.setVisible(true);//프레임이 화면에 보이도록 설정.
    }
}