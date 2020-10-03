
import java.sql.Connection;


public class main {
    public static void main (String[] args){
        Connect conexion = new Connect();
        try(Connection cnx = conexion.get_connection()) {
            
        }catch(Exception e ){
            System.out.println(e);
        }
           
    }
}
