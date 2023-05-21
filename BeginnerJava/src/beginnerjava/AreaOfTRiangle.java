
package beginnerjava;

import java.util.Scanner;


public class AreaOfTRiangle {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in); 
       double base,height;
       
        System.out.print("Enter the base: ");
        base =input.nextDouble();
        System.out.print("Enter the height: ");
        height=input.nextDouble();
        
       double area = 0.5 * base * height;
        System.out.printf("Area = %f unit",area);
        //System.out.println("Area =  "+area);
       
        
    }
    
}
