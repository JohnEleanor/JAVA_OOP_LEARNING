
/*
 * Input :
 * [💻] 6634567821 
 * [💻] 6674567821    
 * [💻] 6474567821    
 * 

 */
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class preMidTerm {
    public static void main(String[] args) {
        String msg;
        String Std_Detail = "";
        msg = JOptionPane.showInputDialog("Plase enter id : ");

        if (msg.length() == 10) {

            String Check_Engineering = msg.substring(8, 10); // !เพื่อนำไปเช็คตัวเลข

            if (Integer.parseInt(Check_Engineering) == 21) {
                Std_Detail += "Major : Engineering\n";
                String Udergradate = msg.substring(2, 3);

                if (Integer.parseInt(Udergradate) == 3) {

                    Std_Detail += "Grade : Udergradate\n";
                } else if (Integer.parseInt(Udergradate) == 7) {

                    Std_Detail += "Grade : Oraduate\n";
                } else {

                    Std_Detail += "Grade : Unknow\n";
                }
                String year = msg.substring(0, 2);

                final int nowYear = 66;
                int TotalYear = Integer.parseInt(year);
              
                
                Std_Detail += "Now Student Year At : " + (nowYear - TotalYear + 1 );

            } else {
                Std_Detail += "Major : Unknow\n";
                JOptionPane.showMessageDialog(null, "Unknow Student ");
            }
        } else {
            Std_Detail += "Id Invaild\n";
            JOptionPane.showMessageDialog(null, "Id Invaild ");
        }
        JTextArea jTextArea = new JTextArea();
        jTextArea.setText(Std_Detail);
        JOptionPane.showMessageDialog(null, jTextArea);
    }
}
