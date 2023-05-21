
package this_keyword;


public class Constructor {
     int a, b, c, d;
     
     Constructor(){
         System.out.println("A Default Constructor");
     }
     

     Constructor(int a, int b, int c, int d){
        this();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
     
     }
     
     void sum(){
         System.out.println("Addition: "+(a+b+c+d));
        
    }
     void sub(){
         System.out.println("Substraction: "+(a-b-c-d));
     }
    void multiplication(){
         System.out.println("Multiplicaton: "+(a*b*c*d));
     }
   
    //applying this to call method
    void result(){
        this.sum();
        this.sub();
        this.multiplication();
    }
    
}
