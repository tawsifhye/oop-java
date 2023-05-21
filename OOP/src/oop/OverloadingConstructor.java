
package oop;


public class OverloadingConstructor {
    String name;
    int id; 
    double cgpa;
    OverloadingConstructor (){
        System.out.println("No Information\n");
    }
    OverloadingConstructor (String n, int d){
        name = n;
        id =d; 
    }
    
    OverloadingConstructor (String n, int d, double cgpa){
        name = n;
        id = d; 
        this.cgpa = cgpa;
    
    }
    
    void display(){
        System.out.println(" "+name);
        System.out.println(" "+id);
        System.out.println(" "+cgpa);

        System.out.println();
    }
    
    
}
