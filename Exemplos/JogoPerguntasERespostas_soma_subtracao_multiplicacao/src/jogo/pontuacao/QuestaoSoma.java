
package jogo.pontuacao;


import jogo.terceirasolucao.*;
import javax.swing.JOptionPane;
public class QuestaoSoma extends Questao {  
         
    public QuestaoSoma(){
        this.pontos = 1;
    }
    
    @Override
    public boolean verificarResposta(){
        if(this.operador1 + this.operador2 == this.resposta){
             return true;            
        }
        return false;
    }    
    public void criarPergunta(){               
        String respostaTextual = JOptionPane.showInputDialog("Quanto é " + 
        this.operador1 + " + " + this.operador2 );
        this.resposta = Integer.parseInt(respostaTextual);        
    }
     
}
