/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex07;

/**
 *
 * @author crist
 */
public class ContaCorrente {
    
    String numero;
    String agencia;
    double limiteEspecial;
    double saldo;
    boolean especial;
    double valorEspecialUsado;
    
    boolean realizarSaque(double quantiaASacar){
        
        if(saldo>= quantiaASacar){
            saldo -= quantiaASacar;
            return true;
        }else {
            if(especial);
            double limite = limiteEspecial + saldo;
            if(limite >= quantiaASacar){
                saldo -=quantiaASacar;
                return true;
            }else{
                return false;
            }
            
        }
        
               
    }
    
    void depositar(double valorDepositado){
        saldo += valorDepositado;
    }
    
    void consultarSaldo(){
        System.out.println("Saldo atual da conta = " + saldo);
    }
    
    boolean verificarUsoChecqueEspecial(){
        return saldo <0;
    }
    
}
