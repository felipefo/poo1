package cadastrousuario;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class ManipulaCSVUsuario {
   
    public static ArrayList readCSVFile() {
        String csvFile = ".\\file.csv";
        String[] arrayLinhaCSV = null;
        BufferedReader br = null;
        String line = "";        
        ArrayList listaUsuarios = new ArrayList();
        try {
            br = new BufferedReader(new FileReader(csvFile));                        
            while ((line = br.readLine()) != null) {                
                arrayLinhaCSV = line.split(",");//split quebra            
                Usuario usuario = new Usuario();
                usuario.nomeCompleto = arrayLinhaCSV[0];
                usuario.login = arrayLinhaCSV[1];
                usuario.senha = arrayLinhaCSV[2];         
                listaUsuarios.add(usuario);
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
    public static void saveUsuario(Usuario usuario) {
        try {
            FileWriter writer = new FileWriter(".\\file.csv", true);
            writer.append(usuario.nomeCompleto);                        
            writer.append(',');            
            writer.append(usuario.login);
            writer.append(',');            
            writer.append(usuario.senha);
            writer.append('\n');
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
