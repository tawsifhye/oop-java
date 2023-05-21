/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread_practice;

/**
 *
 * @author Tawsif Chowdhury
 */
public class Tutorial extends Thread {
    
   @Override
   public void run (){
       for (int i = 1; i <= 5; i++) {
           try{
               Thread.sleep(500);
           }catch(InterruptedException e)
           {e.printStackTrace();}
           
           System.out.println(Thread.currentThread().getName()+":"+i);
           
       }
   
   }
    public static void main(String[] args) throws InterruptedException {
        Tutorial t1 = new Tutorial();
        Tutorial t2 = new Tutorial();
        Tutorial t3 = new Tutorial();
        Tutorial t4 = new Tutorial();
        Tutorial t5 = new Tutorial();
        
        t1.setName("Thread-1"); t2.setName("Thread-2"); t3.setName("Thread-3");
        t4.setName("Thread-4"); t5.setName("Thread-5");
        
        t1.start();
        System.out.println("Thread-1 is alive: "+t1.isAlive());
        t1.join(); t2.start(); t3.start(); t2.join(); t4.start(); t5.start();
        
        System.out.println("Thread-4 is alive "+t4.isAlive());
        System.out.println("Thread-1 is alive "+t1.isAlive());
        
        
    }
    
}
