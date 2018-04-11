
import controle.ProdutosCadastrados;
import modelo.Hamburger;
import modelo.Refrigerante;
import solucao2.Pedido;
import modelo.Suco;
import solucao2.ItemPedido;


public class LanchoneteSolucao2 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        ProdutosCadastrados pCastrados = new ProdutosCadastrados();
        
        Pedido primeiroPedido = new Pedido();
        Hamburger hamburger = pCastrados.getBovinoHamburger();
        ItemPedido novoItem = new ItemPedido();
        novoItem.setProduto(hamburger);        
        //com o item fica registrar o preco da venda e não o do produto. 
        //se alterar o produto não altera o valor da venda.
        //alem disso podemos informar a quantidade de venda.
        novoItem.setPreco(hamburger.getValor()-2);//dando um desconto.
        novoItem.setQuantidade(2);
        primeiroPedido.adicionarItem(novoItem);        

        
        ItemPedido maisOutroItem = new ItemPedido();
        Refrigerante cocaCola = pCastrados.getCocacola();        
        maisOutroItem.setProduto(cocaCola);
        maisOutroItem.setQuantidade(2);
        maisOutroItem.setPreco(cocaCola.getValor());        
        primeiroPedido.adicionarItem(maisOutroItem);        
        primeiroPedido.listaProdutos();                                                
        
    }
    
}
