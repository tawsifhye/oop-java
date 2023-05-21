
package practiceprogram;

import java.util.Scanner;


public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int temp = n;
        int sum=0;
        while(temp != 0){
            int r = temp%10;
            sum=sum+r*r*r;
            temp=temp/10;
            
        }
        if(n==sum)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
    
}
