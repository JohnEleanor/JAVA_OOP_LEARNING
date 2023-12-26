import javax.swing.JOptionPane;

public class LAB_4_QUIZ_2 {
    public static void main(String[] args) {
        int num1, num2; // ตัวเเปรที่เก็บค่าที่ป้อนเข้ามาทาง Keyboard มาเป็นตัวเลขจากการถูกการเเปลงจาก
                        // String มา
        double result = 0; // ผลลัพธ์ที่ได้จากการคิดคำนวนจากคณิตศาตสาร์
        char operator; // คือ เครื่องหมายทางคณิตศาตสร์จากการที่ Input มาทาง Keyboard
        boolean done = true; // ตัวเเปล Boolean ที่เก็บค่าจริงกับเท็จ
                             // หากผู้ใช้กรอกเครื่องหมายทางคณิตศาสตร์ไม่ถูกต้องจะเป็น False
        String message, inPut; // ตัวเเปรที่เก็บข้อความที่ Input มาทาง Keyboard

        inPut = JOptionPane.showInputDialog(null, "Enter Frist Value"); // ป้อนค่าที่ 1
        num1 = Integer.parseInt(inPut); // เเปลง inPut จาก String เป็น Integer

        inPut = JOptionPane.showInputDialog(null, "Enter second Value"); // ป้อนค่าที่ 2
        num2 = Integer.parseInt(inPut); // เเปลง inPut จาก String เป็น Integer

        message = JOptionPane.showInputDialog("Enter operator(+, -, *, /, %) : "); // ป้อนค่าที่ เครื่องหมาย
        operator = message.charAt(0); // การหาตัวอักษรในตำเเหน่งที่ 0

        /*
         * เป็นการเช็คเเบบ if else 
         * เเละทำการหาผลลัพธ์จากการคิดทาง คณิตศาตาร์มาเก็บไว้ที่ตัวเเปร result
         * หากไม่เข้า Case ไหนเลย จะทำการ done = false เก็บค่า false ไว้ที่ตัวเเปร done
         */
       
        if (operator == '+') {
            result = num1 + num2;
            message = num1 + " + " + num2 + " = ";
        } else if (operator == '-') {
            result = num1 - num2;
            message = num1 + " - " + num2 + " = ";
        } else if (operator == '*') {
            result = num1 * num2;
            message = num1 + " * " + num2 + " = ";
        } else if (operator == '/') {
            result = (double) num1 / num2;
            message = num1 + " / " + num2 + " = ";
        } else if (operator == '%') {
            result = num1 % num2;
            message = num1 + " % " + num2 + " = ";
        } else {
            done = false;
        }

        /*
         * เช็คตัวเเปร done จาก default จะถูกกำหนดไว้เป็น True หากเช็ค Case เเล้วไม่ตรง
         * done จะเท่ากับ false
         * if (done) หมายถึง ถ้า (เงื่อนไขเป็นจริง)
         * จะโชว์ผลลัพธ์ตามด้านล่างเเต่ถ้าไม่จะเเสดง Error Not Found
         */
        if (done)
            JOptionPane.showMessageDialog(null, message + result, "Calculate ", 3);
        else
            JOptionPane.showMessageDialog(null, "Error Not Found", "Not found ", 0);

    }
}
