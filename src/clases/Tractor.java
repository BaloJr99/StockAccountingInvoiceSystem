package clases;

import InterfazAbstracta.Registros;
import InterfazAbstracta.Vehiculo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Tractor extends Vehiculo implements Registros{
    private String serie, departamento, serieb, marcab, modelob, departamentob, fechaingresob, fechabajab;

    public Tractor(String modelo, String fechaingreso, String fechabaja, String marca, String serie, String departamento) {
        super(modelo, fechaingreso, fechabaja, marca);
        this.serie = serie;
        this.departamento = departamento;
    }
    
    public boolean Buscar(){
        boolean exito = false;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/elpotrero", "root", "");
            PreparedStatement pe = con.prepareStatement("SELECT * FROM tractores WHERE Serie = ?");
            pe.setString(1, this.serie);
            ResultSet re = pe.executeQuery();
            
                if(re.next()){
                    this.serieb = re.getString("Serie");
                    this.modelob = re.getString("Modelo");
                    this.marcab = re.getString("Marca");
                    this.departamentob = re.getString("Departamento");
                    this.fechaingresob = re.getString("FechaIngreso");
                    this.fechabajab = re.getString("FechaBaja");
                    exito = true;
                }
            con.close(); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return exito;
    }
    
    @Override
    public boolean registraralta() {
        boolean exito = false;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/elpotrero", "root", "");
            PreparedStatement pe = con.prepareStatement("SELECT Serie FROM tractores WHERE Serie = ?");
            pe.setString(1, this.serie);
            ResultSet r1 = pe.executeQuery();
            
            if(r1.next()){
                
            }else{
                pe = con.prepareStatement("INSERT INTO tractores VALUES (?, ?, ?, ?, ?, ?)");
            
                pe.setString(1, this.serie);
                pe.setString(2, this.modelo);
                pe.setString(3, this.marca);
                pe.setString(4, this.departamento);
                pe.setString(5, this.fechaingreso);
                pe.setString(6, this.fechabaja);
                pe.executeUpdate();
                con.close();
                exito = true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(Tractor.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        return exito;
    }

    @Override
    public boolean modificar() {
        boolean exito = false;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/elpotrero", "root", "");
            PreparedStatement pe = con.prepareStatement("UPDATE tractores SET Serie = ?, Modelo = ?, Marca = ?, Departamento = ?, FechaIngreso = ?, FechaBaja = ? WHERE Serie = '"+this.serie+"'");
            pe.setString(1, this.serie);
            pe.setString(2, this.modelo);
            pe.setString(3, this.marca);
            pe.setString(4, this.departamento);
            pe.setString(5, this.fechaingreso);
            pe.setString(6, this.fechabaja);
            
            pe.executeUpdate();
            con.close();
            exito = true;
        } catch (Exception j) {
            JOptionPane.showMessageDialog(null, j.getMessage());
            
        }
        return exito;
    }
    
    @Override
    public boolean registrarbaja() {
        boolean exito = false;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/elpotrero", "root", "");
            PreparedStatement pe = con.prepareStatement("UPDATE tractores SET Serie = ?, Modelo = ?, Marca = ?, Departamento = ?, FechaIngreso = ?, FechaBaja = ? WHERE Serie = '"+this.serie+"'");
            
            pe.setString(1, this.serie);
            pe.setString(2, this.modelo);
            pe.setString(3, this.marca);
            pe.setString(4, this.departamento);
            pe.setString(5, this.fechaingreso);
            pe.setString(6, this.fechabaja);
            
            pe.executeUpdate();
            con.close();
            exito = true;
        } catch (Exception j) {
            JOptionPane.showMessageDialog(null, j.getMessage());
            
        }
        return exito;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getSerieb() {
        return serieb;
    }

    public void setSerieb(String serieb) {
        this.serieb = serieb;
    }

    public String getMarcab() {
        return marcab;
    }

    public void setMarcab(String marcab) {
        this.marcab = marcab;
    }

    public String getModelob() {
        return modelob;
    }

    public void setModelob(String modelob) {
        this.modelob = modelob;
    }

    public String getDepartamentob() {
        return departamentob;
    }

    public void setDepartamentob(String departamentob) {
        this.departamentob = departamentob;
    }

    public String getFechaingresob() {
        return fechaingresob;
    }

    public void setFechaingresob(String fechaingresob) {
        this.fechaingresob = fechaingresob;
    }

    public String getFechabajab() {
        return fechabajab;
    }

    public void setFechabajab(String fechabajab) {
        this.fechabajab = fechabajab;
    }
    
    
}
