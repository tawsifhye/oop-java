
package assignment;


public class Test {
    public static void main(String[] args) {
      Ship[] s = new Ship [3];
      s[0] = new Ship();
      s[0].setName("Ship");
      s[0].setYear("2014");
      s[0].display();
      
      s[1] = new CruiseShip();
      CruiseShip x = (CruiseShip)s[1];
      x.setName("CruiseShip");
      x.setPassengers(500);
     // x.display();
      
      s[2] = new CargoShip();
      CargoShip cr = (CargoShip)s[2];
      cr.setName("CargoShip");
      cr.setCapacity(10000);
     // cr.display();
     
      
       
       
       
      
    
        
        
       }
    }

