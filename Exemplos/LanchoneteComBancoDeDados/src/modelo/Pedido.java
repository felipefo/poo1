
package modelo;

import java.util.ArrayList;
import modelo.ItemPedido;


public class Pedido {
    
    private ArrayList<ItemPedido> itens = new ArrayList<ItemPedido>();    
    private int cod;

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
    
    public double totalProdutos(){
        double total = 0.0;
        for(int index=0; itens.size() > index; index++){            
            total += itens.get(index).getPreco()* itens.get(index).getQuantidade();                        
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
