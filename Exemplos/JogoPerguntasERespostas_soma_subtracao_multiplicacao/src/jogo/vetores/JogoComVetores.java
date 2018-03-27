
package jogo.vetores;

import jogo.pontuacao.*;
import javax.swing.JOptionPane;

/* 
    Quero poder gerar um relatório com todas as perguntas e repostas.

*/

public class JogoComVetores {
    Pontuacao pontuacao = new Pontuacao();    
    Questao[] listaQuestoes;
    int quantidade;
    
    public JogoComVetores(){
        String quantidadePerguntas = JOptionPane.showInputDialog("Quantas perguntas");
        this.quantidade = Integer.parseInt(quantidadePerguntas);
        this.listaQuestoes = new Questao[quantidade];//iniciando o tamanho do vetor.
    }
    public void iniciaJogo(){        
        for(int i=0;i<this.quantidade;i++){        
            QuestaoSoma novaQuestao = new QuestaoSoma();
            novaQuestao.criarPergunta();
            novaQuestao.exibirResultado();            
            pontuacao.verificarQuestao(novaQuestao);
            pontuacao.exibirPontuacao();  
            listaQuestoes[i] = novaQuestao; //guardando a referencia no vetor
        } 
        
        //foreach ou for aprimorado
        for (Questao questao : this.listaQuestoes) {
            System.out.println(questao);
        }
    }        
}
