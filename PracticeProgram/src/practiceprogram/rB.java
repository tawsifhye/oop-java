
package practiceprogram;

import java.util.Scanner;


public class rB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int t=1,d,n;
        n=input.nextInt();
        d=input.nextInt();
        for (int i = 1; i < d; i++) {
            n=n*2;
        }
        System.out.println(n);
        
        
    }
    
}
