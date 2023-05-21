
package beginnerjava;

import java.util.Scanner;


public class TemperatureDemo {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double c,f;
        System.out.print("Celcius: ");
        c=input.nextDouble();
        
        f= (1.8 * c) + 32;
        System.out.println("Fharenheit: "+f);
        
       
        //double f1, c1;
        System.out.print("Fharenheit: ");
        f = input.nextDouble();
        
        c = 0.5555555556 * (f-32);
        System.out.println("Celcius: "+c);
    }
    
}


