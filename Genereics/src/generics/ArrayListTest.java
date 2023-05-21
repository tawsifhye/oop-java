/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

import java.util.*;

/**
 *
 * @author Adil
 */
public class ArrayListTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> l = new ArrayList<String> ();
        l.add("Akber"); l.add("Shah Jahan"); l.add("Babur"); l.add("Humayun");
        //l.add(l.indexOf("Babur"),"Bipro");
        System.out.println("Name of All emperors");
        System.out.println("***********************");
        Iterator itr = l.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
        
        System.out.println("Size of ArrayList : "+l.size());
        String secondPerson = l.get(1); 
        System.out.println("Second person in list"+secondPerson);
        // to change name Akber to Akber The Great
        l.set(0, "Akber The Great");
        System.out.println("Edited name of Index 0 is : "+l.get(0));
        l.remove(3);//remove Humayun
        System.out.println("After removing Humayun");
        System.out.println(l);
        
        int secondIndex = l.indexOf("Babur");
        System.out.println("Index of Babur "+secondIndex);
        l.add("Shah Jahan");//add duplicates
        System.out.println("After adding duplicate value of Shah Jahan");
        System.out.println(l);
        int lastIndexOfDuplicate = l.lastIndexOf("Shah Jahan");
        System.out.println("last index of duplicate value : "+lastIndexOfDuplicate);
        l.remove("Shah Jahan");
        System.out.println(l);
    }
    
}
