

package database.example;

/**
 *
 * @author felipe
 */
public class Veiculo {
    
    private int id;
    private String marca;
    private String modelo;
    private String tipoVeiculo;
    private int ano;
    private int quilometragem;

    public String getMarca() {
        return marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) throws Exception {
        if(
          tipoVeiculo.equalsIgnoreCase("CARRO") || 
          tipoVeiculo.equalsIgnoreCase("MOTO") || 
          tipoVeiculo.equalsIgnoreCase("CAMINHÃO") || 
          tipoVeiculo.equalsIgnoreCase("ÔNIBUS")
          )      {
            this.tipoVeiculo = tipoVeiculo;
        }          
        else throw new Exception("Tipo de veículo não permitido");
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }
    
    
    
}
