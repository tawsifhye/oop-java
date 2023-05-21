/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_exam;

/**
 *
 * @author Adil
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AnotherJPanelTest extends JFrame implements ActionListener{
    String colorsName[];
    Color colors[];
    JPanel pn;
    JComboBox cb;
    
    AnotherJPanelTest()
    {
        super("Test");
        setBounds(100, 100, 300, 300);
        
        
        colorsName = new String[] {"Green","Blue","Yellow"};
        
        colors = new Color[] {Color.GREEN,Color.BLUE,Color.YELLOW};
        cb = new JComboBox(colorsName);
        cb.setSelectedIndex(0);
        cb.addActionListener(this);
        
        add(cb,BorderLayout.NORTH);
        pn = new JPanel();
        pn.setBackground(colors[0]);
        add(pn,BorderLayout.CENTER);
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        pn.setBackground(colors[cb.getSelectedIndex()]);
    }
    
    public static void main(String[] args) {
        new AnotherJPanelTest();
    }
}
