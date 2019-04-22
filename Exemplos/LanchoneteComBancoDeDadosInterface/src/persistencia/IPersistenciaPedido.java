
package persistencia;

import modelo.Pedido;

public interface IPersistenciaPedido extends IPersistencia{
           
    public void inserir(Pedido pedido) throws Exception;      
    
}
