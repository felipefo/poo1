
package modelo;

import java.util.ArrayList;
import java.util.Date;
import modelo.ItemPedido;

public class Pedido {
    
    private ArrayList<ItemPedido> itens = new ArrayList<ItemPedido>();    
    private int cod;
    private Date dataPedido;

    public Pedido(int cod) {
        this.cod = cod;
    }
    
    public void adicionarItem(ItemPedido itemPedido){
        itens.add(itemPedido);
    }
    
    public void listaProdutos(){
        for(int index=0; itens.size() > index; index++){            
            System.out.println("Descricao:" + itens.get(index).getProduto().getDescricao());
            System.out.println("Valor:"  + itens.get(index).getPreco());
        } 
    }
    
    public double valorTotal(){
        double total = 0.0;
        for(int index=0; itens.size() > index; index++){            
            total += ((ItemPedido)itens.get(index)).valorTotalItem();
        } 
        return total;
    }

    public ArrayList<ItemPedido> getItens() {
        return itens;
    }

    public int getCod() {
        return cod;
    }
    
    
    
}
