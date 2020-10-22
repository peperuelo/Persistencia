/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.peper.mensajesapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MsgDAO {

    public static void createMsgDB(Message msg){
        ConnectionS dbConnect = new ConnectionS();
        
        try(Connection cn = dbConnect.get_connection() ){
            PreparedStatement ps = null;
                try{
                    String query = "INSERT INTO mensajes (mensaje, autor_mensaje) VALUES (?,?)";
                    ps = cn.prepareStatement(query);
                    ps.setString(1, msg.getMsg());
                    ps.setString(2,msg.getMsg_auth());
                    ps.executeUpdate();
                    System.out.println("Mensaje creado");
            
                }catch(SQLException e){
                    System.out.println();                   
                }
        }catch(SQLException ex ){
            System.out.println(ex);
        }
    }
    public static void readMsgDB(){
         ConnectionS dbConnect = new ConnectionS();
         PreparedStatement ps = null;
          ResultSet rs = null;
          try(Connection cn = dbConnect.get_connection() ){
            String query = "SELECT * from mensajes";
            ps = cn.prepareStatement(query);
            rs = ps.executeQuery(query);
            
            while(rs.next()){
                System.out.println("ID: "+rs.getInt("id_mensaje"));
                System.out.println("Mensaje: "+rs.getString("mensaje"));
                System.out.println("Autor: "+rs.getString("autor_mensaje"));
                System.out.println("Fecha: "+rs.getString("fecha_mensaje"));
                System.out.println("");
            }
          }catch(SQLException e){
                    System.out.println();   
           
               
           }
        }
    
    public static void updateMsgDB(Message msg){
         ConnectionS dbConnect = new ConnectionS();
         PreparedStatement ps = null;
         ResultSet rs = null;
         try(Connection cn = dbConnect.get_connection() ){
            String query = "UPDATE mensajes SET mensaje =? WHERE id_mensaje  = ?";
            ps = cn.prepareStatement(query);
             ps.setString(1, msg.getMsg());
            ps.setInt(2, msg.getId_msg());
            ps.executeUpdate();
            System.out.println(" Mensaje ha sido actualizado.");
        }catch(SQLException ex){
            System.out.println(ex);
            System.out.println("No se pudo actualizar el mensaje"); 
        }
    }
    
    public static  void deleteMsgDB(int idMsg){
              ConnectionS dbConnect = new ConnectionS();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try(Connection cn = dbConnect.get_connection() ){
            String query = "DELETE from mensajes Where id_mensaje  = ?";
            ps = cn.prepareStatement(query);
            ps.setInt(1, idMsg);
            ps.executeUpdate();
            System.out.println(" Mensaje ha sido eliminado.");
        }catch(SQLException e){
               
            System.out.println(e);
            System.out.println("No se pudo borrar el mensaje");   
           
           }
    }
}
