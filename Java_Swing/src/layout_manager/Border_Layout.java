
package layout_manager;

import javax.swing.*;
import java.awt.*;



public class Border_Layout{
    JFrame f;
    JButton b1,b2,b3,b4,b5;
    
    Border_Layout(){
        
        f = new JFrame("Border Layout");
        f.setSize(500,400);
        
        f.setLayout(new BorderLayout(5,5));
        
        b1=new JButton("NORTH"); 
        b2=new JButton("SOUTH");
        b3=new JButton("EAST");
        b4=new JButton("WEST");
        b5=new JButton("CENTER");
        
        f.add(b1,BorderLayout.NORTH);
        f.add(b2,BorderLayout.SOUTH);
        f.add(b3,BorderLayout.EAST);
        f.add(b4,BorderLayout.WEST);
        f.add(b5,BorderLayout.CENTER);
        
        
        
       
       f.setVisible(true);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public static void main(String[] args) {
        new Border_Layout();
    }
    
}
