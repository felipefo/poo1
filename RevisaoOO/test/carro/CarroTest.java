
package carro;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CarroTest {    
    Carro carro;    
    @Before
    public void setUp() {        
       carro = new Carro();
    }          
    @Test
    public void testSetNumeroProtas() {        
        try{                
            this.carro.setNumeroProtas(10);
            fail("Não deve aceita um número maior que 5");
        }catch(Exception ex){
            ex.printStackTrace();
        }                
    }   
    @Test
    public void testSetModelo() {
           try{                
            this.carro.setModelo("Chevrolet");
            fail("Deve aceitar somente Fiat ou Toyta");
        }catch(Exception ex){
            ex.printStackTrace();
        }                                
    } 
    @Test
    public void testSetAno(){
        try{                
            this.carro.setAno(2020);
            fail("Não deve aceitar um ano maior que o ano atual");
        }catch(Exception ex){
            ex.printStackTrace();
        }                                
    }
    
}
