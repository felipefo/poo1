
package modelo;


public class Hamburguer extends Produto {
    private String tipo;
    
    public static final String HAMBURGUER = "Hamburguer";

    public Hamburguer(String tipo,String descricao, double valor, int codigo) {
        super(descricao, valor, codigo);
        this.tipo = tipo;
    }

    public Hamburguer() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
