import javax.swing.*; //เรียกใช้งาน package 

public class HW2 {

    public static void Finddigit(Long number) { // ประกาศ method Finddigit เเล้วรับค่า number ประเภทตัวเเปรเป็น Long
        
        String num = Long.toString(number); //ประกาศตัวเเปร num เเล้วเเปรงจาก Long เป็น String 
        int oddNumber = 0, evenNumber = 0, zeroNumber = 0; //ประกาศตัวเเปร เพื่อเก็บค่าเลขคู่เลขคี่

        for (int i = 0; i < num.length(); i++) { // Loop ตามจำนวนความยาวของข้อความที่กรอกเข้ามา

           if (num.charAt(i) == '0') { // เช็คถ้า num ในตำเเหน่งที่ i เป็นเลข 0 ให้ทำการเพิ่มค่า zeroNumber ทีละ 1
                zeroNumber++;
           }else {

                if ((num.charAt(i) % 2) == 0){ // เช็คถ้า num ในตำเเหน่งที่ i หาร 2 เเล้วเศษ เท่ากับ 0 ให้เพิ่มค่า evenNumber ทีละ 1
                    evenNumber++;
                }else if (num.charAt(i) % 2 != 0) { // เช็คถ้า num ในตำเเหน่งที่ i หาร 2 เเล้วมีเศษ ให้เพิ่มค่า oddNumber ทีละ 1
                    oddNumber++;
                }
           }
        }

        
        String text = "This odd : "+oddNumber+"\nThis even : "+evenNumber+"\nThis zero : "+zeroNumber; //เชื่อมข้อความ กับตัวเเปรเพื่อเเสดงผล 
        JTextArea textArea = new JTextArea(text); //ประกาศตัวเเปร Object 
        textArea.setText(text); 
        JOptionPane.showMessageDialog(null, textArea); // Show หน้าต่างข้อความ


    }

    public static void inputNumber() { // ประกาศ method inputNumber
       String msg = " "; // ประกาศ msg เป็น String 
       Long Number4real; // ประกาศ Number4real เป็น Long ตามโจทย์กำหนด 
       msg = JOptionPane.showInputDialog("Plase enter positive number : "); // เเสดงหน้าต่างรับค่าทาง Keyboard เเล้วเก็บค่าในตัวเเปร msg
       Number4real = Long.parseLong(msg); // เเปลงตัวเเปร msg เป็น Long เเล้วเก็บค่าใว้ในตัวเเปร Number4real
       Finddigit(Number4real); // ส่ง Number4real ไปที่ Meythod 

    }


    public static void main(String[] args) {
        inputNumber(); // เรียกใช้งาน Function inputNumber
    }

}
