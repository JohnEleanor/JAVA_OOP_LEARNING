/**
 *! [🧠] Chotiros Suwansoot (Jay)
 *! [💻] 6606021420148
*/
import javax.swing.*;
public class quiz_1 {
    
    public static void main(String[] args) {
        String msg; //* ประกาศตัวเเปร 
        float C,F; //* ประกาศตัวเเปร 

        msg = JOptionPane.showInputDialog("Enter your °C : "); //? รับข้อมูลทางKeyboard
        C = Float.parseFloat(msg); //? นำข้อมูลที่รับทาง keyboard มาเก็บ

        F = (C * 9/5) + 32; //? คำนวนหา องศาฟาเรนไฮ


        JOptionPane.showMessageDialog(null, "This is Your °F : "+F, "Calculate", 2); //? เเสดงข้อความหลังจากคำนวนเสร็จ


    }
}
