
package locacao.modelo.persistencia;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class PersistenciaSerializada {
                
    public void salvarObjeto(Object objetoModelo) throws IOException {    
        String current = new java.io.File( "." ).getCanonicalPath();                               
        FileOutputStream fileSerializado = new FileOutputStream( 
                current + "\\src\\"  + objetoModelo.getClass().getSimpleName()+ ".ser");                
        ObjectOutputStream outputSerializado = new ObjectOutputStream(fileSerializado);        
        outputSerializado.writeObject(objetoModelo);
        outputSerializado.close();               
        System.out.println("Arquivo gerado em: \\src\\" +objetoModelo.getClass().getSimpleName() + ".ser");
    }    
    public Object recuperarObjeto(Class clazz) throws IOException, ClassNotFoundException {    
            String current = new java.io.File(".").getCanonicalPath();        
            String className = clazz.getSimpleName();
            FileInputStream fileIn = new FileInputStream( 
                current + "\\src\\"  + className+ ".ser");              
            ObjectInputStream in = new ObjectInputStream(fileIn);
                        
            Object objetoModelo  = in.readObject();
            in.close();
            return objetoModelo;
    }
        
}
