import javax.swing.JOptionPane;

public class TestParcelTerry {
    public static void main(String[] args) {


        ParcelTerry user1 = new ParcelTerry();

        String Weight_input =  JOptionPane.showInputDialog("Plase Enter Your Weight : ");

        String Type_input =  JOptionPane.showInputDialog("Plase Enter Your Type : ");

        double weight = Double.parseDouble(Weight_input);

        int type = Integer.parseInt(Type_input);

        double Calculate =  user1.ParcelCalculator(type, weight);

        JOptionPane.showMessageDialog(null, "This is Price : "+Calculate);

        String paymoney = JOptionPane.showInputDialog("Plase Enter Your Paymoney [ You Need To Pay "+Calculate+" ] : ");

        user1.Setpaymoney(Integer.parseInt(paymoney));
        user1.Setweight(weight);

        if (user1.getPaymoney() < Calculate) {
            JOptionPane.showMessageDialog(null, "You Need To Pay More Money");
 
        }else {

            JOptionPane.showMessageDialog(null, "This is Your Change : "+(user1.getPaymoney() - Calculate));

        }




    }
}
