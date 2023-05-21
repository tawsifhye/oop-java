
package Example2;


public class Car extends Vehicle {
    int seat;
    Car(String a, int s, String b){
        super(a,b);
        seat =s;
        
    }
    
    @Override
    void attribute(){
        super.attribute();
        System.out.println("Seat: "+seat);
    }
    
    
}
