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
public class ExtendingThread extends Thread{

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
        ExtendingThread eT = new ExtendingThread();
        eT.setName("Extended Thread");
        eT.start();
        
        for(int i=0; i<5; i++)
        {
            System.out.println("["+i+"] Inside "+ Thread.currentThread().getName());
            sleepOneSec();
        }
        
        
    }
}
