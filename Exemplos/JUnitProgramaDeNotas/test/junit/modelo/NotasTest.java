
package junit.modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class NotasTest {
    
    public NotasTest() {
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
     * Test of addNotas method, of class Notas.
     */
    @Test
    public void testAddNotas() {
        System.out.println("addNotas");
        Notas instance = new Notas();
        instance.addNotas(4);
        instance.addNotas(4);
        instance.addNotas(5);
        instance.addNotas(3);
        instance.addNotas(4);
        double media  = 4.0;
        assertEquals( media , instance.calculaMedia(), 1);        
    }
    @Test
    public void testCalculaMedia() {
        System.out.println("calculaMedia");
        Notas instance = new Notas();
        double expResult = 0.0;
        instance.addNotas(0);        
        instance.addNotas(0);
        double result = instance.calculaMedia();
        assertEquals(expResult, result, 1);                
    }
    
}
