import javax.swing.*; //เรียกใช้งาน package 

public class HW1 {
    public static void main(String[] args) {
        int startNumber; //ประกาศตัวเเปรเพื่อรับค่าตัวเลข เริ่มต้น
        int endNumber; //ประกาศตัวเเปรเพื่อรับค่าตัวเลข สิ้นสุด
        int count = 0; //ประกาศตัวเเปรเพื่อดับรอบ
       
        StringBuilder result = new StringBuilder();
        String numInput = JOptionPane.showInputDialog("Enter start number : "); //แสดงช่อง Input ใส่ค่าคะแนนของนักศึกษา scoreInput จะเก็บค่าที่ผู้ใช้ป้อนเข้ามา
        startNumber = Integer.parseInt(numInput); // startNumber เเปลงค่าจาก String ของ numInput เป็น Integer
        String num2Input = JOptionPane.showInputDialog("Enter End number : "); //แสดงช่อง Input ใส่ค่าคะแนนของนักศึกษา scoreInput จะเก็บค่าที่ผู้ใช้ป้อนเข้ามา
        endNumber = Integer.parseInt(num2Input); // endNumber เเปลงค่าจาก String ของ numInput เป็น Integer

        for(int i = startNumber; i <= endNumber; i++){ // Loop จะเริ่มต้นเมื่อ ค่า startNumber น้อยกว่าหรือเท่ากับ endNumber 
            if (i % 3 == 0 && i % 5 == 0){
                
                result.append(i).append(" "); //เก็บค่าเเละเชื้อมด้วย เว้นวรรค
                count++; // เพิ่มค่าที่ละ 1 
                if(count % 5 == 0){ // ถ้า count หาร 5 เเล้วไม่มีเศษก็จะขึ้นบรรทัดใหม่
                    result.append("\n");  // ขึ้นบรรทัดใหม่
                    count ++; // เพิ่มค่าที่ละ 1 
                    
                }
              
            }
        }
     
    JTextArea textArea = new JTextArea(result.toString());
    JScrollPane ooo = new JScrollPane(textArea);
    JOptionPane.showMessageDialog(null, ooo); // Show หน้าต่างข้อความ
    }
}
