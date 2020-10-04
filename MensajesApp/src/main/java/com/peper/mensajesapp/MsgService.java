package com.peper.mensajesapp;
import java.util.Scanner;


public class MsgService {
    
    public static  void createMsg(){
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe el mensaje");
        String msg = sc.nextLine();
        
        System.out.println("Tu nombre");
        String name = sc.nextLine();
        Message register = new Message();
        register.setMsg(msg);
        register.setMsg_auth(name);
        System.out.println("antes de llegar al DAO");
        MsgDAO.createMsgDB(register);
    }
    public static void readMsg(){
        
    }
    public static  void updateMsg(){
        
    }
    public static  void deleteMsg(){
        
    }
}
