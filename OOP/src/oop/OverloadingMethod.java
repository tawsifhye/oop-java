
package oop;
public class OverloadingMethod {
    int a,b,c;
    double a1,b1,c1;
    void add(int a, int b){
       this.a = a;
       this.b = b;
       if(a>b)
        System.out.println(a);
       else
        System.out.println(b);
          
    }
    
    void add(double a, double b){
        a1 = a; 
        b1 = b;
        if(a>b)
            System.out.println(a);
        else 
            System.out.println(b);
    }
    
    void add(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        if(a>b && a>c)
            System.out.println(a);
        else if (b>a && b>c)
            System.out.println(b);
        else 
            System.out.println(c);
        
       
    }
    
    void add(){
        System.out.println("Nothing to add");
    }
    
    
}
