package persistencia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import modelo.Categoria;
;
import modelo.Produto;



public class PersistenciaProduto implements IPersistenciaProduto {

    @Override
    public List recuperarTodos() throws Exception {
        String csvFile = ".\\produto.csv";
        String[] arrayLinhaCSV = null;
        BufferedReader br = null;
        String line = "";
        ArrayList listaProdutos = new ArrayList();
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                arrayLinhaCSV = line.split(";");//split quebra            
                Produto produto = new Produto();
                produto.setCodigo(Integer.parseInt(arrayLinhaCSV[0]));
                produto.setDescricao(arrayLinhaCSV[1]);
                produto.setValor(Double.parseDouble(arrayLinhaCSV[2]));
                produto.setMarca(arrayLinhaCSV[3]);
                produto.setCategoria(new Categoria(arrayLinhaCSV[4]));
                listaProdutos.add(produto);
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
                    throw new Exception("Não foi possivel recuperar os registros.");
                }
            }
        }
        return listaProdutos;
    }

    public void inserir(Produto produto) throws Exception {
        try {
            FileWriter writer = new FileWriter(".\\produto.csv", true);
            writer.append(produto.getCodigo() + ";");
            writer.append(produto.getCodigo() + ";" + produto.getDescricao());
            writer.append(produto.getValor() + ";" + produto.getMarca());
            writer.append(produto.getCategoria());
            writer.append(";");
            writer.append('\n');
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new Exception("Não foi possivel salvar o produto.");
        }
    }
}
