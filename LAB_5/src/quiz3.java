
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class quiz3 {
    public static void main(String[] args) {

        String input;
        int num;
        JTextArea result = new JTextArea();

        
        do {
            // ทำการรับค่าตัวเลข
            input = JOptionPane.showInputDialog("Enter number");
            num = Integer.parseInt(input);

            // สร้างเงื่อนไขเช็คว่าเลขที่กรอกมาเป็น -1 หรือไม่
            if (num != -1) {
                // เรียกใช้ Method printChar เพื่อส่งค่าพารามิเตอร์ และเก็บค่าที่ส่งกลับมา
                String bar = printChar(num);
                // เก็บตัวเลขที่กรอกและ * ตามจำนวนเลขที่กรอกไว้ในตัวแปร result
                result.append(num + ":" + bar + "\n");
            }
        } while (num != -1);
        // แสดงตัวเลขที่กรอกและ * ตามจำนวนเลขที่กรอก
        JOptionPane.showMessageDialog(null, result);

    }

    // สร้าง method เพื่อรับค่าพารามิเตอร์มาสร้าง *
    public static String printChar(int n) {
        String s = "";
        // ทำการวนรอบเพื่อเก็บ * ไว้ในตัวแปร s
        for (int r = 1; r <= n; r++) {
            s += "*";
        }
        // ส่งค่าตัวแปร s ที่เก็บ * กลับ
        return (s);
    }

}
