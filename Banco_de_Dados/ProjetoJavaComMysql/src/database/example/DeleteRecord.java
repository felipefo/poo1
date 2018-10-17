
package database.example;

import java.sql.*;
import singleton.database.example.DBConnection;


public class DeleteRecord {

    public  void deleteRecord(int id) {
        Connection c = null;
        Statement stmt = null;
        try {
            
            c = DBConnection.getInstance();
            System.out.println("Opened database successfully");
            stmt = c.createStatement();
            String sql = "DELETE from VEICULO where ID=" + id +";";
            stmt.executeUpdate(sql);            
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + 
                    e.getMessage());            
        }
        System.out.println(
                "Operation done successfully");
    }
}
