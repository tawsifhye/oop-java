
package assignment;

public class CruiseShip extends Ship {

    private int passengers;
    
    CruiseShip(){
    
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
    
    @Override
    void display(){
        System.out.println("Name: "+getName());
        System.out.println("Max Passengers: "+getPassengers());
        System.out.println();
    }
    
}
