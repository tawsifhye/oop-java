
package jswing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.*;

public class Mouse_Listener extends JFrame {
    
    JTextField f;
    JTextArea jt;
    JScrollPane jp;
    
    Mouse_Listener(){
        
    
        super("MouseListener");
        setSize(400,400);
        
        f = new JTextField();
        jt = new JTextArea();
        jp = new JScrollPane(jt);
        
        
        add(jp, BorderLayout.CENTER);
        add(f,BorderLayout.NORTH);
       
        jt.setBackground(Color.PINK);
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        f.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {
                jt.append("mouse is clicked\n");
            }

            @Override
            public void mousePressed(MouseEvent me) {
                jt.append("Mouse is pressed\n");
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                
                jt.append("Mouse is released\n");
            }

            @Override
            public void mouseEntered(MouseEvent me) {
               jt.append("Mouse is entered\n");
            }

            @Override
            public void mouseExited(MouseEvent me) {
                jt.append("Mouse is exited\n");
            }
        
        
        });
        
        f.addMouseMotionListener(new MouseMotionListener(){
            @Override
            public void mouseDragged(MouseEvent me) {
                jt.append("Mouse is dragged\n");
            }

            @Override
            public void mouseMoved(MouseEvent me) {
                jt.append("Mouse is moved\n");
                
            }
        
        
        
        });
    
    }
    
    public static void main(String[] args) {
        new Mouse_Listener();
    }
    
}
