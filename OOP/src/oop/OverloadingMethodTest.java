
package oop;

public class OverloadingMethodTest {
    public static void main(String[] args) {
        OverloadingMethod ob = new OverloadingMethod();
        
        ob.add();
        ob.add(20,78);
        ob.add(5.6,2.4);
        ob.add(9,75,5);
    }
    
}
