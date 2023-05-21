//returning value from method
package oop;


public class CircleTest {
    public static void main(String[] args) {
        
        Circle c1 = new Circle();
        c1.radius = 5;
        System.out.println("Area of the circle: "+c1.area());
        System.out.println("Circumference of the circle: "+c1.circumference());
        
        System.out.println();
        Circle c2 = new Circle();
        c2.radius = 10;
        System.out.println("Area of the circle: "+c1.area());
        System.out.println("Circumference of the circle: "+c1.circumference());
        
        
        
    }
    
}
