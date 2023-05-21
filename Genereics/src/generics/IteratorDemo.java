
package generics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        
        for (int i = 1; i <= 10; i++) {
            myList.add(i);
        }
       // myList.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        myList.add(11);
        Iterator itr = myList.iterator();
        System.out.println("Iterating in forward direction : ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        
        }
    }
    

