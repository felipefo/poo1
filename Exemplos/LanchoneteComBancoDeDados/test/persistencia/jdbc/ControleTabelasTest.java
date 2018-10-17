
package persistencia.jdbc;

import java.sql.SQLException;
import java.util.List;
import modelo.Hamburguer;
import modelo.Produto;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ControleTabelasTest {
    
    public ControleTabelasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of criarTabelasBD method, of class ControleTabelas.
     */
    @Test
    public void testCriarTabelasBD() throws SQLException {
//        System.out.println("criarTabelasBD");
//        PersistenciaBD instance = new PersistenciaBD();
//        instance.criarTabelasBD(); 
        
        
        PersistenciaProduto persitencia = new PersistenciaProduto();
        
        Hamburguer produto = new Hamburguer();
        produto.setDescricao("teste");
        produto.setValor(222.00);
        persitencia.insereProduto(produto);
        
        List<Produto> lista = persitencia.recuperarTodos();
        
        for(Produto itemProduto : lista){
            System.out.println(itemProduto.getDescricao());
            System.out.println(itemProduto.getValor());
        }
        
    }
    
}
