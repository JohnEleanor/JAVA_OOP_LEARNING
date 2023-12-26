import javax.swing.*;

public class Fuck {

    public static int Finddigit(Long number) {

        String num = Long.toString(number);

        int oddNumber = 0, evenNumber = 0, zeroNumber = 0;
        for (int i = 0; i < num.length(); i++) {
            // System.out.println(num.charAt(i));
            int num4mat = Integer.parseInt(num);
           if (num4mat == 0) {
                zeroNumber++;
           }else {
                if (num4mat % 2 == 0){
                    evenNumber++;
                }else if(num4mat % 2 != 0) {
                    oddNumber++;
                }
           }
        }

        System.out.println(zeroNumber);
        System.out.println(evenNumber);
        System.out.println(oddNumber);

        
        return(0);
    }

    public static void inputNumber() {
       String msg = " ";
       Long Number4real;
       msg = JOptionPane.showInputDialog("Plase enter positive number : "); 
       Number4real = Long.parseLong(msg);
       
        System.out.println("THIS IS INPUT : "+ Number4real );
       Finddigit(Number4real);

    }


    public static void main(String[] args) {
        inputNumber();
    }

}
