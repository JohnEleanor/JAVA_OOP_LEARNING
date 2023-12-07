import javax.swing.*;

public class App {
    
    public static void main(String[] args) {
        String msg;
        float hours, rate, salary;

        msg = JOptionPane.showInputDialog("Enter hours work ");
        hours = Float.parseFloat(msg);

        msg = JOptionPane.showInputDialog("Enter hours work ");
        rate = Float.parseFloat(msg);

        salary = (hours <= 40) ? (hours * rate) : (rate * (1.5f * hours - 20));

        /**
            *! [0] icon error
            *! [1] icon info
            *! [2] icon warning
        */
        JOptionPane.showMessageDialog(null, "Employee get salary : " + salary, "Convert",1);

    }
}