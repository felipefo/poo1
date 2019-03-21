
package banco;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author felip_kja6gpn
 */
public class PersistenciaArquivo {

    public void salvarConta(Conta conta) {

        FileWriter arq;
        try {
            arq = new FileWriter("C:\\Users\\felip_kja6gpn\\contas.txt");        
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.printf(conta.getNomeCliente() + "," +conta.getNumero()
                + ","+ conta.getAgencia()+","+ conta.getLimite() +"," + conta.getSaldo());        
            arq.close();                
        } catch (IOException ex) {
            Logger.getLogger(PersistenciaArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }

}
