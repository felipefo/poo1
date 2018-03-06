
package jogo;

import jogo.terceirasolucao.*;


public class Jogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        QuestaoSubtracao novaQuestao = new QuestaoSubtracao();
        novaQuestao.criarPergunta();
        novaQuestao.exibirResultado();
                
    }
    
}
