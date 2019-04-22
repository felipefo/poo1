package persistencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.Produto;
import persistencia.IPersistenciaProduto;

public class PersistenciaProduto extends PersistenciaBD implements IPersistenciaProduto {

    public void criaTabelaProduto() {

        String sqlProduto = "CREATE TABLE produto "
                + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "descricao CHAR(40) NOT NULL,"
                + "marca CHAR(40) NOT NULL,"
                + "valor NUMERIC  NOT NULL"
                + " )";
        this.executaSQL(sqlProduto);
    }

    /**
     *
     * @param produto
     */
    @Override
    public void inserir(Produto produto) {

        String sql = "INSERT INTO PRODUTO (descricao, valor , tipo) "
                + "values('" + produto.getDescricao()
                + "'," + produto.getValor()
                + "')";
        this.executaSQL(sql);
    }

    /*
        Esse método executa uma chamada sql no banco de dados.
     */
    @Override
    public List<Produto> recuperarTodos() {
        ArrayList<Produto> lista = new ArrayList<Produto>();
        String sql = "SELECT * FROM PRODUTO";
        ResultSet rs = null;
        Connection c = null;
        Statement stmt = null;
        try {
            //verifica se as classes desse driver existem nas libs
            Class.forName("org.sqlite.JDBC");
            //inicia a conexão com o banco de dados 
            c = DriverManager.getConnection("jdbc:sqlite:lanchonete.db");
            System.out.println("Base de dados aberto");
            //inicia a criação de uma execucao para o banco de dados.
            stmt = c.createStatement();
            //executa o sql query                         
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String tipo = rs.getString("tipo");
                Produto hamburger = new Produto();
                hamburger.setCodigo(rs.getInt("id"));
                hamburger.setDescricao(rs.getString("descricao"));
                hamburger.setValor(rs.getDouble("valor"));
                lista.add(hamburger);
            }
            rs.close();
            //fecha o statemente
            stmt.close();
            //fecha a conexão com o banco de dados.
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

}
