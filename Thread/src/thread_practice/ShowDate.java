
package thread_practice;
//import java.util.concurrent.TimeUnit;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ShowDate implements Runnable {
   volatile boolean situation = true;
    @Override
    public void run()
    {
          while (true) {            
            printCurrentTime();
            sleepOneSec();
        }
    }
    
     private void off()
    {
        this.situation = false;
        System.out.println("off");
    }
    
    private void printCurrentTime() {
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:s a");
        
        String formatterText = LocalDateTime.now().format(formatter);
        
        System.out.println(formatterText);
    }
     private void sleepOneSec() {
        try {
            Thread.sleep(1000);
           
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    
    
   
    
    
    public static void main(String[] args) throws InterruptedException{
        ShowDate sD = new ShowDate();
        Thread t = new Thread(sD);
        t.start();
        
        Thread.sleep(10000);
        sD.off();
    }
    
}
