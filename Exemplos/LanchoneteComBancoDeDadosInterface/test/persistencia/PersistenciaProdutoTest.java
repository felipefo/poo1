
package persistencia;

import java.io.FileReader;
import java.util.ArrayList;
import modelo.Produto;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2275103
 */
public class PersistenciaProdutoTest {
    
    PersistenciaProduto p;
    
    public PersistenciaProdutoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws Exception {
        Produto burger1 = new Produto("Hamburguer de carne de boi com tomate, alface, cream cheese, milho", 19.50,"Fabricação");
        Produto refri1 = new Produto("Coca-cola 600 ml",5, "Coca Cola");        
        PersistenciaProduto p  =  new PersistenciaProduto();        
        p.inserir(burger1);
        p.inserir(refri1);
    }
    
    @After
    public void tearDown() {
    }


    @Test
    public void testReadCSVFile() throws Exception {
        System.out.println("readCSVFile");
        ArrayList<Produto> produtos = (ArrayList<Produto>) p.recuperarTodos();       
        Produto produto = produtos.get(0);
        assertEquals("Hamburguer de carne de boi com tomate, alface, cream cheese, milho", produto.getDescricao());        
        
        for (int i  = 0; i< produtos.size() ; i++){            
            if (produtos.get(i) == null){
                fail ("produto nao salvo");
            }
        }
       
       
    }

    /**
     * Test of saveUsuario method, of class PersistenciaProduto.
     */
    
    
}
