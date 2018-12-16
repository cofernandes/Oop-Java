
package ex06;

/**
 *
 * @author crist
 */
public class BankAcount {
    
    int acount;
    double balance;
    boolean special;
    double limit;
    
    void Important(){
        
        special = true;
    }
    void Normal(){
        
        special = false;
    }
    
    void showSpecial(){
        if(balance > 15000){
            System.out.println("***You have a Special bank Account***");
        }else{
            System.out.println("*** You've got a nomal Bank Account");
        }
    }
    double CalcDraft(double draft){
        if(balance > draft){
           double qtdBalance = balance - draft;
           System.out.println("Your new balance is $ " + qtdBalance);
           return qtdBalance;
           
        }else{
            System.out.println("You do not have balance enogh for this operation");
        }
        return 0;
        
    }
    
    double deposit (double lodge){
        
        double qtdDeposit = lodge + balance;
        System.out.println("With this deposit your new balance is £ " + qtdDeposit);
        
        return qtdDeposit;
    }
    
}
