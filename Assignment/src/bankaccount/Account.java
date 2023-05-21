
package bankaccount;

public class Account {
    double accountbalance;
    
    Account(double accountbalance){
        this.accountbalance = accountbalance;
        
        if(accountbalance<0){
            this.accountbalance = 0;
            System.out.println("Invalid balance");
            
            
        }
    }
}
