
package jswing;

import java.awt.Color;
import javax.swing.*;


public class JPanelDemo extends JFrame {
    
    JPanel jp1, jp2, jp3;
    JButton b1, b2, b3;
    
    JPanelDemo(){
        
        super("JPanel Demo");
        setSize(400,500);
        
        b1 = new JButton("JPanel 1");
        b1.setBounds(0,0, 80, 80);
        
        b2 = new JButton("JPanel 2");
        b2.setBounds(0,0, 80, 80);
        
        b3 = new JButton("JPanel 3");
        b3.setBounds(0,0, 80, 80);
        
        jp1 = new JPanel();
        jp1.setBounds(50, 50, 150, 100);
        jp1.setBackground(Color.BLUE);
        
        jp2 = new JPanel();
        jp2.setBounds(20, 10, 300, 30);
        jp2.setBackground(Color.CYAN);
        
        jp3 = new JPanel();
        jp3.setBounds(50, 200, 150, 100);
        jp3.setBackground(Color.RED);
        
        add(jp1);
        add(jp2);
        add(jp3);
        jp1.add(b1);
        jp2.add(b2);
        jp3.add(b3);
        
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new JPanelDemo();
    }
    
}
