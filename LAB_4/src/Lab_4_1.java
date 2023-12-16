
import javax.swing.*;

public class Lab_4_1 {
    public static void main(String[] args) {

        int score;
        String InputKB;

        InputKB = JOptionPane.showInputDialog("Enter student score");
        score = Integer.parseInt(InputKB);

        if ((score >= 0) && (score <= 100)) {

            String grade;
            if (score >= 80)
                grade = "A";
            else if (score >= 75)
                grade = "B+";
            else if (score >= 70)
                grade = "B";
            else if (score >= 65)
                grade = "C+";
            else if (score >= 60)
                grade = "C";
            else if (score >= 55)
                grade = "D+";
            else if (score >= 50)
                grade = "D";
            else
                grade = "F";
            // System.out.println("Student gradde is " + grade);
            JOptionPane.showMessageDialog(null, "Student gradde is " + grade, "Calculate", 3);
        } else {
            // System.out.println("Invalid student score.");
            JOptionPane.showMessageDialog(null, "Invalid Student Score ", "Calculate", 0);
        }
        // System.out.println("End Program.");
        JOptionPane.showMessageDialog(null, "End Program", "Calculate", 1);
        // scan.close();
    }
}
