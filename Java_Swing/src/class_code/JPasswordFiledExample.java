/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_code;;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Adil
 */
public class JPasswordFiledExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("Checking JPasswordField");
        f.setSize(400,400);
        JPasswordField pf = new JPasswordField();
        pf.setBounds(60,50,100,40);
        JLabel l = new JLabel();
        l.setBounds(20,200,300,40);
        JButton b = new JButton("Click");
        b.setBounds(60,120,100,40);
        f.add(pf);
        f.add(b);
        f.add(l);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = "Password is : "+new String(pf.getPassword());
                
                l.setText(data);
            }
        });
        
        
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        
        
        
    }
    
}
