
package jswing;

import javax.swing.*;
import java.awt.event.*;

public class Gadget_World extends JFrame implements ActionListener{
  
    JLabel l;
    JCheckBox cb1 , cb2, cb3;
    JButton b;
    
    Gadget_World() {
       
       super("Gadget World");
       setSize(500, 500);
       
       l = new JLabel("Choose your gadget");
       l.setBounds(100,50,150,50);
       
       cb1 = new JCheckBox("Gmaing console:$25");
       cb1.setBounds(100, 100, 150, 50);
       
       cb2 = new JCheckBox("Watch:$30");
       cb2.setBounds(100, 150, 150, 50);
       
       cb3 = new JCheckBox("Earphone:$10");
       cb3.setBounds(100, 200, 150, 50);
       
       b = new JButton("Order");
       b.setBounds(100, 250, 150, 50);
       
       b.addActionListener(this);
               
       add(l);
       add(cb1);
       add(cb2);
       add(cb3);
       add(b);
       
       setLayout(null);
       setVisible(true);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        int a = 0;
        String s = "";
        
       if(cb1.isSelected()){
            
             a +=25;
            s =cb1.getText();
        }
           
        if(cb2.isSelected()){
            
            a += 30;
            s =s.concat("\n"+cb2.getText());
           
        }
        
        if(cb3.isSelected()){
            a += 10;
            s =s.concat("\n"+cb3.getText());
        }
        
        String show = (s+"\n\n..........\n"+"Total:$"+a);
        JOptionPane.showMessageDialog(this, show);
         
       }
        
      public static void main(String[] args) {
      new Gadget_World();
    }
       
    }
    
    
    

