
package dialog_box;

import javax.swing.*;


public class ConfirmDialog1 {
    public static void main(String[] args) {
        
       int choice = JOptionPane.showConfirmDialog(null, "Do you want to exit?", "Confirmation", JOptionPane.YES_NO_OPTION);
       
       if(choice == JOptionPane.YES_OPTION){
           JOptionPane.showMessageDialog(null, "Terminated");
            
       }
       
       else{
           JOptionPane.showMessageDialog(null, "Return");
       }
    }
    
}
