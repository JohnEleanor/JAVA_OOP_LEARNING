// import java.util.Scanner;
import javax.swing.*;

public class Lab_4_2 {
    public static void main(String[] args) {

        int num1, num2;
        double result = 0;
        char operator;
        boolean done = true;
        String message, inPut;

        inPut = JOptionPane.showInputDialog(null, "Enter Frist Value");
        num1 = Integer.parseInt(inPut);

        inPut = JOptionPane.showInputDialog(null, "Enter second Value");
        num2 = Integer.parseInt(inPut);


        message = JOptionPane.showInputDialog("Enter operator(+, -, *, /, %) : ");
        operator = message.charAt(0);

        
        switch (operator) {
            case '+':
                result = num1 + num2;
                // message = "result = num1 + num2 = ";
                message = num1+ " + "+ num2 + " = ";

                break;

            case '-':
                result = num1 - num2;
                // message = "result = num1 - num2 = ";
                message = num1+ " - "+ num2 + " = ";
                break;
            case '*':
                result = num1 * num2;
                // message = "result = num1 * num2 = ";
                message = num1+ " * "+ num2 + " = ";

                break;

            case '/':
                result = (double) num1 / num2;
                // message = "result = num1 / num2 = ";
                message = num1+ " / "+ num2 + " = ";

                break;

            case '%':
                result = num1 % num2;
                // message = "result = num1 % num2 = ";
                message = num1+ " % "+ num2 + " = ";
                break;
            default:
                done = false;
        }
        if (done)
            // System.out.println(message + result);
            // JOptionPane.showMessageDialog(message + result);
            JOptionPane.showMessageDialog(null, message + result, "Not found ", 3);
        else
            JOptionPane.showMessageDialog(null, "Error", "Not found ", 0);
    }
}
