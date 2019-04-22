
package persistencia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import modelo.ItemPedido;
import modelo.Produto;


public class PersistenciaItemPedido implements IPersistenciaItemPedido{

    public void inserir(ItemPedido item) throws IOException {
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

    public ArrayList<ItemPedido> recuperarTodos() throws FileNotFoundException, Exception {
        String csvFile = ".\\itempedido.csv";
        String[] arrayLinhaCSV = null;
        BufferedReader br = null;
        String line = "";
        ArrayList<ItemPedido> listaItemPedidos = new ArrayList();

        PersistenciaProduto persistenciaProduto = new PersistenciaProduto();        
        List<Produto> produtos = persistenciaProduto.recuperarTodos();
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
