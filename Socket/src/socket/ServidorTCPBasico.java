
package socket;

import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.util.Date;

public class ServidorTCPBasico {
  public static void main(String[] args) {
    try {
      // Instancia o ServerSocket ouvindo a porta 12345
      ServerSocket servidor = new ServerSocket(12345);
      System.out.println("Servidor ouvindo a porta 12345");
      while(true) {
        // o método accept() bloqueia a execução até que
        // o servidor receba um pedido de conexão
        java.net.Socket cliente = servidor.accept();
        System.out.println("Cliente conectado: " + cliente.getInetAddress().getHostAddress());
        ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
        saida.flush();
        saida.writeObject(new Date());//enviando uma data.
        saida.close();
        cliente.close();
      }  
    }   
    catch(Exception e) {
       System.out.println("Erro: " + e.getMessage());
    }
    
  }     
}