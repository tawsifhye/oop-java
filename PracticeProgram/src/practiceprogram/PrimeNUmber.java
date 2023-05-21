
package practiceprogram;

import java.util.Scanner;


public class PrimeNUmber {
    public static void main(String[] args) {
        int a,b,flag=0, prime=0;
        Scanner input = new Scanner (System.in);
        System.out.print("Enter first number: ");
        a = input.nextInt();
        
        
            
        System.out.print("Enter last number: ");
         
        b = input.nextInt();
        
        
        for (int i = a; i <= b; i++) {
            if (a==1 || a==0){
            System.out.println("Not Possible");        
                  break;   
            }
               
            flag = 0;
            for (int j = 2; j <= i-1; j++) {
                if(i%j==0){
                    flag++; 
                    break;
                }
                
            }
            
            if(flag == 0)
            {System.out.println(i+" is a prime number");
            prime++;
            
            }
            
                
            else
                System.out.println(i+" is not a prime number");
            
        }
        
        System.out.println("Total prime numbers: "+prime);
                
    }
}
