
package assignment;

public class CargoShip extends Ship {
    private int capacity;
    
    CargoShip(){
    
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    @Override
    void display(){
        System.out.println("Name: "+getName());
        System.out.println("Capacity: "+getCapacity());
        System.out.println();
        
      
    }
    
}
