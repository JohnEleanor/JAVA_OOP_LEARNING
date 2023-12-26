
import javax.swing.*; // เรียกใช้งาน Library

public class Lab_4_1 {
    public static void main(String[] args) {

        int score; // ประกาศตัวแปรเก็บคะเเนน
        String InputKB;  // รับค่าจาก Keyboard มาเก็บ

        InputKB = JOptionPane.showInputDialog("Enter student score"); // รับค่าจาก Keyboard มาเก็บใน InputKB
        score = Integer.parseInt(InputKB); // เเปลง InputKB จาก String เป็น Integer

        if ((score >= 0) && (score <= 100)) { // เช็ค score ระหว่าง 1 - 100

            String grade;
            if (score >= 80) //ถัามากกว่าหรือเท่ากับ 80 จะ assign A ให้ตัวเเรป grade
                grade = "A";
            else if (score >= 75) //ถัามากกว่าหรือเท่ากับ 75 จะ assign B+ ให้ตัวเเรป grade
                grade = "B+";
            else if (score >= 70) //ถัามากกว่าหรือเท่ากับ 70 จะ assign B ให้ตัวเเรป grade
                grade = "B";
            else if (score >= 65) //ถัามากกว่าหรือเท่ากับ 65 จะ assign C+ ให้ตัวเเรป grade
                grade = "C+";
            else if (score >= 60) //ถัามากกว่าหรือเท่ากับ 60 จะ assign C ให้ตัวเเรป grade
                grade = "C";
            else if (score >= 55) //ถัามากกว่าหรือเท่ากับ 55 จะ assign D+ ให้ตัวเเรป grade
                grade = "D+";
            else if (score >= 50) //ถัามากกว่าหรือเท่ากับ 50 จะ assign D ให้ตัวเเรป grade
                grade = "D";
            else //ถัาน้อยกว่า 50 จะ assign F ให้ตัวเเรป grade
                grade = "F";

            // โชวหน้าต่าง Student grade is เเละเชื่อมตัวเเปร grade ที่หลังจากถูกเช็คเงื่อนไขเเละ Assign ค่า
            JOptionPane.showMessageDialog(null, "Student grade is " + grade, "Calculate", 3); 
        } else {
            // โชวหน้าต่าง Invalid Student Score หากค่าที่ป้อนเข้ามาไม่ตรงกับเงื่อนไข
            JOptionPane.showMessageDialog(null, "Invalid Student Score ", "Calculate", 0);
        }
            // โชวหน้าต่าง End Program เเละจบการทำงาน
        JOptionPane.showMessageDialog(null, "End Program", "Calculate", 1);
    }
}
