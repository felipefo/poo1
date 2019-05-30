
package carro;

import java.util.Calendar;


public class Carro {
    public int numeroPortas;
    public String cor;
    public String modelo;
    public int ano;    
        
    public Carro() {} 
    
    public Carro(int ano, String cor, String modelo, int numeroPortas) throws Exception
    {
        this.setAno(ano);
        this.setModelo(modelo);
        this.cor = cor;
        this.setNumeroProtas(numeroPortas);        
    }    
    public void setNumeroProtas(int numeroPortas) throws Exception{  
        if(numeroPortas >5 || numeroPortas < 2 )
            throw new Exception("Número de portas inválido");
        this.numeroPortas =  numeroPortas;        
    }                        
    public void setModelo(String modelo ) throws Exception{    
        if(modelo.equalsIgnoreCase("Fiat") || modelo.equalsIgnoreCase("Toyota"))
            this.modelo = modelo;   
        else{
             throw new Exception("Número de portas inválido");
        }
    }                                    
    public void setAno(int ano) throws Exception{
        //pegando o ano corrente
        int year = Calendar.getInstance().get(Calendar.YEAR);       
        if(ano > 1980 && ano <= year)
            this.ano  = ano;
        else{
            throw new Exception("Ano inválido");
        }
    }
            
    
    
}
