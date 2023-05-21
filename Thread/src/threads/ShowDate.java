/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//import java.time.format.DateTimeFormatter;
//import java.util.concurrent.TimeUnit;

/**
 *
 * @author Adil
 */
public class ShowDate implements Runnable{
    boolean situation = true;
    @Override
    public void run() {
        while (situation) {            
            printCurrentTime();
            sleepOneSec();
           
        }
    }
    
    

    private void sleepOneSec() {
        try {
            Thread.sleep(1000);
           // TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
     private void printCurrentTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:s a");
        
        String formatterText = LocalDateTime.now().format(formatter);
        
        System.out.println(formatterText);
    }

   
    
    private void off()
    {
        this.situation = false;
        System.out.println("OFF");
    }
    
    
    public static void main(String[] args) throws InterruptedException{
        ShowDate sD = new ShowDate();
        Thread t = new Thread(sD);
        t.start();
        
        Thread.sleep(10000);
       
        sD.off();
    }
}
