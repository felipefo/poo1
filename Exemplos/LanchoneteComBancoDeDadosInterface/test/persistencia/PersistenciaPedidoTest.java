package persistencia;

import java.util.ArrayList;
import modelo.Pedido;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersistenciaPedidoTest {

    PersistenciaPedido p;

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
        p = new PersistenciaPedido();
        Pedido pedido = new Pedido(0);
        p.inserir(pedido);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testReadCSVFile() throws Exception {
        System.out.println("readCSVFile");
        ArrayList<Pedido> result = (ArrayList<Pedido>) p.recuperarTodos();
        Pedido pedido = result.get(0);
        assertEquals(0, pedido.getCod());
        assertEquals(pedido.getItens().get(0).getCod(), 0);
    }

}
