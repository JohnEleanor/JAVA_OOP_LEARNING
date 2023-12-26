import javax.swing.*;

public class HW3 {

    public static void main(String[] args) {
        String msg;
        int number;
        boolean isPrime = false;
        msg = JOptionPane.showInputDialog("Enter positive number : ");
        number = Integer.parseInt(msg);

        if (number <= 1)
            System.out.println("Number is not positive can not do next");

        int k = 2;
        while (true) {
            if (k >= number)
                break; // หลุดจากวงวนเมื่อลองหารครบทุกตัวแล้ว
            if ((number % k) == 0)
                break; // หลุดจากวงวนเมื่อพบ k ที่หาร n ลงตัว
            k++;
        }

        if (k == number) isPrime = true;
        if (k != number) isPrime = false;

        if (isPrime) {
            JOptionPane.showMessageDialog(null, "Your Number : " + number + " is [prime] number :) ", "Result", 3);
        } else {
            JOptionPane.showMessageDialog(null, "Your Number : " + number + " is [not prime] number :( ", "Result", 0);
        }
    }
}
