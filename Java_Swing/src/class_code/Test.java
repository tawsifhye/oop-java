/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_code;;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Adil
 */
public class Test {
    public static final String[] Perfumes = {"Boss","O2","KC","Fog"};
    private static final String[] Options = {"Ok","Cancel","Confused"};
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("C:/Users/Adil/Desktop/tt.png");
        
        //showConfirmDialog
        JOptionPane.showConfirmDialog(null, "Bushra?", "Title",JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE );
        


//showInputDialog
  JOptionPane.showInputDialog(null, "What is your favourite perfume brand?", "Perfumes",JOptionPane.QUESTION_MESSAGE,null,Perfumes,Perfumes[2]);

   //showMessageDialog
    JOptionPane.showMessageDialog(null, "How are you?", "Asking your health condition?", JOptionPane.WARNING_MESSAGE,null);
   
   


// showOptionDialog
         JOptionPane.showOptionDialog(null, "Want to quit?", "Quit?",0 ,JOptionPane.ERROR_MESSAGE, null, Options, Options[1]);
    }
    
}
