/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author diegoduro
 */
public class Validador {
    
    public Validador(){
        
    }
    
    public boolean validarLogin(String user, String pass) {
       boolean flag=false;
       try {
           myDB basesita = new myDB();
           Connection cn=basesita.conexion();
           String sql = "SELECT * from usuarios WHERE user= '"+user+"';";
           Statement stm = cn.createStatement();
           ResultSet rs = stm.executeQuery(sql);
           
           if (rs.next()){
               if (pass.equals(rs.getString("pass")))
               flag=true;
           }
           else {
               flag=false;
           }
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Error: " + e);
       }
       return flag;
   }

    public boolean validarLogin(JTextField txt_user, JPasswordField txt_pass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
