package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Factura extends Persona{
    int folio, cantidad;
    float importe, iva, total;
    String descripcion;

    public Factura(int folio, int cantidad, float importe, float iva, float total, String descripcion, String nombre, String RFC, String correo, String empleado, String domicilio) {
        super(nombre, RFC, correo, empleado, domicilio);
        this.folio = folio;
        this.cantidad = cantidad;
        this.importe = importe;
        this.iva = iva;
        this.total = total;
        this.descripcion = descripcion;
    }
    
    public String captarNombre(String RFC1){
        String Nombre1 = "";
        try {
            Connection con  = DriverManager.getConnection("jdbc:mysql://localhost/elpotrero", "root", "");
            PreparedStatement pe = con.prepareStatement("SELECT Nombre FROM persona WHERE RFC = '"+RFC1+"'");
            
            ResultSet re = pe.executeQuery();
            
            if(re.next()){
                Nombre1 = re.getString("Nombre");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Factura.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Nombre1;
    }
    
    public float total(String facturas, int folio){
        float totalgeneral = 0;
        
        try {
            Connection con  = DriverManager.getConnection("jdbc:mysql://localhost/elpotrero", "root", "");
            PreparedStatement pe = con.prepareStatement("SELECT Total FROM "+facturas+" WHERE Folio = '"+folio+"'");
            ResultSet re = pe.executeQuery();
            
            while(re.next()){
                totalgeneral = totalgeneral +  re.getFloat("Total");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        return totalgeneral;
    }
    
    public int ultimofolio(String facturas){
        int folioultimo = 0;
        
        try {
            Connection con  = DriverManager.getConnection("jdbc:mysql://localhost/elpotrero", "root", "");
            PreparedStatement pe = con.prepareStatement("SELECT Folio FROM "+facturas+" ORDER BY Folio DESC LIMIT 1");
            ResultSet re = pe.executeQuery();
            
            if(re.next()){
                folioultimo = re.getInt("Folio");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        return folioultimo;
    }
    
    public String[] captarRFC(){
        String[] TodoRFC = new String[0];
        int j = 0;
        int totalfilas = 0;
        
        try {
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/elpotrero", "root", "");
            PreparedStatement pe = con.prepareStatement("SELECT * FROM persona WHERE EsEmpleado = '"+empleado+"'");
            ResultSet re = pe.executeQuery();
            while(re.next()){
                totalfilas++;
            }            
            TodoRFC = new String[totalfilas];
            re = pe.executeQuery();
            while(re.next()){
                TodoRFC[j] = re.getString("RFC");
                j++;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
       return TodoRFC;
    }   
    
    public ArrayList<Factura> factura(String facturas){
        ArrayList<Factura> facturaciones = new ArrayList<>();
        try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/elpotrero", "root", "");
                PreparedStatement pe = con.prepareStatement("SELECT * FROM "+facturas+" WHERE Folio = '"+this.folio+"'");
                ResultSet re = pe.executeQuery();
                Factura factura;
                while(re.next()){
                    factura = new Factura(re.getInt("Folio"), re.getInt("Cantidad"), re.getFloat("Importe"), re.getFloat("Iva"), re.getFloat("Total"), re.getString("Descripcion"), re.getString("Nombre"), re.getString("RFC"), "", "", re.getString("Estado"));
                    facturaciones.add(factura);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        return facturaciones;
    }
    
    public boolean agregar(int folio, String facturas){
        boolean exito = false;
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/elpotrero", "root", "");
                PreparedStatement pe = con.prepareStatement("INSERT INTO "+facturas+" VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)");
                pe.setInt(1, folio);
                pe.setString(2, this.nombre);
                pe.setString(3, this.RFC);
                pe.setString(4, this.descripcion);
                pe.setInt(5, this.cantidad);
                pe.setFloat(6, this.importe);
                pe.setFloat(7, this.iva);
                pe.setFloat(8, this.total);
                pe.setString(9, null);
                pe.executeUpdate();
                con.close();
                
                exito = true;
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        return exito;
    }
    
    public boolean modificar(int folio, String facturas, String Descripcion, String Cantidad, String Importe){
        boolean exito = false;
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/elpotrero", "root", "");
                PreparedStatement pe = con.prepareStatement("UPDATE "+facturas+" SET Descripcion = ?, Cantidad = ?, Importe = ?, Iva = ?, Total = ? WHERE Folio = '"+folio+"' AND Descripcion = '"+descripcion+"' AND Cantidad = '"+Cantidad+"' AND Importe = '"+Importe+"'");
                pe.setString(1, this.descripcion);
                pe.setInt(2, this.cantidad);
                pe.setFloat(3, this.importe);
                pe.setFloat(4, this.iva);
                pe.setFloat(5, this.total);
                pe.executeUpdate();
                con.close();
                
                exito = true;
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        return exito;
    }
    
    public boolean eliminar(int folio, String facturas, String Descripcion, String Cantidad, String Importe){
        boolean exito = false;
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/elpotrero", "root", "");
                PreparedStatement pe = con.prepareStatement("DELETE FROM "+facturas+" WHERE Folio = '"+folio+"' AND Descripcion = '"+descripcion+"' AND Cantidad = '"+Cantidad+"' AND Importe = '"+Importe+"'");
                pe.executeUpdate();
                con.close();
                
                exito = true;
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        return exito;
    }
    
    public boolean buscar(String facturas){
        boolean exito = false;
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/elpotrero", "root", "");
                PreparedStatement pe = con.prepareStatement("SELECT * FROM "+facturas+" WHERE Folio = '"+this.folio+"'");
                ResultSet re = pe.executeQuery();
                
                if(re.next()){
                    exito = true;
                    
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        return exito;
    }
    
    @Override
    public boolean generar(int folio, String facturas){
        boolean exito = false;
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/elpotrero", "root", "");
                PreparedStatement pe = con.prepareStatement("UPDATE "+facturas+" SET Estado = 'Vigente' WHERE Folio = '"+folio+"'");
                pe.executeUpdate();
                exito = true;        
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        return exito;
    }
    
    @Override
    public boolean cancelar(int folio, String facturas) {
        boolean exito = false;
        try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/elpotrero", "root", "");
                PreparedStatement pe = con.prepareStatement("UPDATE "+facturas+" SET Estado = 'Cancelado' WHERE Folio = '"+folio+"'");
                pe.executeUpdate();
                exito = true;        
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        return exito;
    }
    
    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
