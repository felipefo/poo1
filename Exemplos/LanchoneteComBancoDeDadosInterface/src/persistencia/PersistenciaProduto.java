package persistencia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import modelo.Bebida;
import modelo.Hamburguer;
import modelo.Produto;
import modelo.Refrigerante;
import modelo.Suco;


public class PersistenciaProduto {
   
    public static ArrayList readCSVFile() {
        String csvFile = ".\\produto.csv";
        String[] arrayLinhaCSV = null;
        BufferedReader br = null;
        String line = "";        
        ArrayList listaProdutos = new ArrayList();
        try {
            br = new BufferedReader(new FileReader(csvFile));                        
            while ((line = br.readLine()) != null) {                
                arrayLinhaCSV = line.split(";");//split quebra            
                
                if (arrayLinhaCSV[1].equalsIgnoreCase(Hamburguer.HAMBURGUER)){
                    Hamburguer hamburguer = new Hamburguer();
                    hamburguer.setCodigo(Integer.parseInt(arrayLinhaCSV[0]));
                    hamburguer.setDescricao(arrayLinhaCSV[2]);
                    hamburguer.setValor(Double.parseDouble(arrayLinhaCSV[3]));
                    hamburguer.setTipo(arrayLinhaCSV[4]);
                    listaProdutos.add(hamburguer);
                } else if (arrayLinhaCSV[1].equalsIgnoreCase("Refrigerante")){
                    Refrigerante refrigerante = new Refrigerante();
                    refrigerante.setCodigo(Integer.parseInt(arrayLinhaCSV[0]));
                    refrigerante.setDescricao(arrayLinhaCSV[2]);
                    refrigerante.setValor(Double.parseDouble(arrayLinhaCSV[3]));
                    refrigerante.setMarca(arrayLinhaCSV[4]);
                    refrigerante.setTamanho(arrayLinhaCSV[5]);
                    listaProdutos.add(refrigerante);
                }else if (arrayLinhaCSV[1].equalsIgnoreCase("Suco")){
                    Suco suco = new Suco();
                    suco.setCodigo(Integer.parseInt(arrayLinhaCSV[0]));
                    suco.setDescricao(arrayLinhaCSV[2]);
                    suco.setValor(Double.parseDouble(arrayLinhaCSV[3]));
                    suco.setSabor(arrayLinhaCSV[4]);
                    suco.setTamanho(arrayLinhaCSV[5]);
                    listaProdutos.add(suco);
                }
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
        return listaProdutos;
    }
    public static void saveProduto(Produto produto) {
        try {
            FileWriter writer = new FileWriter(".\\produto.csv", true);
            writer.append(produto.getCodigo()+";");
            if (produto instanceof Hamburguer){
                writer.append(Hamburguer.HAMBURGUER +";"+ produto.getDescricao());
                writer.append(";");
                writer.append(produto.getValor()+";");
                writer.append(((Hamburguer) produto).getTipo());
            }
            else if(produto instanceof Refrigerante){
                writer.append("Refrigerante"+";"+ produto.getDescricao());
                writer.append(";");
                writer.append(produto.getValor()+";");
                writer.append(((Refrigerante)produto).getMarca()+";");
                writer.append(((Bebida)produto).getTamanho());

            }
            else if(produto instanceof Suco) {
                writer.append("Suco"+";"+ produto.getDescricao());
                writer.append(";");
                writer.append(produto.getValor()+";");
                writer.append(((Suco)produto).getSabor()+";");
                writer.append(((Bebida)produto).getTamanho());
            }
         
            writer.append('\n');
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
 

    }
}
