
package practiceprogram;

import java.util.Scanner;


public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int temp = n;
        int sum=0;
        while(temp != 0){
            int r = temp%10;
            sum=sum+r;
            temp=temp/10;
            
        }
        System.out.println("Sum of digits is: "+sum);
    }
    
}
