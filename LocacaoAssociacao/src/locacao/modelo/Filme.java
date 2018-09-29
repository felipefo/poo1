
package locacao.modelo;

import java.io.Serializable;

public class Filme implements Serializable {
    
    private String descricao;
    private float valor;    
    
    public Filme(String descricao, float valor) {
        this.descricao = descricao;
        this.valor = valor;        
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        if(valor>0){
            this.valor = valor;    
        }        
    }
 
    
    
}
