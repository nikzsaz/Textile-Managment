/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ltextile;

/**
 *
 * @author Niraj kumar
 */
import java.sql.*;
import javax.swing.*;

public class ConnectionProvider {
     static public Connection con;
    static{
      
        try{
          Class.forName("oracle.jdbc.driver.OracleDriver");
          con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
            }catch(Exception e){
         JOptionPane.showMessageDialog(null,"Error "+e);
         }
        }
 public static Connection getCon(){
     return con;
 }
    
}
