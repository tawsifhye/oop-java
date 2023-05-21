
package exception;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x,y;
        int arr[] = new int [10];
        
        while(true){
            x = in.nextInt();
            y = in.nextInt();
            try{
                System.out.println(x +"/" + y + " = " + (x/y));
                arr[y] = x;
            }catch(ArithmeticException e){
                System.out.println("Don't divide by zero");
                System.out.println(e.getLocalizedMessage());
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Index should be less than 10");
                
            }
                
            
        }
    }
}
