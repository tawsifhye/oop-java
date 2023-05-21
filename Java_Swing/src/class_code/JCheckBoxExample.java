/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_code;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Adil
 */
public class JCheckBoxExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("CheckBox example");
        f.setSize(400,400);
        JLabel l;
       
        JCheckBox cb1,cb2;
        
        l = new JLabel();
        cb1 = new JCheckBox("python");
        cb2 = new JCheckBox("Java");
        l.setSize(400,100);
        cb1.setBounds(150,100,150,50);
        cb2.setBounds(150,150,150,50);
        
        f.add(l);
        f.add(cb1);
        f.add(cb2);
        
        cb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String s = "";
               if(cb1.isSelected())
               {
                   s = "Python is checked";
                   l.setText(s);
               }
               else{
                   s = "";
                   l.setText(s);
               }
              
            }
        });
        
        
        cb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = "";
               if(cb2.isSelected())
               {
                   s = "Java is checked";
                   l.setText(s);
               }
               else{
                   s = "";
                   l.setText(s);
               }
            }
        });

//        cb1.addItemListener(new ItemListener() {
//            @Override
//            public void itemStateChanged(ItemEvent e) {
//                l.setText("Python checkbox: "+(e.getStateChange()==1? "Checked":"unchecked"));
//            }
//        });
//        cb2.addItemListener(new ItemListener() {
//            @Override
//            public void itemStateChanged(ItemEvent e) {
//                l.setText("Java checkbox: "+(e.getStateChange()==1? "Checked":"unchecked"));
//            }
//        });
        
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
