
package jswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class NewClass extends JFrame implements ActionListener {
    JComboBox cb;
    JLabel l;
    JButton b;
    NewClass(){
        super("ComboBox Demo");
        setSize(400,400);
        String Prolanguages[]={"Java","Python","C","C++","PHP"};
        cb = new JComboBox(Prolanguages);
        b = new JButton("Show");
        l = new JLabel();
        l.setBounds(50,50,200,40);
        cb.setBounds(50,150,100,40);
        b.setBounds(50,300,100,40);
        b.addActionListener(this);
        add(cb);
        add(l);
        add(b);
        
        setLayout(null);
        setVisible(true);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       String data = "Selected Language is: "+cb.getItemAt(cb.getSelectedIndex());
       l.setText(data);
    }
    public static void main(String[] args) {
        new NewClass();
    }
    
}