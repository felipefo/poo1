
package persistencia;

import modelo.Produto;

public interface IPersistenciaProduto extends IPersistencia {
        
    public void inserir(Produto produto) throws Exception;      
    
}
