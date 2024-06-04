import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class MyButton extends JButton {
    static int count=0;
    int index;
    public MyButton(String s){
        super(s);
        index=count++;
    }
}