
package database.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author felipe
 */
public class CreateTable {

    public synchronized void  createTable() {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:veiculos.db");
            System.out.println("Base de dados aberta");
            stmt = c.createStatement();
            String sql = "CREATE TABLE VEICULO "
                    + "(ID INT PRIMARY KEY  NOT NULL," //AUTOINCREMENT
                        + " QUILOMETRAGEM   INT  NULL, "
                    + " MARCA            CHAR(40)     NOT NULL, "
                    + " MODELO        CHAR(50) NULL, "
                    + " ANO         INT NOT NULL, "
                    + " TIPO_VEICULO NOT NULL )";
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());            
        }
        System.out.println("Table created successfully");
    }
}
