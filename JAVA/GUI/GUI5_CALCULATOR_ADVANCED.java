package GUI;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;

public class GUI5_CALCULATOR_ADVANCED {

    static double num1 = 0, num2 = 0, num3 = 0, result = 0;
    char operator;

    JLabel showoperator = new JLabel("");
    
      GUI5_CALCULATOR_ADVANCED() {

        showoperator.setBounds(300,40,100,30);
        showoperator.setFont(new Font("ubuntu", Font.BOLD, 22));




        //New Window:

        JFrame gui = new JFrame("calculator");




        //Text Field:

        JTextField txtfield = new JTextField();
        txtfield.setBounds(30, 100, 320, 60);
        txtfield.setFont(new Font("ubuntu", Font.BOLD , 29));
        txtfield.setEditable(false);
        txtfield.setHorizontalAlignment(JTextField.RIGHT);




        //My name:

        JLabel me = new JLabel("Made By Jasmeet(JAS2343L)");
        me.setBounds(96, 560, 200, 99);
        me.setFont(new Font("ubuntu", Font.BOLD, 13));




        //buttons:

        JButton b7 = new JButton("7");
        b7.setBounds(30, 280, 70, 70);
        b7.addActionListener(e -> txtfield.setText(txtfield.getText()+"7"));
        b7.setFont(new Font("ubuntu", Font.BOLD, 22));
        
        JButton b8 = new JButton("8");
        b8.setBounds(110, 280, 70, 70);
        b8.addActionListener(e -> txtfield.setText(txtfield.getText()+"8"));
        b8.setFont(new Font("ubuntu", Font.BOLD, 22));

        JButton b9 = new JButton("9");
        b9.setBounds(190, 280, 70, 70);
        b9.addActionListener(e -> txtfield.setText(txtfield.getText()+"9"));
        b9.setFont(new Font("ubuntu", Font.BOLD, 22));

        JButton b4 = new JButton("4");
        b4.setBounds(30, 360, 70, 70);
        b4.addActionListener(e -> txtfield.setText(txtfield.getText()+"4"));
        b4.setFont(new Font("ubuntu", Font.BOLD, 22));

        JButton b5 = new JButton("5");
        b5.setBounds(110, 360, 70, 70);
        b5.addActionListener(e -> txtfield.setText(txtfield.getText()+"5"));
        b5.setFont(new Font("ubuntu", Font.BOLD, 22));

        JButton b6 = new JButton("6");
        b6.setBounds(190, 360, 70, 70);
        b6.addActionListener(e -> txtfield.setText(txtfield.getText()+"6"));
        b6.setFont(new Font("ubuntu", Font.BOLD, 22));

        JButton b1 = new JButton("1");
        b1.setBounds(30, 440, 70, 70);
        b1.addActionListener(e -> txtfield.setText(txtfield.getText()+"1"));
        b1.setFont(new Font("ubuntu", Font.BOLD, 22));

        JButton b2 = new JButton("2");
        b2.setBounds(110, 440, 70, 70);
        b2.addActionListener(e -> txtfield.setText(txtfield.getText()+"2"));
        b2.setFont(new Font("ubuntu", Font.BOLD, 22));

        JButton b3 = new JButton("3");
        b3.setBounds(190, 440, 70, 70);
        b3.addActionListener(e -> txtfield.setText(txtfield.getText()+"3"));
        b3.setFont(new Font("ubuntu", Font.BOLD, 22));

        JButton b0 = new JButton("0");
        b0.setBounds(110, 520, 70, 70);
        b0.addActionListener(e -> txtfield.setText(txtfield.getText()+"0"));
        b0.setFont(new Font("ubuntu", Font.BOLD, 22));

        JButton b00 = new JButton("00");
        b00.setBounds(30, 520, 70, 70);
        b00.addActionListener(e -> txtfield.setText(txtfield.getText()+"00"));
        b00.setFont(new Font("ubuntu", Font.BOLD, 22));




        //Operators

        JButton plus = new JButton("+");
        plus.setBounds(280, 280, 70, 70);
        plus.setFont(new Font("ubuntu", Font.BOLD, 22));
        plus.addActionListener(e -> {
            try{
                    num1 =Double.parseDouble(txtfield.getText());
                    operator = '+';
                    txtfield.setText("");
                    showoperator.setText("+");
            }catch(java.lang.NumberFormatException v){
                showoperator.setText("+");
            }
        });


        
        JButton minus = new JButton("-");
        minus.setBounds(280, 360, 70, 70);
        minus.setFont(new Font("ubuntu", Font.BOLD, 22));
        minus.addActionListener(e -> {
            try{
                    num1 = Double.parseDouble(txtfield.getText());
                    operator = '-';
                    txtfield.setText("");
                    showoperator.setText("-");
            }catch(java.lang.NumberFormatException v){
                showoperator.setText("-");
            }
        });



        JButton multiply = new JButton("*");
        multiply.setBounds(280, 440, 70, 70);
        multiply.setFont(new Font("ubuntu", Font.BOLD, 22));
        multiply.addActionListener(e -> {
            try{
                    num1 = Double.parseDouble(txtfield.getText());
                    operator = '*';
                    txtfield.setText("");
                    showoperator.setText("*");
            }catch(java.lang.NumberFormatException v){
                showoperator.setText("*");
            }
        });


        
        JButton divide = new JButton("/");
        divide.setBounds(280, 520, 70, 70);
        divide.setFont(new Font("ubuntu", Font.BOLD, 22));
        divide.addActionListener(e -> {
            try{
                    num1 = Double.parseDouble(txtfield.getText());
                    operator = '/';
                    txtfield.setText("");
                    showoperator.setText("/");
            }catch(java.lang.NumberFormatException v){
                showoperator.setText("/");
            }
        });



        JButton equal = new JButton("=");          //THE MAIN Equal Button..../.
        equal.setBounds(190, 520, 70, 70);
        equal.setFont(new Font("ubuntu", Font.BOLD, 22));
        equal.addActionListener(e -> {
            try{
            String number = txtfield.getText();

            if(!number.equals(String.valueOf(result))){
                num2 = Double.parseDouble(txtfield.getText());
                num3 = num2;
            }else{
                num2 = num3;
            }
            switch (operator){
                case '+': result = num1 + num2; break;
                case '-':  result = num1 -  num2; break;
                case '*':  result = num1 *  num2; break;
                case '/':  try  {
                    if(num2 == 0){
                        txtfield.setText("ERROR!! press C");
                    }else{result =  num1 /  num2;}
                    break;}  
                    catch(ArithmeticException v)  {System.out.println();}
            }
            txtfield.setText(String.valueOf(result));
            showoperator.setText("=");
            num1 = result;
        }catch (java.lang.NumberFormatException v){
            System.out.println();
        }catch (Exception v){
            System.out.println();
        }
        }
    );






        //clear, Buttons:

        JButton c = new JButton("C");
        c.setBounds(30, 200, 70, 70);
        c.addActionListener(e -> {
            txtfield.setText("");
            showoperator.setText("");
        });
        c.setFont(new Font("ubuntu", Font.BOLD, 22));

        JButton backspace = new JButton ("⌫");
        backspace.setBounds(110, 200, 70, 70);;
        backspace.addActionListener(e -> {
            if (txtfield.getText().length() > 0){
                txtfield.setText(txtfield.getText().substring(0, txtfield.getText().length() -1));
            }
        });




        //adding all in one window:

        gui.add(showoperator);
        gui.add(txtfield);


        gui.add(c) ;gui.add(backspace);    
                                                                                   gui.add(plus);
        gui.add(b7);  gui.add(b8);gui.add(b9);   gui.add(minus);
        gui.add(b4);  gui.add(b5);gui.add(b6);   gui.add(multiply);
        gui.add(b3);  gui.add(b2);gui.add(b1);   gui.add(divide);
        gui.add(b00);gui.add(b0);                          gui.add(equal);

        gui.add(me);






        //Gui Window:

        gui.setSize(380, 620);
        gui.setLayout(null);
        gui.setLocationRelativeTo(null);
        gui.setResizable(false);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI5_CALCULATOR_ADVANCED();
    }
}
