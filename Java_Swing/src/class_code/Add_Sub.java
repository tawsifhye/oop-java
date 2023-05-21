
package class_code;
import javax.swing.*;
import java.awt.event.*;


public class Add_Sub extends JFrame implements ActionListener{
    
    JTextField f1,f2,f3;
    JButton b1,b2;
    Add_Sub()
    {
        super("Normal + - calculator");
        setSize(400,400);
        
        //Initializing JTextField
        f1 = new JTextField();
        f2 = new JTextField();
        f3 = new JTextField();
        f1.setBounds(50,50,150,20);
        f2.setBounds(50,100,150,20);
        f3.setBounds(50,150,150,20);
        f3.setEditable(false);
      
        
        //Initializing JButton
        b1 = new JButton("+");
        b2 = new JButton("-");
        b1.setBounds(50,200,50,50);
        b2.setBounds(120,200,50,50);
        add(f1);add(f2);add(f3);add(b1);add(b2);
        
        
        //addActionListener
        b1.addActionListener(this);
        b2.addActionListener(this);
        setLayout(null);
        setVisible(true);
       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       String s1 = f1.getText();
       String s2 = f2.getText();
       int a = Integer.parseInt(s1);
       int b = Integer.parseInt(s2);
       int c = 0;
       
       if(e.getSource() == b1)
       {
           c = a+b;
       }
       else if(e.getSource() == b2)
       {
           c = a-b;
       }
       
       String result = String.valueOf(c);
       f3.setText(result);
    }
    
    public static void main(String[] args) {
        new Add_Sub();
    }

    
}
