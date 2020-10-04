
package com.peper.mensajesapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionS {
     private static Connection con;
    public static Connection get_connection(){
      
        if(con == null) {
            try{
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
                if (con != null){
                    System.out.println("Conexión exitosa!");
                }
            }catch(SQLException e){
                System.out.println(e);
            }
        }
        return con;
    }
}

    
