
package jogo.pontuacao;

import javax.swing.JOptionPane;

public class Pontuacao {
    
    int pontos;
    
    public void verificarQuestao(Questao questao){        
        if(questao.verificarResposta()){
            pontos += questao.pontos;
        }
    }
    
    public void exibirPontuacao(){
        JOptionPane.showMessageDialog(null, "Sua pontuacao atual é:" + pontos);
    }
}
