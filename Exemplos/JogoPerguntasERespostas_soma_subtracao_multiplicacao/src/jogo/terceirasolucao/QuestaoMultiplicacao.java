
package jogo.terceirasolucao;


import javax.swing.JOptionPane;
public class QuestaoMultiplicacao extends Questao {      
   
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
