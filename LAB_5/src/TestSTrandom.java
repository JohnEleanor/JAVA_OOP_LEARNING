import javax.swing.*;

public class TestSTrandom {
    public static void main(String[] args) {

        STrandom rand = new STrandom();  //สร้างobject ของ Class STrandom

        // !  Method ที่ 1
        int value; // สร้างตัวเเปรมาเก็บค่าที่สุ่มได้ในเเต่ละรอบ 
        String output = ""; // สร้างตัวเเปรมาเก็บค่าที่สุ่มได้ในเเต่ละรอบเเล้วนำมาสะสมค่าใวในนี้
        for (int counter = 1; counter <= 20; counter++) { //สร้างลูป 20 ครั้ง { //สร้างลูป 20 ครั้ง
            if (counter == 1) // ถ้า Loop เท่ากับ 1 ให้ เเสดง ข้อความด้านล่าง // ถ้า Loop เท่ากับ 1 ให้ เเสดง ข้อความด้านล่าง
                output += "========== Method 1 ==========\n";
            value = (int) (rand.random(1, 100)); // เรียกใช้ Method เเล้วนำมาเก็บค่าไว้ใน Value            
           output += value + " "; // เอาค่า value เเละ เชื่อมด้วยเว้นวรรค สะสมใว้ในตัวเเปร output // เอาค่า value เเละ เชื่อมด้วยเว้นวรรค สะสมใว้ในตัวเเปร output
            if (counter % 5 == 0) // ถ้า Loop % 5 เเล้วเท่ากับ 0 ให้ทำการ เว้นบรรทัด // ถ้า Loop % 5 เเล้วเท่ากับ 0 ให้ทำการ เว้นบรรทัด
                output += "\n";
            if (counter == 20) // ถ้า Loop เเล้วเท่ากับ 20 ให้ทำการ เว้นบรรทัด
                output += "\n"; 
        }

         // ! Method ที่ 2
        for (int counter = 1; counter <= 20; counter++) { //สร้างลูป 20 ครั้ง { //สร้างลูป 20 ครั้ง
            if (counter == 1) // ถ้า Loop เท่ากับ 1 ให้ เเสดง ข้อความด้านล่าง // ถ้า Loop เท่ากับ 1 ให้ เเสดง ข้อความด้านล่าง
                output += "========== Method 2 ==========\n";
            value =(int) (rand.randomStartx100(2)); // เรียกใช้ Method เเล้วนำมาเก็บค่าไว้ใน Value        
           output += value + " "; // เอาค่า value เเละ เชื่อมด้วยเว้นวรรค สะสมใว้ในตัวเเปร output // เอาค่า value เเละ เชื่อมด้วยเว้นวรรค สะสมใว้ในตัวเเปร output
            if (counter % 5 == 0) // ถ้า Loop % 5 เเล้วเท่ากับ 0 ให้ทำการ เว้นบรรทัด // ถ้า Loop % 5 เเล้วเท่ากับ 0 ให้ทำการ เว้นบรรทัด
                output += "\n";
            if (counter == 20) // ถ้า Loop เเล้วเท่ากับ 20 ให้ทำการ เว้นบรรทัด // ถ้า Loop เเล้วเท่ากับ 20 ให้ทำการ เว้นบรรทัด
                output += "\n"; 

        }

         // ! Method ที่ 3
        for (int counter = 1; counter <= 20; counter++) { //สร้างลูป 20 ครั้ง {
            if (counter == 1) // ถ้า Loop เท่ากับ 1 ให้ เเสดง ข้อความด้านล่าง
                output += "========== Method 3 ==========\n";
            value = (int) (rand.random0(1));
           output += value + " "; // เอาค่า value เเละ เชื่อมด้วยเว้นวรรค สะสมใว้ในตัวเเปร output
            if (counter % 5 == 0) // ถ้า Loop % 5 เเล้วเท่ากับ 0 ให้ทำการ เว้นบรรทัด
                output += "\n";
            if (counter == 20) // ถ้า Loop เเล้วเท่ากับ 20 ให้ทำการ เว้นบรรทัด
                output += "\n";
        }

         // ! Method ที่ 4
        for (int counter = 1; counter <= 20; counter++) { //สร้างลูป 20 ครั้ง {
            if (counter == 1) // ถ้า Loop เท่ากับ 1 ให้ เเสดง ข้อความด้านล่าง
                output += "========== Method 4 ==========\n";
            value = (int) ( rand.random1(3) );
           output += value + " "; // เอาค่า value เเละ เชื่อมด้วยเว้นวรรค สะสมใว้ในตัวเเปร output
            if (counter % 5 == 0) // ถ้า Loop % 5 เเล้วเท่ากับ 0 ให้ทำการ เว้นบรรทัด
                output += "\n";
            if (counter == 20) // ถ้า Loop เเล้วเท่ากับ 20 ให้ทำการ เว้นบรรทัด
                output += "\n";
        }



        JTextArea textArea = new JTextArea(output);  //สร้างobject สำหรับJArea
        textArea.setText(output); //นำ output มา set text 
        JOptionPane.showMessageDialog(null, textArea); //แสดงผล

    }

}