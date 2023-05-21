package beginnerjava;

import java.util.Scanner;

 
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r, area;
        System.out.println("Enter the radius of circle: ");
        r=input.nextDouble();
        area = 3.1416 * r * r;
        System.out.println("Area of Circle: "+area); 
        
        
    }   
    
}
