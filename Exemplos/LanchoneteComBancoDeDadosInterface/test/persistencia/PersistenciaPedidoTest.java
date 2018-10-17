/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.ArrayList;
import modelo.Pedido;
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
public class PersistenciaPedidoTest {
    
    public PersistenciaPedidoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Pedido pedido = new Pedido(0);
        PersistenciaPedido.savePedido(pedido);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of readCSVFile method, of class PersistenciaPedido.
     */
    @Test
    public void testReadCSVFile() throws Exception {
        System.out.println("readCSVFile");
        ArrayList<Pedido> result = PersistenciaPedido.readCSVFile();
        Pedido pedido = result.get(0);
        assertEquals(0, pedido.getCod());
        assertEquals(pedido.getItens().get(0).getCod(), 0);
    }
    
}
