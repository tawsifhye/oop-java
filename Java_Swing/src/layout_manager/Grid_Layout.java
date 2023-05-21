
package layout_manager;


import java.awt.GridLayout;
import javax.swing.*;

public class Grid_Layout {
    JFrame f;
    JCheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9, cb10;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    
    Grid_Layout(){
        f = new JFrame("Grid Layout");
        f.setSize(500,400);
           
        cb1 = new JCheckBox();
        cb2 = new JCheckBox();
        cb3 = new JCheckBox();
        cb4 = new JCheckBox();
        cb5 = new JCheckBox();
        cb6 = new JCheckBox();
        cb7 = new JCheckBox();
        cb8 = new JCheckBox();
        cb9 = new JCheckBox();
        cb10 = new JCheckBox();
        
        f.add(cb1);
        f.add(cb2);
        f.add(cb3);
        f.add(cb4);
        f.add(cb5);
        f.add(cb6);
        f.add(cb7);
        f.add(cb8);
        f.add(cb9);
        f.add(cb10);
        
      /*  
        b1=new JButton("1"); 
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6"); 
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b10=new JButton("10");
        
        
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b10);
       */ 
       f.setLayout(new GridLayout(6,1));
        
       f.setVisible(true);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    public static void main(String[] args) {
      
        new Grid_Layout();
    }
    
}

