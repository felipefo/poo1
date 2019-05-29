
package socket;

import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Date;

import javax.swing.JOptionPane;


public class ClienteTCPBasico {

  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try {
      Socket cliente = new Socket("127.0.0.1" ,12345);
      ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
      Date data_atual = (Date)entrada.readObject();//lendo a data do ServidorTCPBasico
      JOptionPane.showMessageDialog(null,"Data recebida do servidor:" + data_atual.toString());
      entrada.close();
      System.out.println("Conexão encerrada");
    }
    catch(Exception e) {
      System.out.println("Erro: " + e.getMessage());
      e.printStackTrace();
    }
  }                
}
