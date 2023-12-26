import javax.swing.JOptionPane;

public class LAB_4_QUIZ_1 {
    public static void main(String[] args) {
        int score; // ประกาศตัวแปรเก็บคะเเนน
        String InputKB; // รับค่าจาก Keyboard มาเก็บ

        InputKB = JOptionPane.showInputDialog("Enter student score"); // รับค่าจาก Keyboard มาเก็บใน InputKB
        score = Integer.parseInt(InputKB); // เเปลง InputKB จาก String เป็น Integer

        if ((score >= 0) && (score <= 100)) { // เช็ค score ระหว่าง 1 - 100

            String grade;
            switch (score / 10) {
                case 10:
                case 9:
                    grade = "A";
                    break;
                case 8:
                    grade = "B+";
                    break;
                case 7:
                    grade = "B";
                    break;
                case 6:
                    grade = "C+";
                    break;
                case 5:
                    grade = "C";
                    break;
                case 4:
                    grade = "D+";
                    break;
                case 3:
                    grade = "D";
                    break;
                case 2:
                case 1:
                case 0:
                    grade = "F";
                    break;
                default:
                    grade = "Invalid";
                    break;
            }

            // โชวหน้าต่าง Student grade is เเละเชื่อมตัวเเปร grade
            // ที่หลังจากถูกเช็คเงื่อนไขเเละ Assign ค่า
            JOptionPane.showMessageDialog(null, "Student grade is " + grade, "Calculate", 3);
        } else {
            // โชวหน้าต่าง Invalid Student Score หากค่าที่ป้อนเข้ามาไม่ตรงกับเงื่อนไข
            JOptionPane.showMessageDialog(null, "Invalid Student Score ", "Calculate", 0);
        }
        // โชวหน้าต่าง End Program เเละจบการทำงาน
        JOptionPane.showMessageDialog(null, "End Program", "Calculate", 1);
    }
}
