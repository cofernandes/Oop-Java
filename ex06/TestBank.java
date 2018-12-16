
package ex06;

/**
 *
 * @author crist
 */
public class TestBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BankAcount N1 = new BankAcount();
        N1.acount = 324123;
        N1.balance = 12000;
        N1.limit = 1000;
        N1.special = false;
        
        BankAcount N2 = new BankAcount();
        N2.acount = 976589;
        N2.balance = 22000;
        N2.limit = 0;
        N2.special = true;
        
        
        System.out.println("Account Number : " + N1.acount);
        System.out.println("Your Balance is $ " + N1.balance);
        N1.showSpecial();
        
        double qtdBalance50 = N1.CalcDraft(50);
        double qtdBalance15 = N1.CalcDraft(1500);
        double qtdBalance20 = N1.CalcDraft(20000);
        
        double qtdDeposit100 = N1.deposit(100);
        
                
              
    }
    
}
