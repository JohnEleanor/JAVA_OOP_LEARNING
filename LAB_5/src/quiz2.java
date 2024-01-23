/*
 * นายโชติรส สุวรรณสุต 6606021420148
*/

import javax.swing.JOptionPane;

public class quiz2 {
    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog(null, "Plase Enter Number : "); // สร้างตัวเเปร input เพื่อเก็บค่าที่รับมาจาก keyboard จากการใช้ JoptionPane
        Long NumberOfDigit = countDigit(Integer.parseInt(input)); // เรียกใช้ method countDigit เเล้วส่งค่า input ที่เเปลงเป็น int ไปเเล้วเก็บค่าที่ Method return กลับมาไว้ที่ตัวเเปร NumberOfDigit
        JOptionPane.showInternalMessageDialog(null, "Number of digit of "+input+" is : "+NumberOfDigit); //เเสดงข้อความ Number of digit of เชื่อมด้วย input เเละ NumberOfDigit
    }

    public static Long countDigit(int Number) {
        String s = String.valueOf(Number); // ประกาศตัวเเปร s เเปลงจาก int ไปเป็น String 
        int numOfDigit = s.length(); // ประกาศตัวเเปร numOfDigit เเละค่าความยาวของข้อความโดยใช้ Lenght() 
        return (long) ( numOfDigit ); // ส่งค่า numOfDigit กลับไปโดยส่งกลับไปเป็น Long 
    }
}
