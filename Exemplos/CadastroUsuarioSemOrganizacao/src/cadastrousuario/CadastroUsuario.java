
package cadastrousuario;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class CadastroUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        
        
        String opcao = JOptionPane.showInputDialog("Escolha a opção"
                + "\n(1)criar usuário"
                + "\n(2)listar usuário JOptionPane"
                + "\n(3)listar usuário Console\n");

        int opcaoEscolhida = Integer.parseInt(opcao);
        if (opcaoEscolhida == 1) {
            String nomeCompleto = JOptionPane.showInputDialog("Nome completo:");
            String login = JOptionPane.showInputDialog("Login:");
            String senha = JOptionPane.showInputDialog("Senha:");
            while(senha.length() < 8){
                senha = JOptionPane.showInputDialog("Senha:");
                if(senha.length() < 8){
                    JOptionPane.showMessageDialog(null, "A senha deve ter mais de 8 caracteres");
                }
            }
            saveUsuario(nomeCompleto, login, senha);
        } else if (opcaoEscolhida == 2) {
            ArrayList listaUsuarios = readCSVFile();
            for (int index = 0; index < listaUsuarios.size(); index++) {
                String linha = (String) listaUsuarios.get(index);
                String arrayLinhas[] = linha.split(",");
                JOptionPane.showMessageDialog(null, "Nome:" + arrayLinhas[0]
                        + "\n Login:" + arrayLinhas[1] + "\n senha:" + arrayLinhas[2]);
            }
        } else if (opcaoEscolhida == 3) {
            ArrayList listaUsuarios = readCSVFile();
            for (int index = 0; index < listaUsuarios.size(); index++) {
                String linha = (String) listaUsuarios.get(index);
                String arrayLinhas[] = linha.split(",");
                System.out.println("Nome:" + arrayLinhas[0]
                        + "\n Login:" + arrayLinhas[1] + "\n senha:" + arrayLinhas[2]);
            }
        }
    }

    public static ArrayList readCSVFile() {
        String csvFile = ".\\file.csv";
        BufferedReader br = null;
        String line = "";

        ArrayList listaUsuarios = new ArrayList();
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                listaUsuarios.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return listaUsuarios;
    }

    public static void saveUsuario(String nomeCompleto, String login, String senha) {
        try {
            FileWriter writer = new FileWriter(".\\file.csv", true);
            writer.append(nomeCompleto);
            writer.append(',');
            writer.append(login);
            writer.append(',');
            writer.append(senha);
            writer.append('\n');
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
