package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Conta{
    int numPoliza, cuenta;
    String nomcuenta, descripcion, fecha;
    Float debe, haber;

    public Conta(int numPoliza, int cuenta, String nomcuenta, String descripcion, String fecha, Float debe, Float haber) {
        this.numPoliza = numPoliza;
        this.cuenta = cuenta;
        this.nomcuenta = nomcuenta;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.debe = debe;
        this.haber = haber;
    }

    public Conta(int numPoliza) {
        this.numPoliza = numPoliza;
    }

    public ArrayList<Conta> conta(){
        ArrayList<Conta> contabilidad = new ArrayList<>();
        try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/elpotrero", "root", "");
                PreparedStatement pe = con.prepareStatement("SELECT * FROM contabilidad WHERE NumPoliza = '"+this.numPoliza+"'");
                ResultSet re = pe.executeQuery();
                Conta conta;
                while(re.next()){
                    conta = new Conta(re.getInt("NumPoliza"), re.getInt("Cuenta"), "", re.getString("Descripcion"), re.getString("Fecha"), re.getFloat("Debe"), re.getFloat("Haber"));
                    contabilidad.add(conta);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        return contabilidad;
    }
    
    public boolean agregar(){
        boolean exito = false;
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/elpotrero", "root", "");
                PreparedStatement pe = con.prepareStatement("INSERT INTO contabilidad VALUES(?, ?, ?, ?, ?, ?)");
                
                pe.setInt(1, numPoliza);
                pe.setString(2, this.fecha);
                pe.setString(3, this.descripcion);
                pe.setInt(4, this.cuenta);
                pe.setFloat(5, this.debe);
                pe.setFloat(6, this.haber);
                pe.executeUpdate();
                con.close();
                
                exito = true;
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        return exito;
    }
    
    public boolean eliminar(int numCuenta){
        boolean exito = false;
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/elpotrero", "root", "");
                PreparedStatement pe = con.prepareStatement("DELETE FROM contabilidad WHERE Cuenta = '"+numCuenta+"'");
                pe.executeUpdate();
                con.close();
                
                exito = true;
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        return exito;
    }
    
    public boolean buscar(){
        boolean exito = false;
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/elpotrero", "root", "");
                PreparedStatement pe = con.prepareStatement("SELECT * FROM contabilidad WHERE NumPoliza = '"+this.numPoliza+"'");
                ResultSet re = pe.executeQuery();
                
                if(re.next()){
                    exito = true;
                    
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        return exito;
    }
    
    public String getNomcuenta() {
        return nomcuenta;
    }

    public void setNomcuenta(String nomcuenta) {
        this.nomcuenta = nomcuenta;
    }
    
    public int getNumPoliza() {
        return numPoliza;
    }

    public void setNumPoliza(int numPoliza) {
        this.numPoliza = numPoliza;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Float getDebe() {
        return debe;
    }

    public void setDebe(Float debe) {
        this.debe = debe;
    }

    public Float getHaber() {
        return haber;
    }

    public void setHaber(Float haber) {
        this.haber = haber;
    }
    
    
}
