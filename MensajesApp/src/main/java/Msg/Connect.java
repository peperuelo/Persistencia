package Msg;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author peper
 */
public class Connect {
    public Connection get_connection(){
        Connection conection = null;
        try{
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
            if (conection != null){
                System.out.println("Conexión exitosa!");
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return conection;
    }
}
