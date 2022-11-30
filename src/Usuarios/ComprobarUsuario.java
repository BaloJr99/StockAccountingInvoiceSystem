package Usuarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import MisExcepciones.MiExcepcion;

public class ComprobarUsuario {
    String usuario, contrasena;

    public ComprobarUsuario(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    
    public boolean comprobar(){
        boolean exito = false;
        try {
            Connection con =  DriverManager.getConnection("jdbc:mysql://localhost/elpotrero", "root", "");
            PreparedStatement pstusuario = con.prepareStatement("SELECT Usuario FROM usuarios WHERE Usuario = '"+this.usuario+"' && Contraseña = '"+this.contrasena+"'");
            
            ResultSet rsusuario = pstusuario.executeQuery();            
            
            if(rsusuario.next()){
                exito = true;
            }
            con.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error de conexion");
        }
        return exito;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
}
