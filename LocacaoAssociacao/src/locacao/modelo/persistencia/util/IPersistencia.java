
package locacao.modelo.persistencia.util;

import java.io.IOException;


public interface IPersistencia {
    
    public void salvarObjeto(Object objetoModelo) throws IOException;
    public Object recuperarObjeto(Class clazz) throws IOException, ClassNotFoundException;
    
}
