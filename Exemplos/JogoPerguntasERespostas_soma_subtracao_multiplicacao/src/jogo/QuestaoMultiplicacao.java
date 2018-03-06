
package jogo;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;
public class QuestaoMultiplicacao {  
    
    int pontos;
    int operador1;
    int operador2;
    int respostaEmInteiro;
    
    public QuestaoMultiplicacao(){
        this.operador1 = ThreadLocalRandom.current().nextInt(0,100);
        this.operador2 = ThreadLocalRandom.current().nextInt(0,20);        
    }          
    private boolean verificarResposta(){
        if(this.operador1 * this.operador2 == this.respostaEmInteiro){
             return true;            
        }
        return false;
    }    
    public void criarPergunta(){               
        String resposta = JOptionPane.showInputDialog("Quanto é " + 
        this.operador1 + " * " + this.operador2 );
        this.respostaEmInteiro = Integer.parseInt(resposta);        
    }
    
    public void exibirResultado(){
        if(this.verificarResposta())
          JOptionPane.showMessageDialog(null,"Você acertou!");
        else 
          JOptionPane.showMessageDialog(null,"Você errou!");
    }
}
