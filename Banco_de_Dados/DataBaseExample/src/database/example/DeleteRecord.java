
package database.example;

import java.sql.*;

/**
 *
 * @author felip
 */
public class DeleteRecord {

    public  void deleteRecord(int id) {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:veiculos.db");            
            System.out.println("Opened database successfully");
            stmt = c.createStatement();
            String sql = "DELETE from VEICULO where ID=" + id +";";
            stmt.executeUpdate(sql);
            c.commit();            
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());            
        }
        System.out.println(
                "Operation done successfully");
    }
}
