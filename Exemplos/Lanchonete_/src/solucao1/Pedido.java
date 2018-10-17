
package solucao1;

import modelo.Produto;


public class Pedido {
    
    Produto[] listaProdutos = new Produto[5];    
    int index = 0;
    
    public void adicionarProduto(Produto produto){
        listaProdutos[index] = produto;
        index++;        
    }
    
    public void listaProdutos(){
        double total = 0.0;
        for(int index=0; listaProdutos.length > index; index++){            
            if(listaProdutos[index]==null) break;
            System.out.println("Descricao:" + listaProdutos[index].getDescricao());
            System.out.println("Valor:"  + listaProdutos[index].getValor());
            total += listaProdutos[index].getValor();                        
        } 
        System.out.println("Total:" + total);
    }
}
