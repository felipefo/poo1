
package controle;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import modelo.Hamburger;
import modelo.Refrigerante;
import modelo.Suco;

public final class ProdutosCadastrados {
          
    Hamburger vegetarianoHamburger = new Hamburger();        
    Hamburger frangoHamburger = new Hamburger();        
    Hamburger bovinoHamburger = new Hamburger();            
    Refrigerante cocacola = new Refrigerante();    
    Suco sucoLaranja = new Suco();
    Suco sucoManga = new Suco();    
    
    public ProdutosCadastrados(){
        criarBaseDadosHamburger();
        cadastrarBebida();        
    }
    
    public void criarBaseDadosHamburger(){        
        
        vegetarianoHamburger.setDescricao("Hamburger Vegetariano");                               
        vegetarianoHamburger.setValor(25);               
        
        frangoHamburger.setDescricao("Hamburger de Frango");                               
        frangoHamburger.setValor(15);               
        
        bovinoHamburger.setDescricao("Hamburger de boi");                               
        bovinoHamburger.setValor(20);               
        
    }            
    public void cadastrarBebida(){        
        cocacola.setDescricao("Refrigerante Coca-cola");
        cocacola.setMarca("Coca cola");
        cocacola.setTamanho("1L");
        cocacola.setValor(4.5);
        
        sucoLaranja.setDescricao("Suco de Laranja");
        sucoLaranja.setSabor("Laranja");
        sucoLaranja.setValor(6);
        sucoLaranja.setTamanho("500ml");
        sucoManga.setDescricao("Suco de Manga");        
        sucoLaranja.setSabor("Manga");
        sucoManga.setValor(6);
        sucoManga.setTamanho("500ml");
    }

    public Hamburger getVegetarianoHamburger() {
        return (Hamburger)deepClone(vegetarianoHamburger);
    }

    public Hamburger getFrangoHamburger() {
        return (Hamburger)deepClone(frangoHamburger);
    }

    public Hamburger getBovinoHamburger() {
        return (Hamburger)deepClone(bovinoHamburger);
    }

    public Refrigerante getCocacola() {
        return (Refrigerante)deepClone(cocacola);
    }

    public Suco getSucoLaranja() {
        return (Suco)deepClone(sucoLaranja);
    }

    public Suco getSucoManga() {
        return (Suco)deepClone(sucoManga);
    }
    
   public static Object deepClone(Object object) {

    try {
     ByteArrayOutputStream baos = new ByteArrayOutputStream();
     ObjectOutputStream oos = new ObjectOutputStream(baos);
     oos.writeObject(object);
     ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
     ObjectInputStream ois = new ObjectInputStream(bais);
     return ois.readObject();
   }
   catch (Exception e) {
     e.printStackTrace();
     return null;
   }
 }
    
}
