
package modelo;


public class Suco extends Bebida{
       
    private String sabor; 
    private boolean comAcucar=true;

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
