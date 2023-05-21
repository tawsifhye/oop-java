
package jswing;
import javax.swing.*;
import java.awt.event.*;

public class LoginFrame extends JFrame{
    

    public static void main(String[] args) {
        
        
        JLabel l1, l2;
        JTextField tf;
        JPasswordField jp;
        JButton b1, b2;
        
        LoginFrame frame = new LoginFrame();
        
        frame.setSize(800,600);
        frame.setTitle("Login Frame");
        
        l1 = new JLabel("username");
        l1.setBounds(50,50,100,30);
        frame.add(l1);
        
        l2 = new JLabel("Password");
        l2.setBounds(50, 150, 100, 30);
        frame.add(l2);
        
        tf = new JTextField();
        tf.setBounds(150,50,200,30);
        frame.add(tf);
        
        jp = new JPasswordField();
        jp.setBounds(150, 150, 200, 30);
        frame.add(jp);
        
        b1 = new JButton("Login");
        b1.setBounds(150, 300, 200, 30);
        frame.add(b1);
        
        b2 = new JButton("Cancel");
        b2.setBounds(400, 300, 200, 30);
        frame.add(b2);
        
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        b1.addActionListener(new ActionListener(){
        
        public void actionPerformed(ActionEvent ae){
            
            String s1 = tf.getText();
            String s2 = jp.getText();
            if(s1.equals("") || s2.equals("")){
                
                JOptionPane.showMessageDialog(null, "Enter username and password");
            
            }
            
            else{
                        
                JOptionPane.showMessageDialog(null, "Hello "+tf.getText());
            }
           
        }
        
        });
        
        b2.addActionListener(new ActionListener(){
            
        public void actionPerformed(ActionEvent ae){
            tf.setText("");
            jp.setText("");
        }
           
        
        });
        
        
        
        
    }

   
}
