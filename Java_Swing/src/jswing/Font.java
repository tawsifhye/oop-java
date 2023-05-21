
package jswing;

import javax.swing.*;


public class Font extends JFrame {
    
    Font(){
    
        super("Exam Sample");
        setSize(400,400);
       
        String s[] = {"Ariels", "Calibri", "Gadighi",};
        
        JComboBox cb = new JComboBox(s);
        cb.setBounds(50, 50, 100, 50);
        add(cb);
        
        JCheckBox c = new JCheckBox("Bold", true);
        c.setBounds(180, 50, 100, 50);
        add(c);
        
        JButton jb = new JButton("Set font");
        jb.setBounds(250, 50, 100, 50);
        add(jb);
        
         setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    public static void main(String[] args) {
        new Font();
    }
    
}
