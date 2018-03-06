
package jogo.primeirasolucao;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;
//essa classe eh mais dificil de testar.
public class Questao {  
    int pontos=0;
    //
    int tipoQuestao; //1, soma, 2, subtracao, 3 multiplicacao    
    public Questao(int pontos, int tipoQuestao){
        //preciso estar atento aos argumentos
        this.pontos = pontos;
        this.tipoQuestao=tipoQuestao;    
    }        
    public void criarPergunta(){        
        int operador1 = ThreadLocalRandom.current().nextInt(0,100);
        int operador2 = ThreadLocalRandom.current().nextInt(0,20);//não consigo variar para
        //cada tipo de pergunta
        
        String resposta = "";
        boolean resultadoCorrecao= false;//para não repetir codigo de tela.
        if(this.tipoQuestao == 1){//soma
            resposta = JOptionPane.showInputDialog("Quanto é " + 
        operador1 + " + " + operador2 );
            int respostaEmInteiro = Integer.parseInt(resposta);                        
            if(respostaEmInteiro == operador1 + operador2){
                resultadoCorrecao = true;
            }
        }else if (this.tipoQuestao == 2){//subtracao
            resposta = JOptionPane.showInputDialog("Quanto é " + 
            operador1 + " - " + operador2 );    
            int respostaEmInteiro = Integer.parseInt(resposta);                        
            if(respostaEmInteiro == operador1 + operador2){
                resultadoCorrecao = true;
            }
        }else if (this.tipoQuestao == 3){//multiplicacao
            resposta = JOptionPane.showInputDialog("Quanto é " + 
            operador1 + " * " + operador2 );                            
            int respostaEmInteiro = Integer.parseInt(resposta);                        
            if(respostaEmInteiro == operador1 + operador2){
                resultadoCorrecao = true;
            }            
        }                                    
        if(resultadoCorrecao)
            JOptionPane.showMessageDialog(null,"Você acertou!");
        else 
            JOptionPane.showMessageDialog(null,"Você errou");            
        }               
}
