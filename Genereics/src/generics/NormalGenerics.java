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
public class NormalGenerics<T> {
    private T obj;

    public NormalGenerics(T obj) {
        this.obj = obj;
    }
    public T getObj()
    {
        return obj;
    }
    void showType()
    {
        System.out.println("Type of T is : "+obj.getClass().getName());
    }
    
    public static void main(String[] args) {
        NormalGenerics<Integer> iObj = new NormalGenerics<Integer>(88);
        NormalGenerics<String> sObj = new NormalGenerics<String>("Hello generics");
        int v1 = iObj.getObj();
        String v2 = sObj.getObj();
       
        iObj.showType();
        System.out.println("value of v1 : "+v1);
        sObj.showType();
        System.out.println("value of v2 : "+v2);
        
        
    }
}
