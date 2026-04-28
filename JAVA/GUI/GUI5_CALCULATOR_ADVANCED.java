package GUI;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;

public class GUI5_CALCULATOR_ADVANCED {
    
      GUI5_CALCULATOR_ADVANCED() {

        //New Window:

        JFrame gui = new JFrame("calculator");


        //Text Field:

        JTextField txtfield = new JTextField();
        txtfield.setBounds(44, 100, 280, 60);
        txtfield.setFont(new Font("ubuntu", Font.BOLD , 29));
        txtfield.setEditable(false);
        txtfield.setHorizontalAlignment(JTextField.RIGHT);

        //My name:

        JLabel me = new JLabel("Made By Jasmeet(JAS2343L)");
        me.setBounds(90, 560, 200, 99);
        me.setFont(new Font("ubuntu", Font.BOLD, 13));


        //buttons:

        JButton b7 = new JButton("7");
        b7.setBounds(30, 280, 70, 70);
        b7.addActionListener(e -> txtfield.setText(txtfield.getText()+"7"));
        
        JButton b8 = new JButton("8");
        b8.setBounds(110, 280, 70, 70);
        b8.addActionListener(e -> txtfield.setText(txtfield.getText()+"8"));

        JButton b9 = new JButton("9");
        b9.setBounds(190, 280, 70, 70);
        b9.addActionListener(e -> txtfield.setText(txtfield.getText()+"9"));

        JButton b4 = new JButton("4");
        b4.setBounds(30, 360, 70, 70);
        b4.addActionListener(e -> txtfield.setText(txtfield.getText()+"4"));

        JButton b5 = new JButton("5");
        b5.setBounds(110, 360, 70, 70);
        b5.addActionListener(e -> txtfield.setText(txtfield.getText()+"5"));

        JButton b6 = new JButton("6");
        b6.setBounds(190, 360, 70, 70);
        b6.addActionListener(e -> txtfield.setText(txtfield.getText()+"6"));

        JButton b1 = new JButton("1");
        b1.setBounds(30, 440, 70, 70);
        b1.addActionListener(e -> txtfield.setText(txtfield.getText()+"1"));

        JButton b2 = new JButton("2");
        b2.setBounds(110, 440, 70, 70);
        b2.addActionListener(e -> txtfield.setText(txtfield.getText()+"2"));

        JButton b3 = new JButton("3");
        b3.setBounds(190, 440, 70, 70);
        b3.addActionListener(e -> txtfield.setText(txtfield.getText()+"3"));

        JButton b0 = new JButton("0");
        b0.setBounds(110, 520, 70, 70);
        b0.addActionListener(e -> txtfield.setText(txtfield.getText()+"0"));

        //clear all, Button:

        JButton c = new JButton("C");
        c.setBounds(30, 200, 70, 70);
        c.addActionListener(e -> txtfield.setText(""));




        //adding all in one window:

        gui.add(txtfield);
        gui.add(c);

        gui.add(b7);gui.add(b8);gui.add(b9);
        gui.add(b4);gui.add(b5);gui.add(b6);
        gui.add(b3);gui.add(b2);gui.add(b1);
                    gui.add(b0);

        gui.add(me);

        //Gui Window:

        gui.setSize(370, 620);
        gui.setLayout(null);
        gui.setLocationRelativeTo(null);
        gui.setResizable(false);
        gui.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI5_CALCULATOR_ADVANCED();
    }
}
