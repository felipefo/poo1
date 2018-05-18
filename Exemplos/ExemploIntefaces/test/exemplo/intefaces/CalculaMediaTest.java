
package exemplo.intefaces;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculaMediaTest {
    
    public CalculaMediaTest() {
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
     * Test of media method, of class CalculaMedia.
     */
    @Test
    public void testMedia() {
        System.out.println("testado a media");
        List<Integer> lista = new ArrayList();
        lista.add(10);
        lista.add(8);        
        CalculaMedia instance = new CalculaMedia();
        double expResult = 9.0;
        double result = instance.calcula(lista);
        assertEquals(expResult, result, 1);                
    }
    
}
