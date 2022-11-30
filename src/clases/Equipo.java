package clases;

import InterfazAbstracta.Registros;
import InterfazAbstracta.Vehiculo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Equipo extends Vehiculo implements Registros{
    private String categoria, uso, categoriab, usob, modelob, fechaingresob, fechabajab, marcab;

    public Equipo(String categoria, String modelo, String marca, String uso, String fechaingreso, String fechabaja) {
        super(modelo, fechaingreso, fechabaja, marca);
        this.categoria = categoria;
        this.uso = uso;
    }
    
    public boolean buscar(){
        boolean exito = false;
        
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/elpotrero","root","");
            PreparedStatement pe = con.prepareStatement("SELECT * FROM equipo WHERE Modelo = '"+this.modelo+"'");
            ResultSet re = pe.executeQuery();
            
            if(re.next()){
                this.categoriab = re.getString("Categoria");
                this.usob = re.getString("Uso");
                this.marcab = re.getString("Marca");
                this.modelob = re.getString("Modelo");
                this.fechaingresob = re.getString("FechaIngreso");
                this.fechabajab = re.getString("FechaBaja");
                
                con.close();
                exito = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return exito;
    }
    
    @Override
    public boolean registraralta() {
        boolean exito = false;
        
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/elpotrero","root","");
            PreparedStatement pe = con.prepareStatement("SELECT Modelo FROM equipo WHERE Modelo = '"+this.modelo+"'");
            ResultSet re = pe.executeQuery();
            
            if(re.next()){
                
            }else{
                pe = con.prepareStatement("INSERT INTO equipo VALUES (?, ?, ?, ?, ?, ?)");
                pe.setString(1, this.categoria);
                pe.setString(2, this.modelo);
                pe.setString(3, this.marca);
                pe.setString(4, this.uso);
                pe.setString(5, this.fechaingreso);
                pe.setString(6, null);
            
                pe.executeUpdate();
                exito = true;
                con.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return exito;
    }

    @Override
    public boolean registrarbaja() {
        boolean exito = false;
        
        try {
            Connection con  =  DriverManager.getConnection("jdbc:mysql://localhost/elpotrero", "root", "");
            PreparedStatement pe = con.prepareStatement("UPDATE equipo SET Categoria = ?, Modelo = ?, Marca = ?, Uso = ?, FechaIngreso = ?, FechaBaja = ? WHERE Modelo = '"+this.modelo+"'");
            
            pe.setString(1, this.categoria);
            pe.setString(2, this.modelo);
            pe.setString(3, this.marca);
            pe.setString(4, this.uso);
            pe.setString(5, this.fechaingreso);
            pe.setString(6, this.fechabaja);
            
            pe.executeUpdate();
            con.close();
            exito = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return exito;
    }

    @Override
    public boolean modificar() {
        boolean exito = false;
        
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/elpotrero","root","");
            PreparedStatement pe = con.prepareStatement("UPDATE equipo SET Categoria = ?, Modelo = ?, Marca = ?, Uso = ?, FechaIngreso = ?, FechaBaja = ? WHERE Modelo = '"+this.modelo+"'");
            
            pe.setString(1, this.categoria);
            pe.setString(2, this.modelo);
            pe.setString(3, this.marca);
            pe.setString(4, this.uso);
            pe.setString(5, this.fechaingreso);
            pe.setString(6, this.fechabaja);
            
            pe.executeUpdate();
            con.close();
            exito = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return exito;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public String getCategoriab() {
        return categoriab;
    }

    public void setCategoriab(String categoriab) {
        this.categoriab = categoriab;
    }

    public String getUsob() {
        return usob;
    }

    public void setUsob(String usob) {
        this.usob = usob;
    }

    public String getModelob() {
        return modelob;
    }

    public void setModelob(String modelob) {
        this.modelob = modelob;
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

    public String getMarcab() {
        return marcab;
    }

    public void setMarcab(String marcab) {
        this.marcab = marcab;
    }
    
    
}
