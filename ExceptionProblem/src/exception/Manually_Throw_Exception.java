
package exception;

import java.util.Scanner;

public class Manually_Throw_Exception {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        
        while(true){
            x= in.nextInt();
            
            try{
                
                if(x>50){
                    ArithmeticException ae = new ArithmeticException("Because I Can");
                    throw ae;
                }
            
            }catch(ArithmeticException e){
                        System.out.println(e.getLocalizedMessage());
            }
        }
        
    }
}
