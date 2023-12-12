import javax.swing.*;
public class quiz_1 {
    
    public static void main(String[] args) {
        String msg;
        float C,F;

        msg = JOptionPane.showInputDialog("Enter your °C : ");
        C = Float.parseFloat(msg);

        F = (C * 9/5) + 32;


        JOptionPane.showMessageDialog(null, "This is Your °F : "+F, "Calculate", 2);



    }
}
