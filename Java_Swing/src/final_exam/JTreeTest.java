/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_exam;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeTest {

    JFrame f;
    public JTreeTest() 
    {
        f=new JFrame();   
        DefaultMutableTreeNode style=new DefaultMutableTreeNode("Style");  
        DefaultMutableTreeNode color=new DefaultMutableTreeNode("color");  
        DefaultMutableTreeNode font=new DefaultMutableTreeNode("font");  
        style.add(color);  
        style.add(font);  
        DefaultMutableTreeNode red=new DefaultMutableTreeNode("red");  
        DefaultMutableTreeNode blue=new DefaultMutableTreeNode("blue");  
        DefaultMutableTreeNode black=new DefaultMutableTreeNode("black");  
        DefaultMutableTreeNode green=new DefaultMutableTreeNode("green");  
        color.add(red); color.add(blue); color.add(black); color.add(green); 
        DefaultMutableTreeNode times_new_roman=new DefaultMutableTreeNode("Times New Roman");  
        DefaultMutableTreeNode arial=new DefaultMutableTreeNode("Arial");  
        font.add(times_new_roman);font.add(arial);
        JTree jt=new JTree(style);  
        f.add(jt);  
        f.setSize(200,200);  
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
    }
    
    public static void main(String[] args) {
        new JTreeTest();
    }
    
}
