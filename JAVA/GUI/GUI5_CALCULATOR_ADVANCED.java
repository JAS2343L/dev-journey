package GUI;
import javax.swing.*;
import java.awt.event.*;

public class GUI5_CALCULATOR_ADVANCED {
    public static void main(String[] args) {
        JFrame gui = new JFrame("calculator");

        JButton a = new JButton("1");
        a.setBounds(30, 270, 70, 70);

        JButton b = new JButton("2");
        b.setBounds(110, 270, 70, 70);

        JButton c = new JButton("3");
        c.setBounds(190, 270, 70, 70);




        gui.add(a);gui.add(b);gui.add(c);
        gui.setSize(400, 600);
        gui.setLayout(null);
        gui.setLocationRelativeTo(null);
        gui.setResizable(false);
        gui.setVisible(true);
    }
}
