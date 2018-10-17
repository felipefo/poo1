package modelo;

public class Bebida extends Produto {
    private String tamanho;
    private boolean comGelo = false;

    public Bebida(String tamanho, String descricao, double valor,int codigo) {
        super(descricao, valor,codigo);
        this.tamanho = tamanho;
    }
    public Bebida(){
    }
    
    
    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    public boolean isComGelo() {
        return comGelo;
    }
    public void setComGelo(boolean comGelo) {
        this.comGelo = comGelo;
    }

}
