
package jogo.pontuacao;

import javax.swing.JOptionPane;


public class Jogo {
    
    Pontuacao pontuacao = new Pontuacao();    
    
    public void iniciaJogo(){        
        for(;;){        
            QuestaoSoma novaQuestao = new QuestaoSoma();
            novaQuestao.criarPergunta();
            novaQuestao.exibirResultado();            
            pontuacao.verificarQuestao(novaQuestao);
            pontuacao.exibirPontuacao();                                    
            String continuar = JOptionPane.showInputDialog("Deseja continuar?(S)Sim ou (N)Não");
            if(continuar.equalsIgnoreCase("N")){
                break;
            }                        
        }        
    }
    
    
}
