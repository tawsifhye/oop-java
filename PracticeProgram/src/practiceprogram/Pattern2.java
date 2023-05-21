
package practiceprogram;

import java.util.Scanner;


public class Pattern2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        for (int raw = n; raw >= 1; raw--) {
            for (int col = 1; col <= raw; col++) {
                System.out.print(" "+col);
               
            }
            System.out.println();
        }
    }
    
}
