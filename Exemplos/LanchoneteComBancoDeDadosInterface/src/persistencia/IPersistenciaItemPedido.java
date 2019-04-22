
package persistencia;

import modelo.ItemPedido;

public interface IPersistenciaItemPedido extends IPersistencia {
    
        public void inserir(ItemPedido  itemPedido) throws Exception;      

    
}
