
package jswing;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;


public class JTreeDemo extends JFrame {
    
    JTree jt;
    DefaultMutableTreeNode style;
    DefaultMutableTreeNode color;
    DefaultMutableTreeNode font;
    DefaultMutableTreeNode red;
    DefaultMutableTreeNode black;
    DefaultMutableTreeNode blue;
    DefaultMutableTreeNode green;
    DefaultMutableTreeNode bold;
    DefaultMutableTreeNode italic;
    DefaultMutableTreeNode underlined;
    
    
    JTreeDemo(){
        super("JTree");
        setSize(500,400);
        
        
        style = new DefaultMutableTreeNode("Style");
        color = new DefaultMutableTreeNode("Color");
        black = new DefaultMutableTreeNode("Black");
        red = new DefaultMutableTreeNode("Red");
        blue = new DefaultMutableTreeNode("Blue");
        green = new DefaultMutableTreeNode("Green");
        
        font = new DefaultMutableTreeNode("Font");
        bold= new DefaultMutableTreeNode("Bold");
        italic = new DefaultMutableTreeNode("Italic");
        underlined = new DefaultMutableTreeNode("Underlined");
        
        
        style.add(color);
        style.add(font);
        
        color.add(black);
        color.add(red);
        color.add(blue);
        color.add(green);
        
        font.add(bold);
        font.add(italic);
        font.add(underlined);
        
        jt = new JTree(style);
        
        add(jt);
        
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new JTreeDemo();
    }
    
}
