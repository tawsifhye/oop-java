
package exception;


 class A {
     void doSomething(int x) throws ArithmeticException{
         if(x>10){ArithmeticException ae = new ArithmeticException("unhandled exception");
         throw ae;
         }
     }    
}

public class Throws_Keyword{
    public static void main(String[] args) {
           A a = new A();
    
    try{
        a.doSomething(23);
}catch(ArithmeticException e){
            System.out.println("exception handled here");
}

    }
 
}
