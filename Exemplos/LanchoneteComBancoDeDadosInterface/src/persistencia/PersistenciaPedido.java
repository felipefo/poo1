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
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Bebida;
import modelo.Hamburguer;
import modelo.ItemPedido;
import modelo.Pedido;
import modelo.Refrigerante;
import modelo.Suco;

/**
 *
 * @author 2275103
 */
public class PersistenciaPedido {

    public static void savePedido(Pedido pedido) {
        try {
            FileWriter writer = new FileWriter(".\\pedido.csv", true);

            writer.append(pedido.getCod()+"\n");
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
    public static ArrayList<Pedido> readCSVFile() throws IOException{
        
        BufferedReader br = null;
        FileReader fr = null;
        ArrayList<Pedido> pedidos = new ArrayList<>();
        ArrayList<ItemPedido> itens = PersistenciaItemPedido.readCSVFile();
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
                    
                    if (item.getCodPedido() == codigo)
                        pedido.adicionarItem(item);
                }
                
                pedidos.add(pedido);
            }
        }
        
        catch (FileNotFoundException ex) {
            Logger.getLogger(PersistenciaPedido.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return pedidos;
    }
}
