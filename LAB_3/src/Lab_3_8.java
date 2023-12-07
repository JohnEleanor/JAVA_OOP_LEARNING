import javax.swing.*;
public class Lab_3_8 {

    public static void main(String[] args) {
        float hours, rate, salary;
        String msg;

        msg = JOptionPane.showInputDialog("Enter hours work ");
        hours = Float.parseFloat(msg);


        msg = JOptionPane.showInputDialog("Enter hourly rate");
        rate = Float.parseFloat(msg);


        salary = (hours <= 40) ? (hours*rate) : (rate * (1.5f * hours - 20));

        JOptionPane.showMessageDialog(null, "Employee get salary : " + salary);

    }
}