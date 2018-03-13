/*
Crie uma classe Livro, contendo os seguintes atributos (ISBN, nome, ano 
de publicação, autor e editora). 
 
 */
package exercicio_livros;

public class Livro {    
   
    private String ISBN; 
    private String nome;
    private int ano;
    private String autor;
    private String editora;  

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        if(ISBN.length() == 13)
            this.ISBN = ISBN;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if(ano <= 2018)
        this.ano = ano;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
    
    
    
    
    
}
