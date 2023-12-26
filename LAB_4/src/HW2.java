import javax.swing.*;

public class HW2 {

    public static void Finddigit(Long number) {
        JTextArea textArea = new JTextArea();
        String num = Long.toString(number);

        int oddNumber = 0, evenNumber = 0, zeroNumber = 0;
        for (int i = 0; i < num.length(); i++) {


           if (num.charAt(i) == '0') {
                zeroNumber++;
           }else {

                if ((num.charAt(i) % 2) == 0){
                    evenNumber++;
                }else if (num.charAt(i) % 2 != 0) {
                    oddNumber++;
                }
           }
        }

        
        System.out.println("This odd : "+oddNumber);
        System.out.println("This even : "+evenNumber);
        System.out.println("This zero : "+zeroNumber);
        
        String text = "This odd : "+oddNumber+"\nThis even : "+evenNumber+"\nThis zero : "+zeroNumber;

        textArea.setText(text);
        JOptionPane.showMessageDialog(null, textArea);


    }

    public static void inputNumber() {
       String msg = " ";
       Long Number4real;
       msg = JOptionPane.showInputDialog("Plase enter positive number : "); 
       Number4real = Long.parseLong(msg);
       
        System.out.println("[ THIS IS INPUT : "+ Number4real +" ]");
       Finddigit(Number4real);

    }


    public static void main(String[] args) {
        inputNumber();
    }

}
