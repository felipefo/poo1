
package jogo;

import jogo.terceirasolucao.*;


public class Jogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        QuestaoSubtracao novaQuestao = new QuestaoSubtracao();
//        novaQuestao.criarPergunta();
//        novaQuestao.exibirResultado();
        
        
        String s1 = "Café";
      Pessoa p1 = new Pessoa();
      p1.setNome(s1);
      System.out.println(p1.getNome());
      Pessoa p2 = p1;
      p2.setNome("Leite");
      System.out.println(p1.getNome());
      p2 = null;
      System.out.println(p1.getNome());
     // System.out.println(p2.getNome());
      
      
      
      String[] animais = new String[4];
      animais[0] = "Gato";
      animais[1] = "Pássaro";
      animais[3] = "Peixe";
      for (int i=0; i<animais.length; i++) {
         System.out.println(animais[i] +", ");
      }
     System.out.println(animais[0].replace('G','R'));
     System.out.println(animais[0].replace('G','P'));


                
    }
    
}
