
package junit.modelo;

import java.util.ArrayList;


public class Notas {        
    public ArrayList<Integer> notas;    
    public Notas(){
        notas = new ArrayList<Integer>();
    }
    public ArrayList getNotas() {
        return notas;
    }
    public void addNotas(int nota) {
        this.notas.add(nota);
    }     
    public double calculaMedia(){
        double soma  = 0;
        for(Integer nota : notas )            
            soma += nota;
        double media = soma/(notas.size()-1);
        return media;
    }
}
