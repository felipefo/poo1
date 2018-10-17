/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import modelo.Bebida;
import modelo.Hamburguer;
import modelo.ItemPedido;
import modelo.Refrigerante;
import modelo.Suco;
import modelo.ItemPedido;
import modelo.Produto;

/**
 *
 * @author 2275103
 */
public class PersistenciaItemPedido {

    public static void saveItemPedido(ItemPedido item) throws IOException {
        FileWriter writer = null;
        try {
            writer = new FileWriter(".\\itempedido.csv", true);
            
            writer.append(item.getCod() + ";");
            writer.append(item.getAnotacao() + ";");
            writer.append(item.getQuantidade() + ";");
            writer.append(item.getPreco() + ";");
            writer.append(item.getProduto().getCodigo()+";");
            writer.append(item.getCodPedido()+"\n");
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            writer.close();
        }
    }

    public static ArrayList<ItemPedido> readCSVFile() throws FileNotFoundException {
        String csvFile = ".\\itempedido.csv";
        String[] arrayLinhaCSV = null;
        BufferedReader br = null;
        String line = "";
        ArrayList<ItemPedido> listaItemPedidos = new ArrayList();

        List<Produto> produtos = PersistenciaProduto.readCSVFile();
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                arrayLinhaCSV = line.split(";");
                
                int codItem = Integer.parseInt(arrayLinhaCSV[0]);
                ItemPedido item = new ItemPedido(codItem);

                Produto produto = null;
                int codProd = Integer.parseInt(arrayLinhaCSV[4]);
                for (Produto prod : produtos) {
                    if (prod.getCodigo() == codProd) {
                        produto = prod;
                        break;
                    }
                }

                
                item.setPreco(Double.parseDouble(arrayLinhaCSV[3]));
                item.setProduto(produto);
                item.setQuantidade(Integer.parseInt(arrayLinhaCSV[2]));
                item.setAnotacao(arrayLinhaCSV[1]);
                item.setCodPedido(Integer.parseInt(arrayLinhaCSV[5]));
                listaItemPedidos.add(item);
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
        return listaItemPedidos;
    }
}
