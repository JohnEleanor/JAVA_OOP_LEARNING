/*
 * นายโชติรส สุวรรณสุต 6606021420148
*/

import javax.swing.JOptionPane;

public class quiz1 {
   public static void main(String[] args) {

        String inputNumberOfScore = JOptionPane.showInputDialog("Plase Enter Number of Score 💻"); //รับค่าจำนวนที่ต้องการกรอก จาก Keyboard 
        int score = getScore(Integer.parseInt(inputNumberOfScore));// ส่งค่าที่รับจาก Keyboard ไปที่ getScore เเล้วเก็บค่า ไว้ที่ Score 
        JOptionPane.showMessageDialog(null, "Your Average ["+inputNumberOfScore+"] Score is [!] "+ average(score, Integer.parseInt(inputNumberOfScore)));
        // เเสดงข้อความ Your Average ตามด้วย inputNumberOfScore จำนวนที่ต้องการกรอก Score is [!] เเละเรียกใช้ Method average เเละส่งค่า score เเละเเปลง String -> Int ของ inputNumberOfScore

    }

    public static int getScore(int numberofScore) // ประกาศ method เเละมี่ parameter 
    {
        int ScoreTotal = 0 ; // ประกาศตัวเเปร
        for (int i = 1; i <= numberofScore; i++) { // Loop ตามจำนวนรอบของ Parameter ที่ส่งเข้ามา
  
            String score = JOptionPane.showInputDialog("Plase Enter your Score ✅"); // ประกาศตัวเเปร score เพื่อรับ score จากทาง Keyboard 
            int IntScore = Integer.parseInt(score); // ประกาศตัวเเปร IntScore เพื่อเเปลงเป็น int 
            ScoreTotal += IntScore; // สะสมค่าไว้่ที่ตัวเเปร ScoreTotal
        }
        return(ScoreTotal); // ส่งค่ากลับไป
    }

    public static double average(int TotalScore, int inputNumberOfInputScore) // ประกาศ method มี TotalScore = คะเเนนทั้งหมด เเละ inputNumberOfInputScore = จำนวนที่ต้องการกรอกคะเเนน
    {
        return( TotalScore / inputNumberOfInputScore ); //ส่งค่า กลับไปเเบบทำการ หารกัน
    }
}
