

package persistencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.Pedido;
import modelo.Produto;
import persistencia.IPersistenciaPedido;

public class PersistenciaPedido extends PersistenciaBD implements IPersistenciaPedido {

    public void criaTabela() {

        String sqlPedido = "CREATE TABLE pedido "
                + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, "                
                + "DATA TEXT NOT NULL )";
        this.executaSQL(sqlPedido);
    }

    /**
     *
     * @param produto
     * Esse método insere um produto na minha base de dados.
     */
    @Override
    public void inserir(Pedido pedido) {

        String sql = "INSERT INTO PEDIDO (ID, DATA) "
                + "values('" + pedido.getCod() + "'," + pedido.getData()
                + "')";
        this.executaSQL(sql);
    }

    /*
        Esse método executa uma chamada sql no banco de dados.
     */
    @Override
    public List<Pedido> recuperarTodos() {
        ArrayList<Pedido> lista = new ArrayList<>();
        String sql = "SELECT * FROM PEDIDO";
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
                Pedido p = new Pedido();
                p.setCodigo(rs.getInt("id"));
                lista.add(p);
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
