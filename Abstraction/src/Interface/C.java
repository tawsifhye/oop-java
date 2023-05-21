
package Interface;

public class C implements A,B {
    
    @Override
     public void hi(){
        System.out.println("I am from C");
}
    public static void main(String[] args) {
        C c = new C();
        c.hi();
    }
  
}
