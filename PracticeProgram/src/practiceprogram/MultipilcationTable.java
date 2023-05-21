
package practiceprogram;

import java.util.Scanner;


public class MultipilcationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        double n = input.nextDouble();
        double result;
        for (int i = 1; i <= 10; i++) {
            result = n*i;
            System.out.println(n+"X"+i+"= "+result);
            
            
            
        }
    }
    
}
