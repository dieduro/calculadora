/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;
import java.sql.*;

/**
 *
 * @author diegoduro
 */
public class myDB {
    
    private final String user = "root";
    private final String pass = "root";
    private final String conn_string = "jdbc:mysql://localhost:3306/javaLogin";
         
    
    public Connection conexion() {
        Connection conn = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(this.conn_string,this.user,this.pass);
            System.out.println("conectado");
        }catch (Exception e) {
            System.out.println(e);
        }
        return conn;
        
    }
    
}
