
package locacao.modelo;

import java.io.Serializable;

public class ItemLoacao implements Serializable {

    private float valor;
    private int dias;
    private Filme produto;
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public int getDias() {
        return dias;
    }
    public void setDias(int dias) {
        this.dias = dias;
    }
    public Filme getProduto() {
        return produto;
    }
    public void setProduto(Filme produto) {
        this.produto = produto;
    }
    
    public float getTotal(){
        return this.dias * this.valor;
    }
}
