package Msg;


public class Msg {
    int id_msg;
    String msg;
    String msg_auth;
    String fecha_mensaje;
    
    
    public Msg(){
        
    }

    public Msg(String msg, String msg_auth, String fecha_mensaje) {
        this.msg = msg;
        this.msg_auth = msg_auth;
        this.fecha_mensaje = fecha_mensaje;
    }
  

    public int getId_msg() {
        return id_msg;
    }

    public void setId_msg(int id_msg) {
        this.id_msg = id_msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg_auth() {
        return msg_auth;
    }

    public void setMsg_auth(String msg_auth) {
        this.msg_auth = msg_auth;
    }

    public String getFecha_mensaje() {
        return fecha_mensaje;
    }

    public void setFecha_mensaje(String fecha_mensaje) {
        this.fecha_mensaje = fecha_mensaje;
    }
    
    
}
