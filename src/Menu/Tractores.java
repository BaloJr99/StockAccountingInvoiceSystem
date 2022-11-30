package Menu;

import clases.Tractor;
import javax.swing.JTextField;
import MisExcepciones.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Tractores extends javax.swing.JFrame {
    public Tractores() {
        initComponents();
        this.setLocationRelativeTo(null);
        DCBaja.setDate(null);
        DCBaja.setEnabled(false);
    }
      
    public void vaciarcampos(){
        TxtBuscar.setText("");
        TxtSerie.setText("");
        TxtMarca.setText("");
        TxtModelo.setText("");
        TxtDepartamento.setText("");
        DCIngreso.setDate(null);
        DCBaja.setDate(null);
    }
    
    public boolean camposvacios(){
        boolean vacio = false;
        try{
            if(TxtSerie.getText().isEmpty()){
               vacio = true;
               throw new MiExcepcion(11);
            }if(TxtModelo.getText().isEmpty()){
               vacio = true;
               throw new MiExcepcion(12);
            }if(TxtMarca.getText().isEmpty()){
               vacio = true;
               throw new MiExcepcion(13);
            }if(TxtDepartamento.getText().isEmpty()){
               vacio = true;
               throw new MiExcepcion(14);
            }if(DCIngreso.getDate() == null){
               vacio = true;
               throw new MiExcepcion(15);
            }
        }catch(MiExcepcion me){
            JOptionPane.showMessageDialog(this, me.getMessage());
        }
        return vacio;
    }
    
    public boolean registrosvacios(){
        boolean vacio = false;
        try{
            if(TxtSerie.getText().isEmpty()||TxtModelo.getText().isEmpty()||TxtMarca.getText().isEmpty()||TxtDepartamento.getText().isEmpty()||DCIngreso.getDate() == null){
                vacio = true;
                throw new MiExcepcion(18);
            }
        }catch(MiExcepcion me){
            JOptionPane.showMessageDialog(this, me.getMessage());
        }
        return vacio;
    }
    
    public void activar(int num){
        switch(num){
            case 1:
                TxtSerie.setEnabled(false);
                TxtMarca.setEnabled(false);
                TxtModelo.setEnabled(false);
                TxtDepartamento.setEnabled(false);
                DCIngreso.setEnabled(false);
                DCBaja.setEnabled(true);
                break;
            case 2:
                TxtSerie.setEnabled(true);
                TxtMarca.setEnabled(true);
                TxtModelo.setEnabled(true);
                TxtDepartamento.setEnabled(true);
                DCIngreso.setEnabled(true);
                DCBaja.setEnabled(false);
                vaciarcampos();
                break;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        TxtSerie = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BtnRegistrarAlta = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnRegresar = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TxtModelo = new javax.swing.JTextField();
        TxtMarca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtDepartamento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        DCIngreso = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        DCBaja = new com.toedter.calendar.JDateChooser();
        TxtBuscar = new javax.swing.JTextField();
        BtnRegistrarBaja = new javax.swing.JButton();
        ChBaja = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel3.setText("Modelo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 94, -1, -1));

        TxtSerie.setToolTipText("");
        jPanel1.add(TxtSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 65, 243, -1));

        jLabel1.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        jLabel1.setText("TRACTORES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        BtnRegistrarAlta.setText("REGISTRAR ALTA");
        BtnRegistrarAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarAltaActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegistrarAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 270, -1, -1));

        BtnModificar.setText("MODIFICAR");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 270, -1, -1));

        BtnRegresar.setText("REGRESAR");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, -1));

        BtnBuscar.setText("BUSCAR");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 299, 93, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel2.setText("Serie");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 68, -1, -1));
        jPanel1.add(TxtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 91, 243, -1));
        jPanel1.add(TxtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 117, 243, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Departamento");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 146, -1, -1));
        jPanel1.add(TxtDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 143, 243, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Marca");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha de Ingreso");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 178, -1, -1));

        DCIngreso.setDateFormatString("yyyy/MM/dd");
        jPanel1.add(DCIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 169, 243, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha de Salida");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 204, -1, -1));

        DCBaja.setToolTipText("No disponible hasta dar de baja");
        DCBaja.setDateFormatString("yyyy/MM/dd");
        jPanel1.add(DCBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 198, 243, -1));

        TxtBuscar.setToolTipText("Serie");
        jPanel1.add(TxtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 300, 191, -1));

        BtnRegistrarBaja.setText("REGISTRAR BAJA");
        BtnRegistrarBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarBajaActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegistrarBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        ChBaja.setText("Baja");
        ChBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChBajaActionPerformed(evt);
            }
        });
        jPanel1.add(ChBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 299, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tractor_PNG16109.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 500, 330));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegistrarAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarAltaActionPerformed
       if(camposvacios() == false){
           try {
               Tractor tractor = new Tractor(TxtModelo.getText(), ((JTextField)DCIngreso.getDateEditor().getUiComponent()).getText(), null, TxtMarca.getText(), TxtSerie.getText(), TxtDepartamento.getText());
           if(tractor.registraralta() == false){
               throw new MiExcepcion(20);
           }
           JOptionPane.showMessageDialog(this, "Registro exitoso");
           vaciarcampos();
           }catch(MiExcepcion mi){
               JOptionPane.showMessageDialog(this, mi.getMessage());
           }catch(Exception e){
               JOptionPane.showMessageDialog(this, e.getMessage());
        }
       }
    }//GEN-LAST:event_BtnRegistrarAltaActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
         
        try{
            if(TxtBuscar.getText().isEmpty()){
                throw new MiExcepcion(18);
            }
            
            Tractor tractor = new Tractor(TxtModelo.getText(), ((JTextField)DCIngreso.getDateEditor().getUiComponent()).getText(), ((JTextField)DCBaja.getDateEditor().getUiComponent()).getText(), TxtMarca.getText(), TxtBuscar.getText(), TxtDepartamento.getText());
            if(tractor.Buscar() == false){
                throw new MiExcepcion(19);
            }
            TxtSerie.setText(tractor.getSerieb());
            TxtModelo.setText(tractor.getModelob());
            TxtMarca.setText(tractor.getMarcab());
            TxtDepartamento.setText(tractor.getDepartamentob());
            
            SimpleDateFormat convstring =new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat confecha =new SimpleDateFormat("yyyy/MM/dd");
            Date convingreso = convstring.parse(tractor.getFechaingresob());
            String prueba = confecha.format(convingreso);
            Date fechaingreso = confecha.parse(prueba);
            DCIngreso.setDate(fechaingreso);
            
            if(tractor.getFechabajab() == null){
                
            }else{
               Date convbaja = convstring.parse(tractor.getFechabajab());
               String prueba2 = confecha.format(convbaja);
               Date fechabaja = confecha.parse(prueba2);
               DCBaja.setDate(fechabaja);   
            }
            
            JOptionPane.showMessageDialog(this, "Registro encontrado");
        }catch(MiExcepcion me){
            JOptionPane.showMessageDialog(this, me.getMessage());
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnRegistrarBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarBajaActionPerformed
        if(ChBaja.isSelected()){
            JOptionPane.showMessageDialog(this, "Esta dando de baja");
        }else{
            if(registrosvacios() == false){
                try{
                Tractor tractor = new Tractor(TxtModelo.getText(), ((JTextField)DCIngreso.getDateEditor().getUiComponent()).getText(), ((JTextField)DCBaja.getDateEditor().getUiComponent()).getText(), TxtMarca.getText(), TxtSerie.getText(), TxtDepartamento.getText());

                if(tractor.registrarbaja() == false){
                    throw new MiExcepcion(22);
                }        

                JOptionPane.showMessageDialog(this, "Baja exitosa");
                vaciarcampos();
                }catch(MiExcepcion me){
                    JOptionPane.showMessageDialog(this, me.getMessage());
                }catch(Exception e){
                    JOptionPane.showMessageDialog(this, e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_BtnRegistrarBajaActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        MenuPrincipal menup = new MenuPrincipal();
        this.dispose();
        menup.setVisible(true);
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        
        if(registrosvacios() == false){
            try{
            if(TxtSerie.getText().isEmpty()){
                throw new MiExcepcion(18);
            }
            Tractor tractor = new Tractor(TxtModelo.getText(), ((JTextField)DCIngreso.getDateEditor().getUiComponent()).getText(), ((JTextField)DCBaja.getDateEditor().getUiComponent()).getText(), TxtMarca.getText(), TxtSerie.getText(), TxtDepartamento.getText());
            if(tractor.modificar()== false){
                throw new MiExcepcion(21);
            }
            JOptionPane.showMessageDialog(this, "Modificacion exitosa");
            vaciarcampos();
            }catch(MiExcepcion me){
                JOptionPane.showMessageDialog(this, me.getMessage());
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void ChBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChBajaActionPerformed
        if(ChBaja.isSelected()){
            activar(1);
        }else{
            activar(2);
        }
    }//GEN-LAST:event_ChBajaActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tractores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tractores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tractores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tractores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tractores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnRegistrarAlta;
    private javax.swing.JButton BtnRegistrarBaja;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JCheckBox ChBaja;
    private com.toedter.calendar.JDateChooser DCBaja;
    private com.toedter.calendar.JDateChooser DCIngreso;
    private javax.swing.JTextField TxtBuscar;
    private javax.swing.JTextField TxtDepartamento;
    private javax.swing.JTextField TxtMarca;
    private javax.swing.JTextField TxtModelo;
    private javax.swing.JTextField TxtSerie;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
