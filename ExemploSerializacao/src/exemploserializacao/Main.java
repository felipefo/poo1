
package exemploserializacao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Main {
    
        
    public static void main(String args[]) throws FileNotFoundException, IOException{
        FileOutputStream out = new FileOutputStream("data.out");
        ObjectOutputStream objectOut  = new  ObjectOutputStream(out);
        Usuario user =  new Usuario();        
        objectOut.writeObject(user);        
    }
    
}
