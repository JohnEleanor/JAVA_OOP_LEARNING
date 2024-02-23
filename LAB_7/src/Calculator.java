
// File Name : Lab7_3.java
/*
 * นาโชติรส สุวรรณสุต 6606021420148
 * Calculator Program (+ - * / %)
 */
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Calculator implements ActionListener {
    JLabel numberLabel;
    JTextField This_is_numberInput_By_Me_Chotiros;
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnPlush, btnMinus, btnMultiply, btnDivide,
            btnClear, btnEqual, btnDot, btnBackSpace, btnShow, btnPercent;
    JFrame window;

    private Double This_is_Result_By_Me_Chotiros;
    private String This_is_CurrentAction_By_Me_Chotiros;

    public Calculator() {

        window = new JFrame("Calculator Program");
        Container container = window.getContentPane();
        container.setLayout(new FlowLayout());

        This_is_numberInput_By_Me_Chotiros = new JTextField(10);
        container.add(This_is_numberInput_By_Me_Chotiros);

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

        btnDivide = new JButton(" ÷ ");
        btnDivide.addActionListener(this);
        container.add(btnDivide);

        btnPercent = new JButton(" % ");
        btnPercent.addActionListener(this);
        container.add(btnPercent);

        container.add(Box.createHorizontalStrut(500));



        btnDot = new JButton(" . ");
        btnDot.addActionListener(this);
        container.add(btnDot);

        btnBackSpace = new JButton(" ← ");
        btnBackSpace.addActionListener(this);
        container.add(btnBackSpace);

        btnEqual = new JButton(" = ");
        btnEqual.addActionListener(this);
        container.add(btnEqual);

        window.setSize(250, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        String str = This_is_numberInput_By_Me_Chotiros.getText();

        if (event.getSource() == btn1) {
            str += "1";
            This_is_numberInput_By_Me_Chotiros.setText(str);
        } else if (event.getSource() == btn2) {
            str += "2";
            This_is_numberInput_By_Me_Chotiros.setText(str);
        } else if (event.getSource() == btn3) {
            str += "3";
            This_is_numberInput_By_Me_Chotiros.setText(str);
        } else if (event.getSource() == btn4) {
            str += "4";
            This_is_numberInput_By_Me_Chotiros.setText(str);
        } else if (event.getSource() == btn5) {
            str += "5";
            This_is_numberInput_By_Me_Chotiros.setText(str);
        } else if (event.getSource() == btn6) {
            str += "6";
            This_is_numberInput_By_Me_Chotiros.setText(str);
        } else if (event.getSource() == btn7) {
            str += "7";
            This_is_numberInput_By_Me_Chotiros.setText(str);
        } else if (event.getSource() == btn8) {
            str += "8";
            This_is_numberInput_By_Me_Chotiros.setText(str);
        } else if (event.getSource() == btn9) {
            str += "9";
            This_is_numberInput_By_Me_Chotiros.setText(str);
        } else if (event.getSource() == btn0) {
            str += "0";
            This_is_numberInput_By_Me_Chotiros.setText(str);
        } else if (event.getSource() == btnDot) {
            str += ".";
            This_is_numberInput_By_Me_Chotiros.setText(str);

        } else if (event.getSource() == btnClear) {
            This_is_numberInput_By_Me_Chotiros.setText("");
            str = "";
            this.This_is_Result_By_Me_Chotiros = 0.0;
        } else if (event.getSource() == btnDivide) { /* หาร */

            String Number = This_is_numberInput_By_Me_Chotiros.getText();
            this.This_is_Result_By_Me_Chotiros = Double.parseDouble(Number);
            This_is_numberInput_By_Me_Chotiros.setText("");

            This_is_CurrentAction_By_Me_Chotiros = "/";
        } else if (event.getSource() == btnPlush) { /* บวก */
            String Number = This_is_numberInput_By_Me_Chotiros.getText();
            this.This_is_Result_By_Me_Chotiros = Double.parseDouble(Number);
            This_is_numberInput_By_Me_Chotiros.setText("");

            This_is_CurrentAction_By_Me_Chotiros = "+";
        } else if (event.getSource() == btnMinus) { /* ลบ */
            String Number = This_is_numberInput_By_Me_Chotiros.getText();
            this.This_is_Result_By_Me_Chotiros = Double.parseDouble(Number);
            This_is_numberInput_By_Me_Chotiros.setText("");
            This_is_CurrentAction_By_Me_Chotiros = "-";
        } else if (event.getSource() == btnMultiply) { /* คูณ */
            String Number = This_is_numberInput_By_Me_Chotiros.getText();

            this.This_is_Result_By_Me_Chotiros = Double.parseDouble(Number);
            This_is_numberInput_By_Me_Chotiros.setText("");
            This_is_CurrentAction_By_Me_Chotiros = "*";
        } else if (event.getSource() == btnPercent) { /* เปอร์เซ็น */
            String Number = This_is_numberInput_By_Me_Chotiros.getText();

            this.This_is_Result_By_Me_Chotiros = Double.parseDouble(Number);
            This_is_numberInput_By_Me_Chotiros.setText("");
            This_is_CurrentAction_By_Me_Chotiros = "%";
        } else if (event.getSource() == btnBackSpace) { /* ลบคำ */
            This_is_numberInput_By_Me_Chotiros.setText(str.substring(0, str.length() - 1));

        } else if (event.getSource() == btnEqual) { /* เท่ากับ */
            Double This_is_Result_By_Me_Chotiros = Double.parseDouble(This_is_numberInput_By_Me_Chotiros.getText());
            Double Answer;
            switch (This_is_CurrentAction_By_Me_Chotiros) {
                case "+":

                    Answer = this.This_is_Result_By_Me_Chotiros + This_is_Result_By_Me_Chotiros;

                    This_is_numberInput_By_Me_Chotiros.setText(Double.toString(Answer));
                    break;
                case "-":
                    Answer = this.This_is_Result_By_Me_Chotiros - This_is_Result_By_Me_Chotiros;
                    
                    This_is_numberInput_By_Me_Chotiros.setText(Double.toString(Answer));
                    break;
                case "*":
                    Answer = this.This_is_Result_By_Me_Chotiros * This_is_Result_By_Me_Chotiros;
                    
                    This_is_numberInput_By_Me_Chotiros.setText(Double.toString(Answer));
                    break;
                case "/":
                
                    Answer = this.This_is_Result_By_Me_Chotiros / This_is_Result_By_Me_Chotiros;
                    
                    This_is_numberInput_By_Me_Chotiros.setText(Double.toString(Answer));
                    break;
                case "%":
               
                    Answer = this.This_is_Result_By_Me_Chotiros % This_is_Result_By_Me_Chotiros;
                    
                    This_is_numberInput_By_Me_Chotiros.setText(Double.toString(Answer));
                    break;
                default:
                    break;
            }

        }
    }

    public static void main(String[] args) {

        new Calculator();
    }
}
