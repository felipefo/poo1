
package modelo;

import java.io.Serializable;


public class Produto  implements Serializable {
    
    private String descricao;
    private double valor;

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        if(valor>0){
            this.valor = valor;    
        }        
    }

    
    
}
