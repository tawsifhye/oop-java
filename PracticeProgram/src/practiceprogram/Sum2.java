
package practiceprogram;

import java.util.Scanner;


public class Sum2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int m; 
        System.out.print("Enter the first number: ");
        m=input.nextInt();
        System.out.print("Enter the last number: ");
        
        int n=input.nextInt();
        int sum = 0;
        for (int i = m; i <= n; i++) {
            if(i%2==1)
            sum = sum + i;
            
            
        }
        
        System.out.printf("Sum of %d to %d = %d\n", m,n,sum );
       
    }
    
}
