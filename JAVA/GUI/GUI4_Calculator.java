package GUI;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

public class GUI4_Calculator {
    JLabel isequalto = new JLabel();
    JLabel info = new JLabel("Calculate any number");
    static int select = 0;
    static int equu = 0;
    static int simar = 0;

    GUI4_Calculator(){
        JFrame win = new JFrame("Calculator in GUI"); //window

        //title
        info.setBounds(20, 5, 550, 50);


        JTextField num1 = new JTextField();//number 1
        num1.setBounds(140, 60, 50, 25);


        JTextField num2 = new JTextField(); //number 2
        num2.setBounds(200, 60, 50, 25);

     //isequalto.setBounds(130, 50, 200, 50);


        JButton multi = new JButton("*"); //  *
        multi.setBounds(200, 100, 50, 30);


        JButton divide = new JButton("/");//  /
        divide.setBounds(260, 100, 50, 30);

        JButton plus = new JButton("+"); //   +
        plus.setBounds(80, 100, 50, 30);

        JButton minus = new JButton("-"); //  -
        minus.setBounds(140, 100, 50, 30);

        minus.setBackground(Color.WHITE); 
        plus.setBackground(Color.WHITE);
        multi.setBackground(Color.WHITE);
        divide.setBackground(Color.WHITE);



        plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                select=1;
                minus.setBackground(Color.WHITE); 
                plus.setBackground(Color.RED);
                multi.setBackground(Color.WHITE);
                divide.setBackground(Color.WHITE);                
            }
        });

        minus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                select=2;
                minus.setBackground(Color.RED); 
                plus.setBackground(Color.WHITE);
                multi.setBackground(Color.WHITE);
                divide.setBackground(Color.WHITE);
                }
          });


        multi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                select=3;
                minus.setBackground(Color.WHITE); 
                plus.setBackground(Color.white);
                multi.setBackground(Color.RED);
                divide.setBackground(Color.WHITE);                
            }
        });

        divide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                select=4;
                minus.setBackground(Color.WHITE); 
                plus.setBackground(Color.white);
                multi.setBackground(Color.WHITE);
                divide.setBackground(Color.RED);                
            }
        });



        Timer tame = new Timer(2500, e -> {  //TIMER
            info.setText("Put only Numbers to Calculate.");
        });tame.setRepeats(false);

        Timer taime = new Timer(3000, e -> {  //confused
            info.setText("Calculate numbers WITHOUT DOING (NUMBER / 0)");
        });taime.setRepeats(false);



        JButton equal = new JButton("=");//   =
        equal.setBounds(175, 150, 50, 30);
        equal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try{
                    int oye = Integer.parseInt(num1.getText());
                    int abe = Integer.parseInt(num2.getText());

                    if (select == 1){
                        simar = oye + abe;
                    }else if(select == 2){
                        simar = oye - abe;
                    }else if(select == 3){
                        simar = oye * abe;
                    }else if(select == 4){
                        simar = oye / abe;
                    }
                    info.setText("The Answer Is: "+simar);
                    
                }catch(Exception err){
                    info.setText("THERE IS NOT ANY NUMBER OR INVALID NUMBER!!");
                    tame.start();
                }
            }
        });



        win.add(info);
        win.add(num1);win.add(num2);
        win.add(plus);win.add(minus);win.add(multi);win.add(divide);
        win.add(equal);win.add(isequalto);


        win.setSize(400, 400);
        win.setLayout(null);
        win.setLocationRelativeTo(null);
        win.setResizable(false);
        win.setVisible(true);

    }

    public static void main(String[] args){
        new GUI4_Calculator();
    }
}
