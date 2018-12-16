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
public class TestConta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ContaCorrente conta = new ContaCorrente();
        conta.numero = "123456";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.saldo = -10;
        conta.valorEspecialUsado =0;
        
        System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo );
        
        boolean saqueEfetuado = conta.realizarSaque(500);
        
        if(saqueEfetuado){
            System.out.println("Saque efetuado com sucesso");
            conta.consultarSaldo();
        }else{
            System.out.println("Nao foi possivel realizar o saque saldo insuficiente");
        }
        
        System.out.println("Deposito de 500");
        conta.depositar(500);
        conta.consultarSaldo();
        
        if (conta.verificarUsoChecqueEspecial()){
            System.out.println("Esta usando cheque especial");   
        }else{
            System.out.println("Nao esta usando checque especial");
        }
        conta.realizarSaque(600);
        conta.consultarSaldo();
         if (conta.verificarUsoChecqueEspecial()){
            System.out.println("Esta usando cheque especial");   
        }else{
            System.out.println("Nao esta usando checque especial");
        }
    }   
    
    
}
