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
        MsgDAO.createMsgDB(register);
    }
    public static void readMsg(){
        MsgDAO.readMsgDB();
    }
    public static  void updateMsg(){
        Scanner sc = new Scanner(System.in);
         System.out.println("escribe el mensaje");
        String msg = sc.nextLine();
        System.out.println("escribe el id del mensaje");
        int id = sc.nextInt();
        Message update = new Message();
        update.setMsg(msg);
        update.setId_msg(3);
       
        MsgDAO.updateMsgDB(update);
    }
    public static  void deleteMsg(){
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe el id del mensaje");
        int id= sc.nextInt();
        MsgDAO.deleteMsgDB(id);
    }
}
