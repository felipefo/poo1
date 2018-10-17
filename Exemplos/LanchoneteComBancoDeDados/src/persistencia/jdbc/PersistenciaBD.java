package persistencia.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class PersistenciaBD {
    
    //String sqlPedido = "CREATE TABLE pedido (ID INT PRIMARY KEY  NOT NULL)";
    //this.criaTabela(sqlPedido);                
        
    // String sqlItemPedido = "CREATE TABLE item_pedido (ID INT PRIMARY KEY  NOT NULL)";        
    //this.criaTabela(sqlItemPedido);        
    
        
    /*
        Esse método executa uma chamada sql no banco de dados.
    */
    public void  executaSQL(String sql) {
      
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
            //executa o sql 
            stmt.executeUpdate(sql);
            //fecha o statemente
            stmt.close();
            //fecha a conexão com o banco de dados.
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Tabela criada com sucesso");
    }
    
}
