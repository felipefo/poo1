
package modelo;


public class Refrigerante extends Bebida{
   
    private String marca;

    public Refrigerante(String tamanho, String descricao, double valor, String marca,int codigo) {
        super(tamanho, descricao, valor,codigo);
        this.marca = marca;
    }

    public Refrigerante() {
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
}
