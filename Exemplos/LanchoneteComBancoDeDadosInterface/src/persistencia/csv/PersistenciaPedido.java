package persistencia.csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import modelo.ItemPedido;
import modelo.Pedido;
import persistencia.IPersistenciaPedido;

public class PersistenciaPedido implements IPersistenciaPedido {

    public void inserir(Pedido pedido) {
        try {
            FileWriter writer = new FileWriter(".\\pedido.csv", true);
            writer.append(pedido.getCod() + "\n");
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Pedido> recuperarTodos() throws IOException, Exception {

        BufferedReader br = null;
        FileReader fr = null;
        ArrayList<Pedido> pedidos = new ArrayList<>();

        PersistenciaItemPedido persistenciaItemPedido = new PersistenciaItemPedido();
        ArrayList<ItemPedido> itens = persistenciaItemPedido.recuperarTodos();
        Pedido pedido = null;

        try {
            fr = new FileReader(".\\pedido.csv");
            br = new BufferedReader(fr);
            String linha;
            int codigo;

            while ((linha = br.readLine()) != null) {
                codigo = Integer.parseInt(linha.trim());
                pedido = new Pedido(codigo);

                for (ItemPedido item : itens) {

                    if (item.getCodPedido() == codigo) {
                        pedido.adicionarItem(item);
                    }
                }
                pedidos.add(pedido);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return pedidos;
    }
}
