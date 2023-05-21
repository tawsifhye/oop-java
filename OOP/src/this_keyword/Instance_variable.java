
package this_keyword;

public class Instance_variable {
    
    int a, b, c, d;
    
    Instance_variable(){
    
    }
    
    Instance_variable(int a, int b, int c, int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    
    }
    
    void show(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
