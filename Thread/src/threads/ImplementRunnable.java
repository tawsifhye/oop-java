/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author Adil
 */
public class ImplementRunnable implements Runnable{

    @Override
    public void run() {
        for(int i=0; i<5; i++)
        {
            System.out.println("["+i+"] Inside "+ Thread.currentThread().getName());
            sleepOneSec();
        }
    }

    private static void sleepOneSec() {
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(1));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        ImplementRunnable eT = new ImplementRunnable();
        Thread t = new Thread(eT);
        t.setName("Runnable Interface");
        t.start();
        
        
        for(int i=0; i<5; i++)
        {
            System.out.println("["+i+"] Inside "+ Thread.currentThread().getName());
            sleepOneSec();
        }
        
        
    }
}