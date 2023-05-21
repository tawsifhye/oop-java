
package layout_manager;

import javax.swing.*;
import java.awt.FlowLayout;
        
        
public class Flow_Layout {
    
    JFrame f;
    JButton buttons [];
    
    Flow_Layout(){
       
        f = new JFrame("Flow Layout");
        f.setSize(500,400);
        
        buttons = new JButton[50];
        
        for (int i =0; i < 25; i++) {
            buttons[i] = new JButton(""+ (i+1) );
            f.add(buttons[i]);
        }
        
        
        
        f.setLayout(new FlowLayout(FlowLayout.LEFT));
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }
    
    public static void main(String[] args) {
        new Flow_Layout();
    }
    
}
