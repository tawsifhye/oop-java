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
public class Containers<T> {
    static final int MAX_LENGTH = 10;
    private T[] items;
    private int currentIndex = 0;
    
    Containers()
    {
        items = (T[]) new Object[MAX_LENGTH];
    }
    public void addItem(T item)
    {
        if(currentIndex<MAX_LENGTH)
        {
            items[currentIndex++] = item;
        }
        else{
            System.out.println("Container is full");
        }
    }
    public void printAll(){
        for(int i=0; i<currentIndex; i++)
        {
            System.out.print(items[i]+ " , ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Containers<Integer> intC = new Containers<Integer>();
        
        Containers<String> stringC = new Containers<String>();
        
        intC.addItem(12);
        intC.addItem(14);
        intC.addItem(16);
        intC.addItem(17);
        intC.addItem(18);
        intC.addItem(11);
        intC.addItem(12);
        intC.addItem(14);
        intC.addItem(19);
        intC.addItem(21);
        intC.addItem(25);
        
        intC.printAll();
        
        stringC.addItem("CSE");
        stringC.addItem("44 Batch");
        stringC.addItem("Love you all");
        stringC.printAll();
        
    }
}
