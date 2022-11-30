package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Empleado extends Persona{
    int num_empleado;
    long num_segurosocial;
    String CURP,fechaalta, fechabaja;
    float SD, SDI;
    int num_empleadob;
    long num_segurosocialb;
    String CURPb,fechaaltab, fechabajab;
    float SDb, SDIb;

    public Empleado(int num_empleado, long num_segurosocial, String CURP, String fechaalta, String fechabaja, float SD, float SDI, String nombre, String RFC, String correo, String empleado, String domicilio) {
        super(nombre, RFC, correo, empleado, domicilio);
        this.num_empleado = num_empleado;
        this.num_segurosocial = num_segurosocial;
        this.CURP = CURP;
        this.fechaalta = fechaalta;
        this.fechabaja = fechabaja;
        this.SD = SD;
        this.SDI = SDI;
    }

    
    
    @Override
    public boolean buscar(){
        boolean exito = false;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/elpotrero","root", "");
            PreparedStatement pe1 = con.prepareStatement("SELECT * FROM empleado WHERE RFC = '"+this.RFC+"'");
            ResultSet re = pe1.executeQuery();
            if(re.next()){
                
                this.num_empleado = re.getInt("ID");
                this.nombreb = re.getString("Nombre");
                this.RFCb = re.getString("RFC");
                this.CURPb = re.getString("CURP");
                this.correob = re.getString("Correo");
                this.num_segurosocialb = re.getLong("NumSocial");
                this.fechaaltab = re.getString("FechaInicial");
                this.fechabajab = re.getString("FechaFinal");
                this.SDb = re.getFloat("SalarioDiario");
                this.SDIb = re.getFloat("SalarioDI");
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
    
    @Override
    public boolean registrar(){
        boolean exito = false;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/elpotrero","root", "");
            PreparedStatement pe1 = con.prepareStatement("SELECT RFC FROM empleado WHERE RFC = '"+this.RFC+"'");
            ResultSet re = pe1.executeQuery();
            if(re.next()){
                
            }else{
                pe1 = con.prepareStatement("INSERT INTO empleado VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                pe1.setString(1, "0");
                pe1.setString(2, this.nombre);
                pe1.setString(3, this.RFC);
                pe1.setString(4, this.CURP);
                pe1.setString(5, this.correo);
                pe1.setLong(6, this.num_segurosocial);
                pe1.setString(7, this.fechaalta);
                pe1.setString(8, null);
                pe1.setFloat(9, this.SD);
                pe1.setFloat(10, this.SDI);
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
    public boolean modificar(){
        boolean exito = false;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/elpotrero","root", "");
            PreparedStatement pe1 = con.prepareStatement("SELECT RFC FROM empleado WHERE RFC = '"+this.RFC+"'");
            ResultSet re = pe1.executeQuery();
            if(re.next()){
                pe1 = con.prepareStatement("UPDATE empleado SET Nombre = ?, RFC = ?, CURP = ?, Correo = ?, NumSocial = ?, FechaInicial = ?, FechaFinal = ?, SalarioDiario = ?, SalarioDI = ? WHERE RFC = '"+this.RFC+"'");
                pe1.setString(1, this.nombre);
                pe1.setString(2, this.RFC);
                pe1.setString(3, this.CURP);
                pe1.setString(4, this.correo);
                pe1.setLong(5, this.num_segurosocial);
                pe1.setString(6, this.fechaalta);
                if(this.fechabaja.isEmpty()){
                    pe1.setString(7, null);
                }else{
                    pe1.setString(7, this.fechabaja);
                }
                pe1.setFloat(8, this.SD);
                pe1.setFloat(9, this.SDI);
                pe1.executeUpdate();
                con.close();
                exito = true;
            }else{
                
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
    
    public int getNum_empleado() {
        return num_empleado;
    }

    public void setNum_empleado(int num_empleado) {
        this.num_empleado = num_empleado;
    }

    public long getNum_segurosocial() {
        return num_segurosocial;
    }

    public void setNum_segurosocial(long num_segurosocial) {
        this.num_segurosocial = num_segurosocial;
    }

    public String getFechaalta() {
        return fechaalta;
    }

    public void setFechaalta(String fechaalta) {
        this.fechaalta = fechaalta;
    }

    public String getFechabaja() {
        return fechabaja;
    }

    public void setFechabaja(String fechabaja) {
        this.fechabaja = fechabaja;
    }

    public float getSD() {
        return SD;
    }

    public void setSD(float SD) {
        this.SD = SD;
    }

    public float getSDI() {
        return SDI;
    }

    public void setSDI(float SDI) {
        this.SDI = SDI;
    }

    public int getNum_empleadob() {
        return num_empleadob;
    }

    public void setNum_empleadob(int num_empleadob) {
        this.num_empleadob = num_empleadob;
    }

    public long getNum_segurosocialb() {
        return num_segurosocialb;
    }

    public void setNum_segurosocialb(long num_segurosocialb) {
        this.num_segurosocialb = num_segurosocialb;
    }

    public String getFechaaltab() {
        return fechaaltab;
    }

    public void setFechaaltab(String fechaaltab) {
        this.fechaaltab = fechaaltab;
    }

    public String getFechabajab() {
        return fechabajab;
    }

    public void setFechabajab(String fechabajab) {
        this.fechabajab = fechabajab;
    }

    public float getSDb() {
        return SDb;
    }

    public void setSDb(float SDb) {
        this.SDb = SDb;
    }

    public float getSDIb() {
        return SDIb;
    }

    public void setSDIb(float SDIb) {
        this.SDIb = SDIb;
    }

    public String getCURP() {
        return CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    public String getCURPb() {
        return CURPb;
    }

    public void setCURPb(String CURPb) {
        this.CURPb = CURPb;
    }
    
    
}
