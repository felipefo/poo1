
package cadastrousuario;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Listar {

    public void listarJOptionPane() {
        ArrayList listaUsuarios = ManipulaCSVUsuario.readCSVFile();
        for (int index = 0; index < listaUsuarios.size(); index++) {
            Usuario usuario = (Usuario) listaUsuarios.get(index);
            JOptionPane.showMessageDialog(null, usuario.imprimeUsuario());
        }
    }

    public void listarConsole() {
        ArrayList listaUsuarios = ManipulaCSVUsuario.readCSVFile();
        for (int index = 0; index < listaUsuarios.size(); index++) {
            Usuario usuario = (Usuario) listaUsuarios.get(index);
            System.out.println(usuario.imprimeUsuario());
        }
    }

}
