/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread_practice;

/**
 *
 * @author Adil
 */
public class JoinThreadAndIsAliveThread implements Runnable{

    @Override
    public void run() {
        for(int i=1; i<=5; i++)
        {
           try{
                Thread.sleep(500);
            }catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
    
    
    public static void main(String[] args) throws InterruptedException {
        JoinThreadAndIsAliveThread t1 = new JoinThreadAndIsAliveThread();
        JoinThreadAndIsAliveThread t2 = new JoinThreadAndIsAliveThread();
        JoinThreadAndIsAliveThread t3 = new JoinThreadAndIsAliveThread();
        
        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        Thread th3 = new Thread(t3);
        
        th1.setName("Thread-1");
        th2.setName("Thread-2");
        th3.setName("Thread-3");

       
        th1.start();
        th1.join();
        
       
        th2.start();
      
        th3.start();
        
       System.out.println("Thread is alive: "+th1.isAlive());
        
    
    }
    
}
