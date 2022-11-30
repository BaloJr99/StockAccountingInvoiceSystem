package Usuarios;
import java.sql.*;
import javax.swing.JOptionPane;

public class RegistroUsuarios {
    private String nombre, apellidoP, apellidoM, usuario, contrasena, fecha;
    
    public RegistroUsuarios(String nombre, String apellidoP, String apellidoM, String usuario, String contrasena, String fecha) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.fecha = fecha;
    }   
    
    public boolean disponibleusuario(){
        boolean exito = false;
            try{
                Connection con =  DriverManager.getConnection("jdbc:mysql://localhost/elpotrero", "root", "");
                PreparedStatement pst = con.prepareStatement("SELECT Usuario FROM usuarios WHERE Usuario = '"+this.usuario+"'");
                
                ResultSet rs = pst.executeQuery();
                
                if(rs.next()){
                    exito = true;
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        return exito;
    }
    
    public void registro(){
        try{
            Connection con =  DriverManager.getConnection("jdbc:mysql://localhost/elpotrero", "root", "");
            PreparedStatement pst = con.prepareStatement("INSERT INTO usuarios VALUES (?, ?, ?, ?, ?, ?, ?)");
            
            pst.setString(1, "0");
            pst.setString(2, this.nombre.trim());
            pst.setString(3, this.apellidoP);
            pst.setString(4, this.apellidoM);
            pst.setString(5, this.usuario);
            pst.setString(6, this.contrasena);
            pst.setString(7, this.fecha);
            pst.executeUpdate();
            con.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
