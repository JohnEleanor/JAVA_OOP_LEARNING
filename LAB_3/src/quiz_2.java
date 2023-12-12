import javax.swing.*;
public class quiz_2 {
    
    public static void main(String[] args) {
        /*
         * ปรกาศตัวเเปร
         * principle = เงินต้น
         * interate = อัตราดอกเบี้ย
         * msg = รับค่าทาง Keyboard 
         * dePositButInteratenaja = ยอดรวมสะสม
         */
        String msg;
        
        msg = JOptionPane.showInputDialog("Enter your principle"); //? รับข้อมูลทางKeyboard
        float principle = Float.parseFloat(msg); //? นำข้อมูลที่รับทาง keyboard มาเก็บ


        msg = JOptionPane.showInputDialog("Enter your interate"); //? รับข้อมูลทางKeyboard
        float interate = Float.parseFloat(msg); //? นำข้อมูลที่รับทาง keyboard มาเก็บ
            
        /**
         *? dePositButInteratenaja ตัวเเปรที่คำนวนหาดอกเบี้ยจาก input 
         *? จากนนั้นจะเก็บสะสมไว้ที่ principle
         *! Loop 5 ครั้งเพื่อรับข้อมูล 5 รอบ
        */

        for (int i = 1; i <= 5; i++) {

        float dePositButInteratenaja = principle * (interate / 100);
            
            principle += dePositButInteratenaja;
            JOptionPane.showMessageDialog(null, "Total Deposit " +principle+ " Bath", "Calculate at year "+i, 2);
            

        }
    }
}
