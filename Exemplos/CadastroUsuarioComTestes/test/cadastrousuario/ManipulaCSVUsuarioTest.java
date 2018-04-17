
package cadastrousuario;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ManipulaCSVUsuarioTest {
    
    public ManipulaCSVUsuarioTest() {
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
     * Verificar existe um usuario salvo no arquivo
     */
    @Test
    public void testReadCSVFile() {
        System.out.println("readCSVFile");        
        ArrayList result = ManipulaCSVUsuario.readCSVFile();
        Usuario user = (Usuario) result.get(result.size()-1);
        assertEquals(user.nomeCompleto, "felipe");                        
        assertEquals(user.login, "felipe");                        
        assertEquals(user.senha, "100000000");                        
    }

    /**
     * Verifica se um usuario foi salvo no arquivo
     */
    @Test
    public void testSaveUsuario() {
        System.out.println("saveUsuario");
        Usuario usuario = new Usuario();
        try {
            usuario.setSenha("100000000");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        usuario.nomeCompleto = "felipe";
        usuario.login = "felipe";
        ManipulaCSVUsuario.saveUsuario(usuario);
        //completar o testes....
    }
    
}
