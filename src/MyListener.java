import javax.swing.*;
import java.awt.event.*;
//리스너를 상속받는다. 동작에 반응해 이벤트를 처리한다.
class MyListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        button.setText("마침내 버튼이 눌려졌습니다.");
        // label.setText("마침내 버튼이 눌려졌습니다.");
    }
}