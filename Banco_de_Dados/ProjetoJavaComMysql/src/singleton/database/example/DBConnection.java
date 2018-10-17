
package singleton.database.example;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {

    private static Connection instance = null;        
    
    private DBConnection() {
    }
    public static synchronized Connection getInstance() {
        if (instance == null) {
            try {
                Connection c = null;
                
                 String USUARIO = "root";
                 String SENHA = "";
                 String URL = "jdbc:mysql://127.0.0.1:3306/lp";
                 String DRIVER = "com.mysql.jdbc.Driver";
                
                //Class.forName("org.sqlite.JDBC");
                //c = DriverManager.getConnection("jdbc:sqlite:veiculo.db");
                c =  DriverManager.getConnection(URL, USUARIO, SENHA);
                c.setAutoCommit(true);
                
                instance = c;
            } catch (Exception e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
            }
        }
        return instance;
    }
}
