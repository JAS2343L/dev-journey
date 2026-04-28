package GUI;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;

public class GUI5_CALCULATOR_ADVANCED {
    public static void main(String[] args) {
        JFrame gui = new JFrame("calculator");

        JTextField tfld = new JTextField();
        tfld.setBounds(60, 100, 280, 60);
        tfld.setFont(new Font("ubuntu", Font.BOLD , 29));
        tfld.setEditable(false);
        tfld.setHorizontalAlignment(JTextField.RIGHT);

        JButton b1 = new JButton("1");
        b1.setBounds(30, 270, 70, 70);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                tfld.setText(tfld.getText() + "1");
            }
        });
        
        JButton b2 = new JButton("2");
        b2.setBounds(100, 270, 70, 70);
        b2.addActionListener(e -> tfld.setText(tfld.getText()+"2"));

        JButton b3 = new JButton("3");
        b3.setBounds(170, 270, 70, 70);
        b3.addActionListener(e -> tfld.setText(tfld.getText()+"3"));

        JButton c = new JButton("C");
        c.setBounds(30, 200, 70, 70);
        c.addActionListener(e -> tfld.setText(""));




        gui.add(tfld);
        gui.add(c);
        gui.add(b1);gui.add(b2);gui.add(b3);
        gui.setSize(400, 600);
        gui.setLayout(null);
        gui.setLocationRelativeTo(null);
        gui.setResizable(false);
        gui.setVisible(true);
    }
}
