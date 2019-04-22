
package persistencia;

import persistencia.csv.PersistenciaItemPedido;
import java.io.IOException;
import java.util.List;
import modelo.ItemPedido;
import modelo.Produto;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class PersistenciaItemPedidoTest {
    
    public PersistenciaItemPedidoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws IOException {
        Produto hamb = new Produto("Hamburguer de boi", 5, "Fabricação própria");
        ItemPedido item = new ItemPedido(0);
        item.setPreco(hamb.getValor());
        item.setProduto(hamb);
        item.setQuantidade(1);
        item.setAnotacao("Torrado");
        item.setCodPedido(0);
        PersistenciaItemPedido persistenciaItemPedido  = new PersistenciaItemPedido();
        persistenciaItemPedido.inserir(item);                
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testreadCSVFile() throws Exception {
        System.out.println("readCSVFile");
        PersistenciaItemPedido p   =  new PersistenciaItemPedido();
        List<ItemPedido> itens = p.recuperarTodos();        
        if (itens.size() == 0) fail("sem itens");        
        ItemPedido item = itens.get(0);
        assertEquals(0, item.getCod());
        assertEquals("Torrado", item.getAnotacao());
        assertEquals(1, item.getQuantidade());
        assertEquals(5.0, item.getPreco(),1);
        assertEquals(0, item.getProduto().getCodigo());
        assertEquals(0, item.getCodPedido());

        
    }
    
}
