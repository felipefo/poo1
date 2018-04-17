
package cadastrousuario;

public class Usuario {
    //Vamos acresentar o email aqui.
    String login;
    String senha;    
    String nomeCompleto;

    public String imprimeUsuario(){
        String dados ="Nome:" + nomeCompleto + "\n Login:" + login + "\n senha:" + senha;
        return dados;
    }    
    public void setSenha(String senha) throws Exception{    
           if(senha.length()<8){
               throw new Exception("A senha deve ser maior que 8");
           }
           else this.senha = senha;
    }
}
