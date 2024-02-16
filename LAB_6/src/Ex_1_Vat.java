import javax.swing.*;
import java.text.DecimalFormat;

public class Ex_1_Vat {

    public static void main(String[] args) throws Exception {

        String msg = "";
        JTextArea area = new JTextArea();
        int Vat_Lenght[] = { 0, 100000, 500000, 1000000, 4000000 };
        int index = 0;
        double money, tax = 0, total = 0, interest = 0;

        
        DecimalFormat number = new DecimalFormat("#,###,###,###");

        msg = JOptionPane.showInputDialog("Input number : ");
        money = Integer.parseInt(msg);

     
        while (money > 0) {

            if (Vat_Lenght[index] == Vat_Lenght[Vat_Lenght.length - 1]) {
                tax = money * interest;
                money = money - money;
                msg += "\n > " + Vat_Lenght[index] + " = " + number.format(tax);
            } else {
                if (money < (Vat_Lenght[index + 1] - Vat_Lenght[index])) {
                    tax = money * interest;
                    money = money - money;
                } else {
                    tax = (Vat_Lenght[index + 1] - Vat_Lenght[index]) * interest;
                    money = money - (Vat_Lenght[index + 1] - Vat_Lenght[index]);
                }
                msg += "\n" + number.format(Vat_Lenght[index]) + " - " + number.format(Vat_Lenght[index + 1]) + " = "
                        + number.format(tax);
            }

            total += tax;
            interest += 0.05;
            index++;

        }
        

        msg += "\nTotal = " + number.format(total);
        area.append(msg);
        JScrollPane Scroll = new JScrollPane(area);
        JOptionPane.showMessageDialog(null, Scroll, "Tax", JOptionPane.INFORMATION_MESSAGE);

    }
}
