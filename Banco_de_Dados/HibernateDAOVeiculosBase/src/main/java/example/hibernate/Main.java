package example.hibernate;

import example.hibernate.model.Veiculo;
import example.hibernate.persistencia.VeiculoPersistencia;
import java.util.List;


public class Main {    		
	public static void main(String[] args) throws Exception {                                    
                        
            
           VeiculoPersistencia veiculoPersistencia = new VeiculoPersistencia();            
           Veiculo veiculo = new Veiculo();
           veiculo.setAno("2010");
           veiculo.setMarca("Fiat");
           veiculo.setModelo("Uno");
           veiculo.setQuilometragem("1000");
           veiculo.setTipo("carro");              
           veiculoPersistencia.inserir(veiculo);           
           List<Veiculo> listar = veiculoPersistencia.listar();
           for(Veiculo printVeiculo : listar){
               System.out.println(printVeiculo.toString());
           }
           
           veiculoPersistencia.deletar(veiculo);           
           listar = veiculoPersistencia.listar();
           for(Veiculo printVeiculo : listar){
               System.out.println(printVeiculo.toString());
           }
           
            
	}                
}
