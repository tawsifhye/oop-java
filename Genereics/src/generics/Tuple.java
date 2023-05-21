/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author Adil
 */
public class Tuple<T, S> {
    private T t;
    private S s;

    public Tuple(T t, S s) {
        this.t = t;
        this.s = s;
    }
     T getT()
     {
         return t;
     }
     S getS()
     {
         return s;
     }
     
     void showType()
     {
         System.out.println("Type T is : "+t.getClass().getName()+"\n"+"Value of T is : "+t);
         
          System.out.println("Type S is : "+s.getClass().getName()+"\n"+"Value of S is : "+s);
         
         
     }
    
    public static void main(String[] args) {
        Tuple<String,String> t1 = new Tuple<>("Hello","Generics World");
        t1.showType();
        
        Tuple<String,Integer> t2 = new Tuple<>("Hello",2018);
        t2.showType();
        
    }
   
}
