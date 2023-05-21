// parametrized constructor 

package oop;


public class Student3 {
    String name;
    int id; 
    double cgpa;
    Student3(String n, int d, double g){
        name = n;
        id = d;
        cgpa = g;
        
    }
    void displayinfo(){
      
        System.out.println(" "+name);
        System.out.println(" "+id);
        System.out.println(" "+cgpa);

        System.out.println();
    
}

    
}
