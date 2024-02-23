import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public final class Lab9_1 extends JFrame implements ActionListener {
    Student std[];
    Subject sub[];
    String[] studentStr, subjectStr;
    Container container;
    JComboBox<String> stdCombo, subCombo;
    JLabel stdLabel, subLabel;
    JButton addstdBtn, addsubBtn, saveBtn, clearBtn, cancleBtn;
    JTextField stdText;
    JTextArea subTextArea;
    JScrollPane subScroll;
    Register reg;
    int count = 0;

    /** Creates a new instance of Lab9_1 */
    public Lab9_1() {
        super("Program Student Register");
        initStudent();
        initSubject();
        initGui();
        reg = new Register(new Student(), 5);
    }

    public void initStudent() {
        std = new Student[10];
        studentStr = new String[10];
        std[0] = new Student("5066260010", "AAAAA", "BBBBBBBBBBB");
        std[1] = new Student("5066260024", "DDDDD", "GGGGGGGGGG");
        std[2] = new Student("5066260035", "HHHHH", "KKKKKKKKKKK");
        std[3] = new Student("5066260046", "MMMMM", "PPPPPPPPPPP");
        std[4] = new Student("5066260057", "QQQQQ", "TTTTTTTTTTT");
        std[5] = new Student("5066260068", "UUUUU", "WWWWWWWWWWW");
        std[6] = new Student("5066260079", "XXXXX", "ZZZZZZZZZZZ");
        std[7] = new Student("5066260080", "YYYYY", "AAAAAAAAAAA");
        std[8] = new Student("5066260091", "BBBBB", "CCCCCC");
        std[9] = new Student("5066260102", "DDDDD", "EEEEEEEEEEE");
        
        studentStr[0] = std[0].toString();
        studentStr[1] = std[1].toString();
        studentStr[2] = std[2].toString();
        studentStr[3] = std[3].toString();
        studentStr[4] = std[4].toString();
        studentStr[5] = std[5].toString();
        studentStr[6] = std[6].toString();
        studentStr[7] = std[7].toString();
        studentStr[8] = std[8].toString();
        studentStr[9] = std[9].toString();
        
    }

    public void initSubject() {
        sub = new Subject[10];
        subjectStr = new String[10];
        sub[0] = new Subject("662305", "IT Laboratory II", 1);
        sub[1] = new Subject("662309", "Data Structure", 3);
        sub[2] = new Subject("662310", "Database System", 3);
        sub[3] = new Subject("662317", "Data Communication", 3);
        sub[4] = new Subject("662327","Advanced Computer Programming", 3);
        sub[5] = new Subject("662335", "Software Engineering", 3);
        sub[6] = new Subject("662340", "Operating System", 3);
        sub[7] = new Subject("662345", "Computer Networks", 3);
        sub[8] = new Subject("662350", "Artificial Intelligence", 3);
        sub[9] = new Subject("662355", "Mobile Application Development", 3);


        
        subjectStr[0] = sub[0].toString();
        subjectStr[1] = sub[1].toString();
        subjectStr[2] = sub[2].toString();
        subjectStr[3] = sub[3].toString();
        subjectStr[4] = sub[4].toString();
        subjectStr[5] = sub[5].toString();
        subjectStr[6] = sub[6].toString();
        subjectStr[7] = sub[7].toString();
        subjectStr[8] = sub[8].toString();
        subjectStr[9] = sub[9].toString();
    }

    public void initGui() {
        container = getContentPane();
        container.setLayout(new FlowLayout());
        stdLabel = new JLabel("Select Student : ");
        container.add(stdLabel);
        stdCombo = new JComboBox<String>(studentStr);
        stdCombo.setMaximumRowCount(10);
        container.add(stdCombo);
        addstdBtn = new JButton("Add Student");
        addstdBtn.addActionListener(this);
        container.add(addstdBtn);
        stdText = new JTextField(40);
        stdText.setEditable(false);
        container.add(stdText);
        subLabel = new JLabel("Select Subject : ");
        container.add(subLabel);
        subCombo = new JComboBox<String>(subjectStr);
        subCombo.setMaximumRowCount(10);
        container.add(subCombo);
        addsubBtn = new JButton("Add Subject");
        addsubBtn.setEnabled(false);
        addsubBtn.addActionListener(this);
        container.add(addsubBtn);
        subTextArea = new JTextArea(5, 50);
        subTextArea.setEditable(false);
        subScroll = new JScrollPane(subTextArea);
        container.add(subScroll);
        saveBtn = new JButton(" Save ");
        saveBtn.setEnabled(false);
        saveBtn.addActionListener(this);
        container.add(saveBtn);
        cancleBtn = new JButton(" Cancle ");
        cancleBtn.setEnabled(false);
        cancleBtn.addActionListener(this);
        container.add(cancleBtn);
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == addstdBtn) {

            int n = stdCombo.getSelectedIndex();
            stdText.setText(std[n].toString());
            reg.setStudent(std[n]);
            addstdBtn.setEnabled(false);
            addsubBtn.setEnabled(true);
            saveBtn.setEnabled(true);
            cancleBtn.setEnabled(true);
        } else if (event.getSource() == addsubBtn) {
            int n = subCombo.getSelectedIndex();
            subTextArea.append(sub[n].toString() + "\n");
            reg.setSubject(sub[n], count);
            count++;
            if (count == 5)
                addsubBtn.setEnabled(false);
        } else if (event.getSource() == saveBtn) {
            String output = "";
            output = "Student :" + reg.getStudent();
            output += "\nSubject:\n";
            for (int n = 0; n < count; n++)
                output += reg.getSubject(n) + "\n";
            JOptionPane.showMessageDialog(this, output,
                    "Registration Data", JOptionPane.INFORMATION_MESSAGE);
            resetBtn();
        } else if (event.getSource() == cancleBtn) {
            stdText.setText("");
            subTextArea.setText("");
            count = 0;
            resetBtn();
        }
    }

    public void resetBtn() {
        addstdBtn.setEnabled(true);
        addsubBtn.setEnabled(false);
        saveBtn.setEnabled(false);
        cancleBtn.setEnabled(false);
        stdText.setText("");
        subTextArea.setText("");
    }

    public static void main(String[] args) {
        new Lab9_1();
    }
}