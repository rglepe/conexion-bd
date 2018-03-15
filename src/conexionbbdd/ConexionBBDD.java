/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionbbdd;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author Raul
 */
public class ConexionBBDD {

    /**
     * @param args the command line arguments
     */

    
    public static void main(String[] args)      {
        // TODO code application logic here

        
        PropertyValues pv = new PropertyValues();
        
        try {
        String user = pv.getPropValues().getProperty("user");
        String password = pv.getPropValues().getProperty("password");
        System.out.println(user+" "+password);
       
        
        
        
        
        }catch(Exception e){
            System.err.println();
        }
}
}
