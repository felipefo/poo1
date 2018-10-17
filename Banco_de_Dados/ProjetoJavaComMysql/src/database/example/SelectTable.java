package database.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
import java.util.ArrayList;
import singleton.database.example.DBConnection;


public class SelectTable {

    public synchronized ArrayList selectTable() {
        ArrayList listVeiculos = new ArrayList();        
        Connection c = null;
        Statement stmt = null;
        try {
            c = DBConnection.getInstance();
            System.out.println("Opened database successfully");            
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM VEICULO;");
            while (rs.next()) {
                Veiculo veiculo = new Veiculo();
                veiculo.setId(rs.getInt("id"));
                veiculo.setQuilometragem(rs.getInt("QUILOMETRAGEM"));
                veiculo.setMarca(rs.getString("MARCA"));
                veiculo.setModelo(rs.getString("MODELO"));
                veiculo.setTipoVeiculo(rs.getString("TIPO_VEICULO"));
                veiculo.setAno(rs.getInt("ANO"));          
                listVeiculos.add(veiculo);
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());            
        }
        System.out.println("Operation done successfully");
        return listVeiculos;
    }
}
