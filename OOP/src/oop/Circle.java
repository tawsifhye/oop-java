//returning value from method
package oop;


public class Circle {
    double radius; 
    Circle(){
        //System.out.println("Circle created with radius: "+radius);
    }
    
    double circumference(){
        System.out.println();
        return 2*3.1416*radius;
        //return 2*Math.PI*radius;
    
    }
    
    double area(){
        System.out.println();
        return 3.1416*radius*radius;
        //return Math.PI*radius*radius;
        
    }
         
            
    
}
