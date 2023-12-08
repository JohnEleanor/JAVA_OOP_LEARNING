import javax.swing.*;
public class quiz_2 {
    
    public static void main(String[] args) {
        String msg;
        float principle, interate, moneyYou_get; 
        
        for (int i = 1; i < 6; i++) {

            msg = JOptionPane.showInputDialog("Enter your principle at year ["+i+"]");
            principle = Float.parseFloat(msg);


            msg = JOptionPane.showInputDialog("Enter your interate at year at year ["+i+"]");
            interate = Float.parseFloat(msg);


            moneyYou_get = principle * interate;


            JOptionPane.showMessageDialog(null, "This is your Money : "+moneyYou_get, "Calculate at year at year ["+i+"]", 2);
        }
        




    }
}
