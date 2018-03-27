/*
    Criação de um objeto conta
    Utilização do JOptionPane 
    Conversão de uma String em um inteiro 
    Conversão de uma String em um double
    Utilização de métodos 
    Utilização de atibutos        
*/

package banco;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
           
        String numConta = JOptionPane.showInputDialog("Digite o numero da conta");        
        String numAgencia  = JOptionPane.showInputDialog("Digite a agência");
        String nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente");
        String limiteInicial = JOptionPane.showInputDialog("Digite o limite"); 
        String saldoInicial = JOptionPane.showInputDialog("Digite saldo");                 
        
        Conta contaCliente = new  Conta(numConta,nomeCliente, saldoInicial,limiteInicial,numAgencia);                        
        contaCliente.imprimirSaldo();
        
    }
    
}
