package digital_watch;

import javax.swing.*;  
import java.text.*;  
import java.util.*;  
public class DigitalWatch implements Runnable{  
JFrame f;  
Thread t=null;  
int hours=0, minutes=0, seconds=0;  
String timeString ;  
JButton b;  
  
DigitalWatch(){  
    f=new JFrame();  
      
    t = new Thread(this);  
        t.start();  
      
    b=new JButton();  
        b.setBounds(100,100,150,50);  
      
    f.add(b);  
    f.setSize(300,400);  
    f.setLayout(null);  
    f.setVisible(true);  
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}  
  
 public void run() {  
      try {  
         while (true) {  
  
            Calendar cal = Calendar.getInstance();  
            hours = cal.get( Calendar.HOUR_OF_DAY );  
            if ( hours > 12 ) hours -= 12;  
            minutes = cal.get( Calendar.MINUTE );  
            seconds = cal.get( Calendar.SECOND ); 
  
            SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss a");  
            Date date = cal.getTime();  
            timeString = formatter.format( date );  
  
            printTime();  
  
            t.sleep(1000);  
         }  
      }  
      catch (Exception e) { }  
 }  
  
public void printTime(){  
b.setText(timeString);  
}  
  
public static void main(String[] args) {  
    new DigitalWatch();  
          
  
}  
}