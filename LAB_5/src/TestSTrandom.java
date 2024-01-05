import javax.swing.*;

public class TestSTrandom {
    public static void main(String[] args) {
        STrandom rand = new STrandom();

        // ! Method ที่ 1
        int value;
        String output = "";
        for (int counter = 1; counter <= 20; counter++) {
            if (counter == 1)
                output += "========== 1 ==========\n";
            value = 1 + (int) (rand.random(1, 100));
            output += value + " ";
            if (counter % 5 == 0)
                output += "\n";
            if (counter == 20)
                output += "\n";

        }

        for (int counter = 1; counter <= 20; counter++) {
            if (counter == 1)
                output += "========== 2 ==========\n";
            value = 1 + (int) (rand.randomStartx100(2));
            output += value + " ";
            if (counter % 5 == 0)
                output += "\n";
            if (counter == 20)
                output += "\n";

        }

        for (int counter = 1; counter <= 20; counter++) {
            if (counter == 1)
                output += "========== 3 ==========\n";
            value = 1 + (int) (rand.random0(2));
            output += value + " ";
            if (counter % 5 == 0)
                output += "\n";
            if (counter == 20)
                output += "\n";
        }

        for (int counter = 1; counter <= 20; counter++) {
            if (counter == 1)
                output += "========== 4 ==========\n";
            value = 1 + (int) ( rand.random1(3) );
            output += value + " ";
            if (counter % 5 == 0)
                output += "\n";
            if (counter == 20)
                output += "\n";
        }



        JTextArea textArea = new JTextArea(output);
        textArea.setText(output);
        JOptionPane.showMessageDialog(null, textArea, "20 Random Numbers from 1 to 6", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

}