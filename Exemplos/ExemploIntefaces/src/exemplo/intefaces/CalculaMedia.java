
package exemplo.intefaces;

import java.util.List;

public class CalculaMedia{        
    public double calcula(List<Integer> lista){        
        int total=0;
        for(Integer item : lista){
            total+= item;
        }        
        double media = total/lista.size();
        return media;       
    }
}
