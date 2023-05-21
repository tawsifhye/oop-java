
package beginnerjava;
import java.util.Scanner;


public class ArithmeticOperator {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);        
        int num1, num2;
        double result;
        System.out.print("Enter two number: ");
        num1=input.nextInt();
        num2=input.nextInt();
        
        result=num1 + num2;
        System.out.println("Sum = "+result);
        
        result=num1 - num2;
        System.out.println("Sub = "+result);
        
        result=num1 * num2;
        System.out.println("Multiflication = "+result);
        
   
        result = (double) num1 / num2;
        System.out.println("Div = "+result);
                
        result=num1 % num2;
        System.out.println("Reminder = "+result);
                
    
    
  }
            
            
            
            
            
    
}
