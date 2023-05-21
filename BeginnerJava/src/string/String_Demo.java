
package string;

import java.util.Scanner;

public class String_Demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("Equals");
        }
        else{
            System.out.println("Not equals");
        }
        
        if(s1.contains(s2)){
            System.out.println("Contains");
        }
        else{
            System.out.println("Not contains");
    }
        System.out.println(s1.isEmpty());
        
}
    
}

