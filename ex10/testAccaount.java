/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex10;

/**
 *
 * @author crist
 */
public class testAccaount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BankAccount ac1 = new BankAccount();
        
        ac1.setNumber("321432");
        ac1.setAgency("4321");
        ac1.setBalance(-10);
        ac1.setSpecial(true);
        ac1.setSprecialLimit(500);
        
        System.out.println("The balance of Account "+ ac1.getNumber() + " = " + ac1.getBalance());
        
        ac1.deposit(1200);
        ac1.CalcDraft(500);
        ac1.deposit(300);
        ac1.getBalance();
        
    }
    
}
