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
public class JComboBoxExample extends JFrame implements ActionListener{

    JComboBox cb;
    JLabel l;
    JButton b;
    JComboBoxExample()
    {
        super("JComboBox test");
        setSize(400,400);
        String languages[] = {"C++","C","java","Python","C#"};
        cb = new JComboBox(languages);
        b = new JButton("Show");
        l = new JLabel();
        l.setBounds(50,50,200,40);
        cb.setBounds(50,150,100,40);
        b.setBounds(50,20,100,40);
        b.addActionListener(this);
        
        add(cb);
        add(l);
        add(b);
        
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String data = "Selected language is : "+cb.getItemAt(cb.getSelectedIndex());
        
        l.setText(data);
    }
    public static void main(String[] args) {
        new JComboBoxExample();
    }
}
