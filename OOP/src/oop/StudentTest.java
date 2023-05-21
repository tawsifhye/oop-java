//Using Method 
package oop;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student(); //objected created 
         
        s1.name = "Tawsif Chowdhury";
        s1.id = 94;
        s1.cgpa = 3.69;
        s1.displayinfo(); //using method
         
        
        /*
        //*Witout method*
        System.out.println(" "+s1.name);
        System.out.println(" "+s1.id);
        System.out.println(" "+s1.cgpa);
       */
        
       
        Student s2 = new Student(); //objected created
        s2.name = "Tawsif";
        s2.id = 0;
        s2.cgpa = 3.69;
        s2.displayinfo(); //using method
        
        /*
        *Witout method*
        System.out.println(" "+s2.name);
        System.out.println(" "+s2.id);
        System.out.println(" "+s2.cgpa);
        */
       
        
    }
    
}
