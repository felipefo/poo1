/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.IOException;
import java.util.List;
import modelo.Hamburguer;
import modelo.ItemPedido;
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
        Hamburguer hamb = new Hamburguer("boi", "", 5, 0);
        ItemPedido item = new ItemPedido(0);
        item.setPreco(5);
        item.setProduto(hamb);
        item.setQuantidade(1);
        item.setAnotacao("Torrado");
        item.setCodPedido(0);
        PersistenciaItemPedido.saveItemPedido(item);
        
        
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testreadCSVFile() throws Exception {
        System.out.println("readCSVFile");
        List<ItemPedido> itens = PersistenciaItemPedido.readCSVFile();
        
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
