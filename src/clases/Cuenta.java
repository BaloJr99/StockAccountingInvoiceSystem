package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Cuenta {
    int numcuenta;
    String nombrecuenta;

    public Cuenta(int numcuenta, String nombrecuenta) {
        this.numcuenta = numcuenta;
        this.nombrecuenta = nombrecuenta;
    }
    
    public ArrayList<Cuenta> GuardarCuentas(){
        ArrayList<Cuenta> cuentas =  new ArrayList<>();
        Cuenta cuenta;
        
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/elpotrero", "root", "");
            PreparedStatement pe = con.prepareStatement("SELECT * FROM cuentas");
            ResultSet re = pe.executeQuery();
            while(re.next()){
                cuenta = new Cuenta(re.getInt("Cuenta"), re.getString("Nombre"));
                cuentas.add(cuenta);
            }
            con.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return cuentas;
    }
    
    public boolean agregar(){
        boolean exito = false;
        
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/elpotrero", "root", "");
            PreparedStatement pe = con.prepareStatement("SELECT * FROM cuentas WHERE Cuenta = '"+this.numcuenta+"'");
            
            ResultSet re = pe.executeQuery();
            
            if(re.next()){
                
            }else{
                pe = con.prepareStatement("INSERT INTO cuentas VALUES (?, ?)");
                pe.setInt(1, this.numcuenta);
                pe.setString(2, this.nombrecuenta);
                pe.executeUpdate();
                re.close();
                con.close();
                exito = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return exito;
    }
    
    public boolean modificar(){
        boolean exito = false;
        
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/elpotrero", "root", "");
            PreparedStatement pe = con.prepareStatement("UPDATE cuentas SET Nombre = '"+this.nombrecuenta+"' WHERE Cuenta = '"+this.numcuenta+"'");
            
            pe.executeUpdate();
            exito = true;
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return exito;
    }

    public int getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(int numcuenta) {
        this.numcuenta = numcuenta;
    }

    public String getNombrecuenta() {
        return nombrecuenta;
    }

    public void setNombrecuenta(String nombrecuenta) {
        this.nombrecuenta = nombrecuenta;
    }
    
    
}
