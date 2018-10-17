
import controle.ProdutosCadastrados;
import solucao1.Pedido;
import modelo.Suco;


public class LanchoneteSolucao1 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        ProdutosCadastrados pCastrados = new ProdutosCadastrados();
        
        
        Pedido primeiroPedido = new Pedido();
        primeiroPedido.adicionarProduto(pCastrados.getBovinoHamburger());
        primeiroPedido.adicionarProduto(pCastrados.getCocacola());
        Suco sucoLaranga  =pCastrados.getSucoLaranja();
        //alterando as informaçoes do produto cadastrado.
        sucoLaranga.setComGelo(true);
        sucoLaranga.setComAcucar(false);
        sucoLaranga.setValor(3.5);                
        primeiroPedido.adicionarProduto(sucoLaranga);
        primeiroPedido.adicionarProduto(pCastrados.getFrangoHamburger());        
        primeiroPedido.listaProdutos();
        
        
        Pedido segundoPedido = new Pedido();
        segundoPedido.adicionarProduto(pCastrados.getBovinoHamburger());
        segundoPedido.adicionarProduto(pCastrados.getCocacola());
        Suco sucoLaranga1  = pCastrados.getSucoLaranja();
        //alterando as informaçoes do produto cadastrado.
        sucoLaranga1.setComGelo(true);
        sucoLaranga1.setComAcucar(true);        
        segundoPedido.adicionarProduto(sucoLaranga1);
        segundoPedido.adicionarProduto(pCastrados.getFrangoHamburger());        
        segundoPedido.listaProdutos();
        
        
        
        
        
    }
    
}
