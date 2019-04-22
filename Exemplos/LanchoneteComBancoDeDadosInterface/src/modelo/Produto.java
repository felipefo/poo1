package modelo;

import java.io.Serializable;

public class Produto implements Serializable {

    private String descricao;
    private double valor;
    private int codigo;
    private Categoria categoria;
    private String marca;

    public Produto() {
    }

    public void setCategoria(Categoria cat) {
        this.categoria = cat;
    }

    public String getCategoria() {
        return this.categoria.descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Produto(String descricao, double valor, String marca) {
        this.descricao = descricao;
        this.valor = valor;
        this.marca = marca;
    }

    public Produto(String descricao, double valor, int codigo, String marca) {
        this.descricao = descricao;
        this.valor = valor;
        this.codigo = codigo;
        this.marca = marca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor > 0) {
            this.valor = valor;
        }
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}
