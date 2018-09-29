
package locacao.modelo.persistencia.util;

import locacao.modelo.persistencia.util.IPersistencia;
import java.io.IOException;


public class Persistencia {
    
    IPersistencia persistencia;
    
    public Persistencia(IPersistencia persistencia){
        this.persistencia = persistencia;
    }    
    public void salvarObjeto(Object objetoModelo) throws IOException {    
         persistencia.salvarObjeto(objetoModelo);
    }     
    public Object recuperarObjeto(Class clazz) throws IOException, ClassNotFoundException {    
        Object ob = persistencia.recuperarObjeto(clazz);         
        return ob;
    }
    
}
