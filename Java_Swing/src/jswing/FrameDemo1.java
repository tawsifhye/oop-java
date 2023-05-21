
package jswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;



public class FrameDemo1 {
    
     
        
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Leading University");
        frame.setLayout(null);
        frame.setSize(800,600);
        frame.setVisible(true);
        
        
        JLabel l1 = new JLabel();
        frame.add(l1);
        l1.setBounds(30, 20, 200, 50);
        l1.setText("Enter your student id");
        
        JLabel l2 = new JLabel();
        frame.add(l2);
        l2.setBounds(30, 100, 200, 50);
        l2.setText("Enter your name");
        
        JLabel l3 = new JLabel();
        frame.add(l3);
        l3.setBounds(30, 180, 200, 50);
        l3.setText("Enter your paswword");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JTextArea tf1 = new JTextArea();
        frame.add(tf1);
        tf1.setBounds(40,60,200,30);
        
        JTextArea tf2 = new JTextArea();
        frame.add(tf2);
        tf2.setBounds(40,140,200,30);
        
        JPasswordField jf = new JPasswordField();
        frame.add(jf);
        jf.setBounds(40,220,200,30);
        
        JButton b1 = new JButton("Next");
        frame.add(b1);
        b1.setBounds(500,400,100,30);
       
        
        
        
      b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Name: "+tf1.getText()+"\nID: "+tf2.getText()+"\nPassword: "+jf.getText(),
                        "Confirmation" , JOptionPane.PLAIN_MESSAGE);
            }
        });
         
        
    }   
}

