
package junit.modelo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Usuario {

    private String nome;
    private Date dtNascimento;
    private String senha;
        
    public int calcularIdade(){        
        
        GregorianCalendar hj=new GregorianCalendar();
	GregorianCalendar nascimento=new GregorianCalendar();
	if(this.getDtNascimento()!=null){
            nascimento.setTime(this.getDtNascimento());
	}		
	int anohj=hj.get(Calendar.YEAR);
	int anoNascimento=nascimento.get(Calendar.YEAR);
	return anohj-anoNascimento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) throws Exception  {
        if(senha.length() < 6 ){
            throw new Exception("Senha muito pequena. Ela deve ser maior que 6 caracteres");
        }else if (senha.length() > 20 ){
            throw new Exception("Senha muito grande. Ela deve ser menor que 20 caracteres");
        }        
        this.senha = senha;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }
    
    
    
}
