package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Nomina extends Empleado{
    String fechainicial, fechafinal, tipodato, descripcion;
    Float gravado, excento, total;

    public Nomina(String fechainicial, String fechafinal, String tipodato, String descripcion, Float gravado, Float excento, Float total, int num_empleado, long num_segurosocial, String CURP, String fechaalta, String fechabaja, float SD, float SDI, String nombre, String RFC, String correo, String empleado, String domicilio) {
        super(num_empleado, num_segurosocial, CURP, fechaalta, fechabaja, SD, SDI, nombre, RFC, correo, empleado, domicilio);
        this.fechainicial = fechainicial;
        this.fechafinal = fechafinal;
        this.tipodato = tipodato;
        this.descripcion = descripcion;
        this.gravado = gravado;
        this.excento = excento;
        this.total = total;
    }
    
    public String[] captarRFC(){
        String[] TodoRFC = new String[0];
        int j = 0;
        int totalfilas = 0;
        
        try {
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/elpotrero", "root", "");
            PreparedStatement pe = con.prepareStatement("SELECT * FROM empleado");
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
    
    public int ultimofolio(){
        int folioultimo = 0;
        
        try {
            Connection con  = DriverManager.getConnection("jdbc:mysql://localhost/elpotrero", "root", "");
            PreparedStatement pe = con.prepareStatement("SELECT Folio FROM nominas ORDER BY Folio DESC LIMIT 1");
            
            ResultSet re = pe.executeQuery();
            
            if(re.next()){
                folioultimo = re.getInt("Folio");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        return folioultimo;
    }
    
    public ArrayList<Nomina> nominaprincipal(){
        ArrayList<Nomina> nominas = new ArrayList<>();
        try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/elpotrero", "root", "");
                PreparedStatement pe = con.prepareStatement("SELECT * FROM nominas WHERE RFC = '"+this.RFC+"'");
                ResultSet re = pe.executeQuery();
                Nomina nomina;
                while(re.next()){
                    nomina = new Nomina(re.getString("FechaInicio"), re.getString("FechaFinal"), re.getString("TipoDatos"), re.getString("Descripcion"), re.getFloat("Gravado"), re.getFloat("Exento"), re.getFloat("Total"), re.getInt("ID"), re.getLong("NumSocial"), re.getString("CURP"), "", "", re.getFloat("SalarioDiario"), re.getFloat("SalarioDI"), re.getString("Nombre"), re.getString("RFC"), "", "", re.getString("Estado"));
                    nominas.add(nomina);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        return nominas;
    }
    
    public ArrayList<Nomina> nominasecundaria(String folio){
        ArrayList<Nomina> nominas = new ArrayList<>();
        try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/elpotrero", "root", "");
                PreparedStatement pe = con.prepareStatement("SELECT * FROM nominas WHERE Folio = '"+folio+"'");
                ResultSet re = pe.executeQuery();
                Nomina nomina;
                while(re.next()){
                    nomina = new Nomina(re.getString("FechaInicio"), re.getString("FechaFinal"), re.getString("TipoDatos"), re.getString("Descripcion"), re.getFloat("Gravado"), re.getFloat("Exento"), re.getFloat("Total"), re.getInt("NumeroEmpleado"), 0, re.getString("CURP"), "", "", re.getFloat("SD"), re.getFloat("SDI"), re.getString("Nombre"), re.getString("RFC"), "", "", re.getString("Estado"));
                    nominas.add(nomina);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        return nominas;
    }
    
    public ArrayList<Nomina> cargaDatos(){
        ArrayList<Nomina> nominas = new ArrayList<>();
        try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/elpotrero", "root", "");
                PreparedStatement pe = con.prepareStatement("SELECT * FROM empleado WHERE RFC = '"+this.RFC+"'");
                ResultSet re = pe.executeQuery();
                Nomina nomina;
                while(re.next()){
                    nomina = new Nomina("", "", "", "", 0f, 0f, 0f, re.getInt("ID"), re.getLong("NumSocial"), re.getString("CURP"), "", "", re.getFloat("SalarioDiario"), re.getFloat("SalarioDI"), re.getString("Nombre"), "", "", "", "");
                    nominas.add(nomina);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        return nominas;
    }
    
    public boolean agregar(int folio){
        boolean exito = false;
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/elpotrero", "root", "");
                PreparedStatement pe = con.prepareStatement("INSERT INTO nominas VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                pe.setInt(1, folio);
                pe.setInt(2, this.num_empleado);
                pe.setString(3, this.nombre);
                pe.setString(4, this.RFC);
                pe.setString(5, this.CURP);
                pe.setString(6, this.fechainicial);
                pe.setString(7, this.fechafinal);
                pe.setFloat(8, this.SD);
                pe.setFloat(9, this.SDI);
                pe.setString(10, this.tipodato);
                pe.setString(11, this.descripcion);
                pe.setFloat(12, this.gravado);
                pe.setFloat(13, this.excento);
                pe.setFloat(14, this.total);
                pe.setString(15, null);
                
                pe.executeUpdate();
                con.close();
                
                exito = true;
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        return exito;
    }

    public boolean modificar(int folio, String Descripcion, String Gravado, String Exento){
        boolean exito = false;
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/elpotrero", "root", "");
                PreparedStatement pe = con.prepareStatement("UPDATE nominas SET TipoDatos = ?, Descripcion = ?, Gravado = ?, Exento = ?, Total = ? WHERE Folio = '"+folio+"' AND Descripcion = '"+Descripcion+"' AND Gravado = '"+Gravado+"' AND Exento = '"+Exento+"'");
                pe.setString(1, this.tipodato);
                pe.setString(2, this.descripcion);
                pe.setFloat(3, this.gravado);
                pe.setFloat(4, this.excento);
                pe.setFloat(5, this.total);
                pe.executeUpdate();
                con.close();
                
                exito = true;
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        return exito;
    }
    
    public boolean eliminar(int folio, String Descripcion, String Gravado, String Exento){
        boolean exito = false;
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/elpotrero", "root", "");
                PreparedStatement pe = con.prepareStatement("DELETE FROM nominas WHERE Folio = '"+folio+"' AND Descripcion = '"+Descripcion+"' AND Gravado = '"+Gravado+"' AND Exento = '"+Exento+"'");
                pe.executeUpdate();
                con.close();
                
                exito = true;
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        return exito;
    }
    
    public float total(int folio){
        float totalgeneral = 0;
        
        try {
            Connection con  = DriverManager.getConnection("jdbc:mysql://localhost/elpotrero", "root", "");
            PreparedStatement pe = con.prepareStatement("SELECT Total FROM nominas WHERE Folio = '"+folio+"'");
            ResultSet re = pe.executeQuery();
            
            while(re.next()){
                totalgeneral = totalgeneral +  re.getFloat("Total");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        return totalgeneral;
    }

    public boolean buscar(int folio){
        boolean exito = false;
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/elpotrero", "root", "");
                PreparedStatement pe = con.prepareStatement("SELECT * FROM nominas WHERE Folio = '"+folio+"'");
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
                PreparedStatement pe = con.prepareStatement("UPDATE SET Estado = 'Vigente' WHERE Folio = '"+folio+"'");
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
    
    public String getFechainicial() {
        return fechainicial;
    }

    public void setFechainicial(String fechainicial) {
        this.fechainicial = fechainicial;
    }

    public String getFechafinal() {
        return fechafinal;
    }

    public void setFechafinal(String fechafinal) {
        this.fechafinal = fechafinal;
    }

    public String getTipodato() {
        return tipodato;
    }

    public void setTipodato(String tipodato) {
        this.tipodato = tipodato;
    }

    public Float getGravado() {
        return gravado;
    }

    public void setGravado(Float gravado) {
        this.gravado = gravado;
    }

    public Float getExcento() {
        return excento;
    }

    public void setExcento(Float excento) {
        this.excento = excento;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }    
}
