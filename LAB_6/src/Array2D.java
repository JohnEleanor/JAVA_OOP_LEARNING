import javax.swing.JOptionPane;

public class Array2D {
    public static void main(String[] args) {
        
        // int a = Integer.parseInt(msg);
        String table[][] = {
            {"Name", "Age", "City"},
            {"John", "25", "New York"},
            {"Alice", "30", "London"},
            {"Bob", "22", "Tokyo"}
        };

        System.out.println(dumpTable(table));
    
    }

    private static String dumpTable(String[][] table) {
        StringBuilder result = new StringBuilder();

        // Loop ที่ซับซ้อนเพื่อดึงข้อมูลจากตาราง
        for (String[] row : table) {
            for (String cell : row) {
                result.append(cell).append("\t"); // ใส่ tab ระหว่างเซลล์
            }
            result.append("\n"); // เพิ่มบรรทัดใหม่หลังจากแต่ละแถว
        }

        return result.toString();
    }
}
