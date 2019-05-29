/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploserializacao;

import java.io.Serializable;


 
public class Pessoa implements Serializable{    
    String nome;    
    public void setNome(String nome){
            this.nome = nome;
    }
}


