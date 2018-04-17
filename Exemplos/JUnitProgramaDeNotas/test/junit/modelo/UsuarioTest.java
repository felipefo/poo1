
package junit.modelo;

import junit.modelo.Usuario;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class UsuarioTest {
    
    public UsuarioTest() {
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
     * Test of calcularIdade method, of class Usuario.
     */
    @Test
    public void testCalcularIdade() {        
        calculaIdadade(0);
        calculaIdadade(5);
        calculaIdadade(6);
        calculaIdadade(10);        
    }
    
    private void calculaIdadade(int anos){        
        System.out.println("calcularIdade mudando ano em:" +  anos);
        Usuario instance = new Usuario();        
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, -anos);
        instance.setDtNascimento(calendar.getTime());
        int expResult = anos;
        int result = instance.calcularIdade();
        assertEquals(expResult, result);                
    }

    @Test
    public void testSetSenha(){        
        setSenhaInvalida("1234");        
        setSenhaInvalida("aaaa");        
        setSenhaInvalida("ffffffffffffffffffffffffffffffffffffffffff");                
    }
    
    private void setSenhaInvalida(String senha){        
        Usuario instance = new Usuario();  
        try {                      
            instance.setSenha(senha);                        
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        assertEquals(null, instance.getSenha());
    }

    
}
