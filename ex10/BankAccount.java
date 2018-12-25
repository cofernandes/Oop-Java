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
public class BankAccount {
    
    private String number;
    private String agency;
    private boolean special;
    private double sprecialLimit;
    private double balance;
    

    public BankAccount() {
    }
    
    

    public BankAccount(String number, String agency, boolean special, double sprecialLimit, double balance) {
        this.number = number;
        this.agency = agency;
        this.special = special;
        this.sprecialLimit = sprecialLimit;
        this.balance = balance;
    }

    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @return the agency
     */
    public String getAgency() {
        return agency;
    }

    /**
     * @param agency the agency to set
     */
    public void setAgency(String agency) {
        this.agency = agency;
    }

    /**
     * @return the special
     */
    public boolean isSpecial() {
        return special;
    }

    /**
     * @param special the special to set
     */
    public void setSpecial(boolean special) {
        this.special = special;
    }

    /**
     * @return the sprecialLimit
     */
    public double getSprecialLimit() {
        return sprecialLimit;
    }

    /**
     * @param sprecialLimit the sprecialLimit to set
     */
    public void setSprecialLimit(double sprecialLimit) {
        this.sprecialLimit = sprecialLimit;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
     public void showSpecial(){
        if(balance > 15000){
            System.out.println("***You have a Special bank Account***");
        }else{
            System.out.println("*** You've got a nomal Bank Account");
        }
    }
   public double CalcDraft(double draft){
        if(balance > draft){
           double qtdBalance = balance - draft;
           System.out.println("Your new balance is $ " + qtdBalance);
           return qtdBalance;
           
        }else{
            System.out.println("You do not have balance enogh for this operation");
        }
        return 0;
        
    }
    
   public double deposit (double qtdDeposit){
        
        balance += qtdDeposit;
        System.out.println("With this deposit your new balance is £ " + balance);
        
        return qtdDeposit;
    }
   
   public void checkBalance(){
       System.out.println("Your actual balance is = " + balance);
   }
    
    
    
}
