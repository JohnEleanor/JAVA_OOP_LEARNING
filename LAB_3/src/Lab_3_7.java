import javax.swing.*;
public class Lab_3_7 {
    public static void main(String[] args) {
        String message;

        message = JOptionPane.showInputDialog("Enter Your name");
        

        JOptionPane.showMessageDialog(null, "You entered : \"" + message + "\"", "EXIT", 1);

    }
}
