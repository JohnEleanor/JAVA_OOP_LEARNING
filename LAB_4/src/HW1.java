
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class HW1 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int count = 0;
       
        StringBuilder result = new StringBuilder();
        String numInput = JOptionPane.showInputDialog("Enter start number : "); //แสดงช่อง Input ใส่ค่าคะแนนของนักศึกษา scoreInput จะเก็บค่าที่ผู้ใช้ป้อนเข้ามา
        num1 = Integer.parseInt(numInput); // num1 จะเก็บค่าจาก numInput
        String num2Input = JOptionPane.showInputDialog("Enter End number : "); //แสดงช่อง Input ใส่ค่าคะแนนของนักศึกษา scoreInput จะเก็บค่าที่ผู้ใช้ป้อนเข้ามา
        num2 = Integer.parseInt(num2Input); // num2 จะเก็บค่าจาก num2Input
        for(int i = num1; i <= num2; i++){
            if (i % 3 == 0 && i % 5 == 0){
                
                result.append(i).append(" "); 
                count++;
                if(count % 5 == 0){
                    result.append("\n"); 
                    count ++;
                    
                }
              
            }
        }
     
    JTextArea textArea = new JTextArea(result.toString());
    JScrollPane ooo = new JScrollPane(textArea);
    JOptionPane.showMessageDialog(null, ooo);
    }
}
