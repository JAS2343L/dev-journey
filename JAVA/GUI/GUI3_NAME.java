package GUI;
import javax.swing.*;
import java.awt.event.*;

public class GUI3_NAME {
    static int crack =0;
    static int enter =0;
    public static void main(String[] args) {
        
        JFrame win = new JFrame();

        JTextField txt = new JTextField(); //TEXT FIELD
        txt.setBounds(200, 280, 200, 30);
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if (crack == 7){
                    System.out.println("\nYOU BROKE THE BUTTON AND NOW YOU TRYING TO BROKE YOUR ENTER KEY!!!");
                    enter++;
                }else{
                System.out.println("\nWE PUT AN SUBMIT BUTTON AT THE RIGHT, FOR SHOWOFF@!!! OR FOR SUBMITTING NAME??");
                }
                if (enter == 7){
                    System.out.println("\nOH NICE, YOU WONT STOP THERE\nOK, NO TEXTFIELD!!");
                    txt.setVisible(false);
                }
            }
        });

        JLabel label = new JLabel("What is Your Name:"); //LABEL
        label.setBounds(200, 250, 200, 30);

        JButton tap = new JButton("SUBMIT"); //BUTTON
        tap.setBounds(400, 280, 100, 29);
        tap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                crack++;
                String n = txt.getText();
                if (txt.getText().isEmpty()){
                    System.out.println("Hello \"WHERE IS YOUR NAME??\"");
                }else{
                    System.out.println("Hello " + n);
                }
                
                if(crack == 7){
                    System.out.print("Sorry, The Button Is Cracked, NO MORE CLICKING!!");
                    tap.setVisible(false);
                }
            }
        });

        win.add(txt); win.add(label); win.add(tap);
        win.setSize(800, 700);
        win.setLayout(null);
        win.setVisible(true);

    }
}
