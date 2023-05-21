/**
 *
 * @author Tawsif Chowdhury
 */

package thread_practice;
public class MainThread  {
    
    public static void main(String[] args) {
      
        T1 obj = new T1();
        obj.start();// t1 start
       int p = obj.getPriority();
        try{
          
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread());
                 System.out.println(1);
                 System.out.println("Main thread is sleeping");
                 Thread.sleep(1000);
                 System.out.println("\n\n");
                 System.out.println("Main thread wake up");
                 
            }
           
        } catch(Exception e){e.printStackTrace();}
    
        System.out.println("Priority for T1 "+p);
    }
    
}
class T1 extends Thread {
    
    T1(){
    super("T1");
    
    }
      public void run(){

       
         try{
            for (int i = 1; i <= 5; i++) {
                System.out.println(currentThread());
                System.out.println(2);
                System.out.println("T1 is sleeping");
                Thread.sleep(1000);
                System.out.println("\n\n");
                System.out.println("T1 wake up");
                
                
            }
        } catch(Exception e){e.printStackTrace();}
         
        }
   
    
    
    }
    