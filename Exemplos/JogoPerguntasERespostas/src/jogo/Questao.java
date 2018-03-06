
package jogo;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;
public class Questao {    
    public Questao(){}        
    public void criarPergunta(){        
        int operador1 = ThreadLocalRandom.current().nextInt(0,100);
        int operador2 = ThreadLocalRandom.current().nextInt(0,20);
        String resposta = JOptionPane.showInputDialog("Quanto é " + 
        operador1 + " + " + operador2 );
        int respostaEmInteiro = Integer.parseInt(resposta);        
        if(operador1 + operador2 == respostaEmInteiro)
            JOptionPane.showMessageDialog(null,"Você acertou!");
        else 
            JOptionPane.showMessageDialog(null,"Você errou");            
        }               
}
