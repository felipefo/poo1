
package modelo;

import java.io.Serializable;


public abstract class Produto  implements Serializable {
    
    private String descricao;
    private double valor;
    private int codigo;
    public Produto(){
    
    }
    
    public Produto(String descricao, double valor,int codigo) {
        this.descricao = descricao;
        this.valor = valor;
        this.codigo = codigo;
    }
    
    

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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    
}
