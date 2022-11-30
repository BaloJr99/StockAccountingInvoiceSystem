package clases;

import InterfazAbstracta.Facturacion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Persona implements Facturacion{
    public String nombre, RFC, correo, empleado, domicilio;
    public String nombreb, RFCb, correob, empleadob, domiciliob;

    public Persona(String nombre, String RFC, String correo, String empleado, String domicilio) {
        this.nombre = nombre;
        this.RFC = RFC;
        this.correo = correo;
        this.empleado = empleado;
        this.domicilio = domicilio;
    }
    
    
    public boolean buscar(){
        boolean exito = false;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/elpotrero","root", "");
            PreparedStatement pe1 = con.prepareStatement("SELECT * FROM persona WHERE RFC = '"+this.RFC+"'");
            ResultSet re = pe1.executeQuery();
            if(re.next()){
                
                re.getString("Folio");
                this.nombreb = re.getString("Nombre");
                this.RFCb = re.getString("RFC");
                this.correob = re.getString("Correo");
                this.domiciliob = re.getString("Domicilio");
                this.empleadob = re.getString("EsEmpleado");
                con.close();
                re.close();
                exito = true;
            }else{
                
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return exito;   
    }
    
    public boolean registrar(){
        boolean exito = false;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/elpotrero","root", "");
            PreparedStatement pe1 = con.prepareStatement("SELECT RFC FROM persona WHERE RFC = '"+this.RFC+"'");
            ResultSet re = pe1.executeQuery();
            if(re.next()){
                
            }else{
                pe1 = con.prepareStatement("INSERT INTO persona VALUES (?, ?, ?, ?, ?, ?)");
                pe1.setString(1, "0");
                pe1.setString(2, this.nombre);
                pe1.setString(3, this.RFC);
                pe1.setString(4, this.correo);
                pe1.setString(5, this.domicilio);
                pe1.setString(6, this.empleado);
                pe1.executeUpdate();
                con.close();
                exito = true;
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return exito;   
    }
    
    public boolean modificar(){
        boolean exito = false;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/elpotrero","root", "");
            PreparedStatement pe1 = con.prepareStatement("SELECT RFC FROM persona WHERE RFC = '"+this.RFC+"'");
            ResultSet re = pe1.executeQuery();
            if(re.next()){
                
            }else{
                pe1 = con.prepareStatement("UPDATE persona set Folio = ?, Nombre = ?, RFC = ?, Correo = ?, Domicilio = ?, EsEmpleado = ? WHERE RFC = '"+this.RFC+"'");
                pe1.setString(1, "0");
                pe1.setString(2, this.nombre);
                pe1.setString(3, this.RFC);
                pe1.setString(4, this.correo);
                pe1.setString(5, this.domicilio);
                pe1.setString(6, this.empleado);
                pe1.executeUpdate();
                con.close();
                exito = true;
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return exito;   
    }
    
    @Override
    public boolean generar(int folio, String facturas) {
        boolean exito = false;
        return exito;
    }

    @Override
    public boolean cancelar(int folio, String facturas) {
        boolean exito = false;
        return exito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getNombreb() {
        return nombreb;
    }

    public void setNombreb(String nombreb) {
        this.nombreb = nombreb;
    }

    public String getRFCb() {
        return RFCb;
    }

    public void setRFCb(String RFCb) {
        this.RFCb = RFCb;
    }

    public String getCorreob() {
        return correob;
    }

    public void setCorreob(String correob) {
        this.correob = correob;
    }

    public String getEmpleadob() {
        return empleadob;
    }

    public void setEmpleadob(String empleadob) {
        this.empleadob = empleadob;
    }

    public String getDomiciliob() {
        return domiciliob;
    }

    public void setDomiciliob(String domiciliob) {
        this.domiciliob = domiciliob;
    }
}
