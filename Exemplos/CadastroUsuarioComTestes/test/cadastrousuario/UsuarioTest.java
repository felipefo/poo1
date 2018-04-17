
package cadastrousuario;

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
     * Verfica se o método vai disparar um uma exceção caso 
     * a senha não tenha pelo menos oito caracteres.
     */
    @Test
    public void testValidaSenhaUsuario() {
        System.out.println("Senha menor que oito caracteres");
        Usuario instance = new Usuario();
        try {        
            instance.setSenha("100");
        } catch (Exception ex) {
            assertEquals("A senha deve ser maior que 8", ex.getMessage());
        }
    }
    /**
     * Verifica se o método não vai dar esse se a senha for maior que 
     * oito caracteres.      
     */
    @Test
    public void testSetSenha()  {
        System.out.println("Senha maior que oito caracteres");
        Usuario instance = new Usuario();
        try {
            instance.setSenha("222222229999");
        } catch (Exception ex) {
            fail(ex.getMessage());
        }
       
    }
    
}
