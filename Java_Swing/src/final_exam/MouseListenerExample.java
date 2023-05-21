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
import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;
public class MouseListenerExample extends JFrame implements MouseListener,
        MouseMotionListener{  
    JLabel l,l1;  
    MouseListenerExample(){  
        addMouseListener(this);  
        addMouseMotionListener(this);
          
        l=new JLabel(); 
        l1 = new JLabel();
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setVerticalAlignment(JLabel.CENTER);
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setVerticalAlignment(JLabel.CENTER);
        add(l);//,BorderLayout.CENTER);
        add(l1);//,BorderLayout.SOUTH);
        setSize(300,300);   
        setVisible(true);
        setLayout(new GridLayout(1,1));
       // setLayout(new FlowLayout(FlowLayout.CENTER));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        
    } 
    
    public void mouseDragged(MouseEvent e) {
        l1.setText("dragged");
    }

    
    public void mouseMoved(MouseEvent e) {
        l1.setText("movinggggg");
    }
    public void mouseClicked(MouseEvent e) {  
       // l.setText("Mouse Clicked"); 
       l.setText(String.format("Clicked at %d, %d", e.getX(), e.getY()));
    }  
    public void mouseEntered(MouseEvent e) {  
        l.setText("Mouse Entered");  
    }  
    public void mouseExited(MouseEvent e) {  
        l.setText("Mouse Exited");  
    }  
    public void mousePressed(MouseEvent e) {  
        l.setText("Mouse Pressed");  
    }  
    public void mouseReleased(MouseEvent e) {  
        l.setText("Mouse Released");  
    }  
public static void main(String[] args) {  
    new MouseListenerExample();  
}  

    
}  
