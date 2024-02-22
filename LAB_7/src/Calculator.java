// File Name : Lab7_3.java
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Calculator implements ActionListener {
    JLabel numberLabel;
    JTextField numberField;
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9 , btn0, btnPlush, btnMinus, btnMultiply, btnDivide, btnClear, btnEqual, btnDot, btnBackSpace, btnShow;
    JFrame window;

    private int Result;


    public Calculator() {

       
        window = new JFrame("Programm Calculator ");
        Container container = window.getContentPane();
        container.setLayout(new FlowLayout());



        numberField = new JTextField(10);
        // numberField.setEditable( false );
        container.add(numberField);

        container.add(Box.createHorizontalStrut(500));
        

        btn7 = new JButton(" 7 ");
        btn7.addActionListener(this);
        container.add(btn7);

        btn8 = new JButton(" 8 ");
        btn8.addActionListener(this);
        container.add(btn8);

        btn9 = new JButton(" 9 ");
        btn9.addActionListener(this);
        container.add(btn9);

        btnMultiply = new JButton(" x ");
        btnMultiply.addActionListener(this);
        container.add(btnMultiply);

        container.add(Box.createHorizontalStrut(500));

        btn4 = new JButton(" 4 ");
        btn4.addActionListener(this);
        container.add(btn4);

        btn5 = new JButton(" 5 ");
        btn5.addActionListener(this);
        container.add(btn5);

        btn6 = new JButton(" 6 ");
        btn6.addActionListener(this);
        container.add(btn6);

        btnMinus = new JButton(" - ");
        btnMinus.addActionListener(this);
        container.add(btnMinus);

        container.add(Box.createHorizontalStrut(500));

        btn1 = new JButton(" 1 ");
        btn1.addActionListener(this);
        container.add(btn1);

        btn2 = new JButton(" 2 ");
        btn2.addActionListener(this);
        container.add(btn2);

        btn3 = new JButton(" 3 ");
        btn3.addActionListener(this);
        container.add(btn3);

        btnPlush = new JButton(" + ");
        btnPlush.addActionListener(this);
        container.add(btnPlush);

        container.add(Box.createHorizontalStrut(500));



        btnClear = new JButton(" C ");
        btnClear.addActionListener(this);
        container.add(btnClear);

        btn0 = new JButton(" 0 ");
        btn0.addActionListener(this);
        container.add(btn0);

        btnDivide = new JButton(" % ");
        btnDivide.addActionListener(this);
        container.add(btnDivide);

        btnBackSpace = new JButton(" < ");
        btnBackSpace.addActionListener(this);
        container.add(btnBackSpace);

        container.add(Box.createHorizontalStrut(500));

        btnEqual = new JButton(" = ");
        btnEqual.addActionListener(this);
        container.add(btnEqual);

        window.setSize(250, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        String str = numberField.getText();
        if (event.getSource() == btn1) {
            str += "1";
            numberField.setText(str);
        } else if (event.getSource() == btn2) {
            str += "2";
            numberField.setText(str);
        } else if (event.getSource() == btn3) {
            str += "3";
            numberField.setText(str);
        } else if (event.getSource() == btn4){
            str += "4";
            numberField.setText(str);
        }else if (event.getSource() == btn5){
            str += "5";
            numberField.setText(str);
        }else if (event.getSource() == btn6){
            str += "6";
            numberField.setText(str);   
        }else if (event.getSource() == btn7){
            str += "7";
            numberField.setText(str);   
        }else if (event.getSource() == btn8){
            str += "8";
            numberField.setText(str);
        }else if (event.getSource() == btn9){
            str += "9";
            numberField.setText(str);
        }else if (event.getSource() == btn0){
            str += "0";
            numberField.setText(str);
        }else if (event.getSource() == btnClear){
            numberField.setText("");
        }else if (event.getSource() == btnDivide){
            int value = Integer.parseInt(str);
            System.out.println(value);
        }else if (event.getSource() == btnPlush){
            String Number = numberField.getText();
            System.out.println(Integer.parseInt(Number));

            this.Result += Integer.parseInt(Number);
            numberField.setText("");
        }else if (event.getSource() == btnMinus){
            int value = Integer.parseInt(str);
            System.out.println(value);
        }else if (event.getSource() == btnMultiply){
            int value = Integer.parseInt(str);
            System.out.println(value);
        }else if (event.getSource() == btnBackSpace){
            numberField.setText(str.substring(0, str.length() - 1));
        }else if (event.getSource() == btnEqual){
            int oldResult =+ this.Result;
            int value = Integer.parseInt(str);
            int Answer = oldResult + value;
            System.out.println("Old Result : " + oldResult);
            numberField.setText(Integer.toString(Answer));

        }
    } // end method actionPerformed

    public static void main(String[] args) {
        Calculator gui = new Calculator();
    }
}