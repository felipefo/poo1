
package modelo;


public class Suco extends Bebida{
       
    private String sabor; 
    private boolean comAcucar=true;
    public static final String SUCO = "Suco";
    public Suco(){
        
    }
    
    public Suco(String tamanho, String descricao, double valor, String sabor, boolean acucar,int codigo) {
        super(tamanho, descricao, valor,codigo);
        this.sabor = sabor;
        this.comAcucar = acucar;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public boolean isComAcucar() {
        return comAcucar;
    }

    public void setComAcucar(boolean comAcucar) {
        this.comAcucar = comAcucar;
    }
    
    
    
}
