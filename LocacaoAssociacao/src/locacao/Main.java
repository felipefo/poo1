
package locacao;

import java.beans.PersistenceDelegate;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import locacao.modelo.ItemLoacao;
import locacao.modelo.Locacao;
import locacao.modelo.Filme;
import locacao.modelo.persistencia.PersistenciaSerializada;


public class Main {

    public static void main(String[] args) {
        
        try {
            Locacao novoPedido = new Locacao();
            Filme novoFilme = new Filme("A volta dos que não foram", 4.5f);
            
            ItemLoacao novoItem1 = new ItemLoacao();
            novoItem1.setProduto(novoFilme);
            novoItem1.setValor(novoFilme.getValor());
            novoItem1.setDias(1);
            novoPedido.adicionarItem(novoItem1);
            
            Filme novoFilme2 = new Filme("Pueira em alto mar", 3.00f);
            
            ItemLoacao novoItem2 = new ItemLoacao();
            novoItem2.setProduto(novoFilme2);
            novoItem2.setValor(novoFilme2.getValor());
            novoItem2.setDias(4);
            novoPedido.adicionarItem(novoItem2);
            
            novoPedido.listaProdutos();
            
            PersistenciaSerializada persistencia = new PersistenciaSerializada();
            persistencia.salvarObjeto(novoPedido);
            
            Locacao locacaoRecuperada = (Locacao) persistencia.recuperarObjeto(Locacao.class);
            
            locacaoRecuperada.listaProdutos();
            
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
