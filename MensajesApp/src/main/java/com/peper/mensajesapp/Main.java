
package com.peper.mensajesapp;

import java.util.Scanner;

public class Main {
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in); 
        int opcion = 0;
        
        do{
            System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
            System.out.println("Mensajes");
            System.out.println("1. Crear mensaje");
            System.out.println("2. Listar mensaje");
            System.out.println("3. Editar mensaje");
            System.out.println("4. Borrar mensaje");
            System.out.println("5. Salir");
            // Se lee la opocion1
            
             opcion = sc.nextInt();
             
             switch(opcion){
                 case 1:
                     MsgService.createMsg();
                     break;
                 case 2:  
                     MsgService.readMsg();
                     break;
                 case 3:  
                     MsgService.updateMsg();
                     break;
                 case 4:  
                     MsgService.deleteMsg();
                     break;
                 default:  
                     break;
             }
        }while(opcion != 5);
    }
}