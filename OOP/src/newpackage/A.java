/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Tawsif Chowdhury
 */
public class A {
    int p;
    void insert(int num){
        p = num;
    }
    
}

class Test{
    public static void main(String[] args) {
        A a = new A();
        a.insert(20);
        
    }
   
}
