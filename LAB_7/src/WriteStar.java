

import java.awt.*;    
import java.awt.event.*;
import javax.swing.*;

    public class WriteStar implements ActionListener {
        JLabel number1Label, number2Label;
        JTextField NumberX, NumberY, resultField;
        JButton btn1;
        JFrame window;

        public WriteStar() {
        window = new JFrame("Write Star Swing Application");

        Container container = window.getContentPane();
        container.setLayout( new FlowLayout() );
    
        number1Label = new JLabel( "Enter X " );
        container.add( number1Label );

        NumberX = new JTextField( 10 );
        container.add( NumberX );

        number2Label = new JLabel( "Enter Y" );
        container.add( number2Label );

        NumberY = new JTextField( 10 );
        container.add( NumberY );

        btn1 = new JButton(" OK ");
        btn1.addActionListener( this );
        container.add( btn1 );


        window.setSize( 300,150);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
    
    public void actionPerformed( ActionEvent event ){

        int num1 = Integer.parseInt(NumberX.getText()) ;
        int num2 = Integer.parseInt(NumberY.getText()) ;

        
        for (int i = 1; i <= num1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = num1 - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
            
        

        
    }
        
    public static void main(String[] args) {
        WriteStar gui = new WriteStar();
    }
}