/**
 *
 * @author Tawsif Chowdhury
 */
package thread_practice;


public class Extendin_Thread_Class extends Thread {
    
    public void run(){
        String tName = Thread.currentThread().getName();
        System.out.println(tName);
    }
    public static void main(String[] args) {
        
        Extendin_Thread_Class t = new Extendin_Thread_Class();
        t.setName("Thread-1");
        t.start();
        System.out.println("ID "+t.getId());
    }
    
}
