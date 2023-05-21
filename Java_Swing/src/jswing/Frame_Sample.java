

package jswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Frame_Sample  {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MY Frame Title");
        frame.setSize(800,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JComboBox cb;
        
        String[] s = {"Dhaka", "Sylhet", "Rajshahi", "Barishal"};
        
        cb = new JComboBox(s);
        
        cb.setBounds(50, 10, 200, 50);
        frame.add(cb);
        
        
        JRadioButton r1 = new JRadioButton("Male"), r2 = new JRadioButton("Female");
        r1.setBounds(300, 10, 100, 50);
        r2.setBounds(400, 10, 100, 50);
        
        //ButtonGroup is used for selecting only one item
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        
       
        frame.add(r1);
        frame.add(r2);       
        
        frame.setLayout(null);
        frame.setVisible(true);
        
        //ActionListener with JCheckBox
        cb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Selected "+cb.getSelectedItem());
                JOptionPane.showMessageDialog(null, cb.getSelectedItem()+" is selected");
            }
        });
        
        
        //ActionListener with RadioButton
        r1.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent ae){
                
                JOptionPane.showMessageDialog(null, ""+r1.getText());
            }
        
        });
        
         r2.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent ae){
                
                JOptionPane.showMessageDialog(null, ""+r2.getText());
            }
        
        });
}

    

}