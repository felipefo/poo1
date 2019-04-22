
package modelo;

import modelo.Produto;


public class ItemPedido {
    
    private int quantidade;
    private double preco; //preco unitário (ou com promoção)
    private Produto produto;
    private String anotacao;
    private int cod;
    private int codPedido;

    public ItemPedido(int cod) {
        this.cod = cod;
    }

    public int getCod() {
        return cod;
    }
    
    

    public String getAnotacao() {
        return anotacao;
    }

    public void setAnotacao(String anotacao) {
        this.anotacao = anotacao;
    }
    
    

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(int codPedido) {
        this.codPedido = codPedido;
    }
    
    public double valorTotalItem(){
        return this.getPreco()*this.getQuantidade();        
    }
    
    
    
}
