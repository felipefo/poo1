package database.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;

/**
 *
 * @author felipe
 */
public class SelectTable {

    public synchronized void selectTable() {

        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:veiculos.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM VEICULO;");
            while (rs.next()) {
                int id = rs.getInt("id");
                int quilometragem = rs.getInt("QUILOMETRAGEM");
                String marca = rs.getString("MARCA");
                String modelo = rs.getString("MODELO");
                String tipoVeiculo = rs.getString("TIPO_VEICULO");
                int ano = rs.getInt("ANO");
                System.out.println("ID = " + id);
                System.out.println("marca = " + marca);
                System.out.println("modelo = " + modelo);
                System.out.println("ano = " + ano);
                System.out.println("tipoVeiculo = " + tipoVeiculo);
                System.out.println("QUILOMETRAGEM = " + quilometragem);
                System.out.println();
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());            
        }
        System.out.println("Operation done successfully");
    }
}
