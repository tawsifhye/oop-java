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
public class JRadioButtonExample extends JFrame implements ActionListener{
    JRadioButton rb1,rb2;
    JButton b;
    JRadioButtonExample()
    {
        
        super("JRadioButton Test");
        setSize(400,400);
        rb1 = new JRadioButton("Male");
        rb2 = new JRadioButton("Female");
        b = new JButton("Click");
        rb1.setBounds(60,200,100,30);
        rb2.setBounds(60,250,100,30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        b.setBounds(60,320,100,30);
        b.addActionListener(this);
        add(rb1);
        add(rb2);
        add(b);
        
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(rb1.isSelected())
        {
            JOptionPane.showMessageDialog(this, "You are male");
        }
        if(rb2.isSelected()){
            JOptionPane.showMessageDialog(this, "You are a female");
        }
    }
    public static void main(String[] args) {
        new JRadioButtonExample();
    }
}
