import javax.swing.*; //เรียกใช้งาน package 

public class HW3 {

    public static void main(String[] args) {
        
        String msg,text; // ประกาศตัวเเปร String 
        int number; // ประกาศตัวเเปร number  

        msg = JOptionPane.showInputDialog("Enter positive number : ");  // เเสดงหน้าต่างรับค่าทาง Keyboard เเล้วเก็บค่าในตัวเเปร msg
        number = Integer.parseInt(msg); // number เเปลงค่าจาก String ของ msg เป็น Integer
 
        if ( number <= 1 ) System.out.println("Number is not positive can not do next"); // ถ้า number มีค่าน้อยกว่าหรือเท่ากับ 1 จะเเสดงข้อความ 

        int k = 2; // ประกาศตัวเเปร k ให้ค่าทำกับ 2 
        while (true) { // Loop เรื่อยๆ
            
            if ((number % k) == 0) break; // หลุดจากวงวนเมื่อพบ k ที่หาร n ลงตัว
            if (k >= number) break; // หลุดจากวงวนเมื่อลองหารครบทุกตัวแล้ว
            k++; // เพิ่มค่า K ทีละ 1 
        }

        if (k == number) { // ถ้า k == number คือ เป็นจริงจะเก็บข้อความไว้ใน text 
            text = "Your Number : " + number + " is [prime] number :) ";
        } else {
            text = "Your Number : " + number + " is [not prime] number :( ";
        }


        JTextArea textArea = new JTextArea(text);
        JScrollPane ooo = new JScrollPane(textArea);
        JOptionPane.showMessageDialog(null, ooo); // เเสดงหน้าต่าง Popup เเสดงข้อความ
        
    }
}
