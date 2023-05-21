/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_code;

import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author Adil
 */
public class ExampleSwing_C {
    public static void main(String[] args) {
        
        JFrame jf = new JFrame("First JFrame");
        jf.setSize(700,900);
        
        //Initializing JButton
        JButton jb = new JButton("Clcik");
        jb.setBounds(100,150,100,50);
        
        
        
        JTextField jtf = new JTextField();
        jtf.setBounds(130,280,200,50);
        jf.add(jtf);
        
        jf.add(jb);
        jb.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                jtf.setText("welcome to java");
            }
        });
        
        
        
       jf.setLayout(null);
       jf.setVisible(true);
       jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
