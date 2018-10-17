
package persistencia;

import java.util.List;
import modelo.Produto;


public interface IPersistencia {
    
        
    public void insereProduto(Produto produto);      
    public List recuperarTodos();
    
}
