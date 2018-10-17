
package persistencia;

import java.io.FileReader;
import java.util.ArrayList;
import modelo.Hamburguer;
import modelo.Produto;
import modelo.Refrigerante;
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
    
    public PersistenciaProdutoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Hamburguer burger1 = new Hamburguer("boi", "carne bovina, tomate, alface, cream cheese, milho", 19.50,0);
        Refrigerante refri1 = new Refrigerante("600 ml", "", 5, "Coca Cola",1);
        
        
        
        PersistenciaProduto.saveProduto(burger1);
        PersistenciaProduto.saveProduto(refri1);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of readCSVFile method, of class PersistenciaProduto.
     */
    @Test
    public void testReadCSVFile() {
        System.out.println("readCSVFile");
        ArrayList<Produto> produtos = PersistenciaProduto.readCSVFile();       
        Produto produto = produtos.get(0);
        assertEquals("carne bovina, tomate, alface, cream cheese, milho", produto.getDescricao());        
        
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
