package locacao.modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Locacao implements Serializable {
    private ArrayList<ItemLoacao> itens =
            new ArrayList<ItemLoacao>();
    public void adicionarItem(ItemLoacao itemPedido) {
        itens.add(itemPedido);
    }
    
    
    
    
    public void listaProdutos() {
        for (int index = 0; itens.size() > index; index++) {
            System.out.println("Descricao:" + itens.get(index).getProduto().getDescricao());
            System.out.println("Valor:" + itens.get(index).getValor());
            System.out.println("Dias:" + itens.get(index).getDias());
        }
    }
    public double totalProdutos() {
        double total = 0.0;
        for (int index = 0; itens.size() > index; index++) {
            total += itens.get(index).getTotal();
        }
        return total;
    }
    public ArrayList<ItemLoacao> getItens() {
        return itens;
    }  
}
