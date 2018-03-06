
package jogo.pontuacao;


import javax.swing.JOptionPane;
public class QuestaoMultiplicacao extends Questao {      
   
    public QuestaoMultiplicacao(){
        this.pontos = 2;
    }
    @Override
    public boolean verificarResposta(){
        if(this.operador1 * this.operador2 == this.resposta){
             return true;            
        }
        return false;
    }    
    public void criarPergunta(){               
        String respostaTextual = JOptionPane.showInputDialog("Quanto é " + 
        this.operador1 + " * " + this.operador2 );
        this.resposta = Integer.parseInt(respostaTextual);        
    }    
 
}
