/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author Adil
 */
public class JoinThreadAndIsAliveThread extends Thread{

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
        
        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");
        
        t1.start();
        t1.join();
       
        t2.start();
        
        t3.start();
         System.out.println("Thread is alive: "+t1.isAlive());
        
    
    }
    
}
