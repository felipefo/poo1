
package jogo.pontuacao;

public class Jogo {

    public static void main(String[] args) {
        
        Pontuacao pontuacao = new Pontuacao();
        
        for(;;){        
            QuestaoSoma novaQuestao = new QuestaoSoma();
            novaQuestao.criarPergunta();
            novaQuestao.exibirResultado();            
            pontuacao.verificarQuestao(novaQuestao);
            pontuacao.exibirPontuacao();                        
        }
                
    }
    
}
