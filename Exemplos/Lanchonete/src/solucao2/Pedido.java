
package solucao2;


public class Pedido {
    
    ItemPedido[] itens = new ItemPedido[5];    
    int index = 0;
    
    public void adicionarItem(ItemPedido itemPedido){
        itens[index] = itemPedido;
        index++;        
    }
    
    public void listaProdutos(){
        double total = 0.0;
        for(int index=0; itens.length > index; index++){            
            if(itens[index]==null) break;
            System.out.println("Descricao:" + itens[index].getProduto().getDescricao());
            System.out.println("Valor:"  + itens[index].getPreco());
            total += itens[index].getPreco()* itens[index].getQuantidade();                        
        } 
        System.out.println("Total:" + total);
    }
}
