
public class STrandom {

    public int random(int startNumber, int endNumber) { // Method สำหรับสุ่มรับค่าเริ่มต้นเข้ามาเเล้วรับค่าจำนวนสิ้นสุดเข้ามาเเล้ว return ค่ากลับไป
        int randomMePlz = (int) (Math.random() * (endNumber - startNumber) + startNumber);
        return (randomMePlz);
    }

    public int randomStartx100(int startNumber) { // Method สำหรับสุ่มรับค่าเริ่มต้นเข้ามาเเล้วนำไป +100 ก็ตจะได้จำนวนสิ้นสุดเเล้ว return กลับไป
        int ConvertStartNumber = startNumber + 100;
        int randomMePlz = (int) (Math.random() * (ConvertStartNumber - startNumber ) + startNumber);

        return (randomMePlz);
    }

    public int random0(int endNumber) { // Method สำหรับสุ่มตั้งเเต่ 0 ไปจนถึง ค่าทีรับเข้ามา เเล้ว return กลับไป
    
        int randomMePlz = (int) (Math.random() * (endNumber + 1)) ;
        return (randomMePlz);
    }

    public int random1(int endNumber) { // method สำหรับ สุม่ตั้งเเต่ 1 ไปจนถึง จำนวนสิ้นสุดที่รับเข้ามาเเล้ว return กลับไป 
        int randomMePlz = (int) (Math.random() * endNumber ) + 1 ;
        return (randomMePlz);
    }

}
