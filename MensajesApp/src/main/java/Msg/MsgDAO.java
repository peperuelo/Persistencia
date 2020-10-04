package Msg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peper
 */
public class MsgDAO {

    public static void crearMensaje(Msg msg){
        Connect dbConnect = new Connect();
        try(Connection cn = dbConnect.get_connection() ){
        PreparedStatement ps = null;
        try{
            String query = "INSERT INTO `mensajes` (`mensaje`, `autor_mensaje`,) VALUES ( ?,?)";
            ps = cn.prepareStatement(query);
            ps.setString(1, msg.getMsg());
            ps.setString(2, msg.getMsg_auth());
            ps.executeUpdate();
            System.out.println("Mensaje creado");
            
        }catch(SQLException e){
            System.out.println();
        }
        }catch(SQLException ex ){
            System.out.println(ex);
        }
    }
    public static void leerMensaje(Msg msg){
        
    }
    public static void borrarMensaje(Msg msg){
        
    }
    public void actualizarMensaje(Msg msg){
        
    }
}
