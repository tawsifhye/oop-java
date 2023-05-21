 package dialog_box;
 
 
import javax.swing.*;

public class InputDialog1 {
    public static void main(String[] args) {
        
        String fn = JOptionPane.showInputDialog(null, "Enter First Name", "First Name", JOptionPane.PLAIN_MESSAGE);
        String ln = JOptionPane.showInputDialog(null, "Enter Last Name", "Last Name", JOptionPane.PLAIN_MESSAGE);
       
       String fullname = fn.concat( ln);
       
       JOptionPane.showMessageDialog(null, "Full Name: "+fullname, "Full Name", JOptionPane.PLAIN_MESSAGE);
        
        
    }
}
