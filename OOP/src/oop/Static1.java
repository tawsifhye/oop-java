
package oop;


public class Static1 {
    String name; 
    int id; 
    static String un = "LU";
   final static double PI = 3.1416; 
   
    
    Static1(String n, int d){
        name = n;
        id = d;
        
    }
      void displayinfo(){
         System.out.println("Name: "+name);
         System.out.println("ID: "+id);
         System.out.println("University: "+un);
     }
      
      static void show(){
          System.out.println("Static Method");
      }
    

    
}

