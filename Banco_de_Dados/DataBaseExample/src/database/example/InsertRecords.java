
package database.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author felip
 */
public class InsertRecords {

    public  void insertRecord(int id , int quilometragem , 
            String marca, String modelo, int ano, String tipoVeiculo) {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:veiculos.db");            
            System.out.println("Base de dados aberta");                        
            stmt = c.createStatement();
            String sql = "INSERT INTO VEICULO (ID,QUILOMETRAGEM,MARCA,"
                    + "MODELO,ANO,"
                    + " TIPO_VEICULO) "
                    + "VALUES (" + id+ "," + 
                    quilometragem + ",'" +
                    marca + "','" +
                    modelo + "'," +
                    ano +",'" +
                    tipoVeiculo + "');";   
            
            stmt.executeUpdate(sql);
            stmt.close();
            c.commit();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());            
        }
        System.out.println("Records created successfully");
    }
}
