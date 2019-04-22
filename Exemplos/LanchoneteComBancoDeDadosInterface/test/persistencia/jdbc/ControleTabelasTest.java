
package persistencia.jdbc;

import java.sql.SQLException;
import java.util.List;
import modelo.Produto;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


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

    @Test
    public void testCriarTabelasBD() throws SQLException {
//      System.out.println("criarTabelasBD");
//      PersistenciaBD instance = new PersistenciaBD();
//      instance.criarTabelasBD();                 
        PersistenciaProduto persitencia = new PersistenciaProduto();        
        Produto produto = new Produto();
        produto.setDescricao("teste");
        produto.setValor(222.00);
        persitencia.inserir(produto);        
        List<Produto> lista = persitencia.recuperarTodos();        
        for(Produto itemProduto : lista){
            System.out.println(itemProduto.getDescricao());
            System.out.println(itemProduto.getValor());
        }
        
    }
    
}
