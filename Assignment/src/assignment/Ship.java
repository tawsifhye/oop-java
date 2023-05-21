
package assignment;

public class Ship {
    private String  name;
    private String year;
    
    Ship(){
       
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    
    void display(){
        System.out.println("Nmae: "+getName());
        System.out.println("Year  "+getYear());
        System.out.println();
        
    }

    

   
    
    }
    
    

