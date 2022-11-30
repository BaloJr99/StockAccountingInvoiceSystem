package Menu;

import MisExcepciones.MiExcepcion;
import clases.Equipo;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Equipos extends javax.swing.JFrame {
    
    public Equipos() {
        initComponents();
        this.setLocationRelativeTo(null);
        DCBaja.setDate(null);
        DCBaja.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BtnRegistrarAlta = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnRegresar = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TxtModelo = new javax.swing.JTextField();
        TxtMarca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtUso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        DCIngreso = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        DCBaja = new com.toedter.calendar.JDateChooser();
        TxtBuscar = new javax.swing.JTextField();
        BtnRegistrarBaja = new javax.swing.JButton();
        CBCategoria = new javax.swing.JComboBox<>();
        ChBaja = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Modelo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 94, -1, -1));

        jLabel1.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        jLabel1.setText("EQUIPO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 24, -1, -1));

        BtnRegistrarAlta.setText("REGISTRAR ALTA");
        BtnRegistrarAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarAltaActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegistrarAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 234, -1, -1));

        BtnModificar.setText("MODIFICAR");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 234, -1, -1));

        BtnRegresar.setText("REGRESAR");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 234, -1, -1));

        BtnBuscar.setText("BUSCAR");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 263, 93, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Categoria");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 68, -1, -1));
        jPanel1.add(TxtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 91, 243, -1));
        jPanel1.add(TxtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 117, 243, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Uso");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 146, -1, -1));
        jPanel1.add(TxtUso, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 143, 243, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Marca");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha de Ingreso");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 178, -1, -1));

        DCIngreso.setDateFormatString("yyyy/MM/dd");
        jPanel1.add(DCIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 169, 243, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Fecha de Salida");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 204, -1, -1));

        DCBaja.setDateFormatString("yyyy/MM/dd");
        jPanel1.add(DCBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 198, 243, -1));
        jPanel1.add(TxtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 264, 191, -1));

        BtnRegistrarBaja.setText("REGISTRAR BAJA");
        BtnRegistrarBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarBajaActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegistrarBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 234, -1, -1));

        CBCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..", "Agricultura", "Ganaderia", "Desmonte" }));
        jPanel1.add(CBCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 65, 243, -1));

        ChBaja.setText("Baja");
        ChBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChBajaActionPerformed(evt);
            }
        });
        jPanel1.add(ChBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 263, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rastra-660-landing.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 460, 300));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 505, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void vaciarcampos(){
        TxtBuscar.setText("");
        TxtUso.setText("");
        TxtMarca.setText("");
        TxtModelo.setText("");
        CBCategoria.setSelectedItem(0);
        DCIngreso.setDate(null);
        DCBaja.setDate(null);
    }
    
    public boolean camposvacios(){
        boolean vacios = false;
            try{
            if(CBCategoria.getSelectedIndex() == 0){
               vacios = true;
               throw new MiExcepcion(23);
            }if(TxtModelo.getText().isEmpty()){
               vacios = true;
               throw new MiExcepcion(12);
            }if(TxtMarca.getText().isEmpty()){
               vacios = true;
               throw new MiExcepcion(13);
            }if(TxtUso.getText().isEmpty()){
               vacios = true;
               throw new MiExcepcion(24);
            }if(DCIngreso.getDate() == null){
               vacios = true;
               throw new MiExcepcion(15);
            }
        }catch(MiExcepcion me){
            JOptionPane.showMessageDialog(this, me.getMessage());
        }
        return vacios;
    }
    
    public String campomultiple(){
        String opcion = "";
        switch (CBCategoria.getSelectedIndex()) {
            case 1:
                opcion = "Agricultura";
                break;
            case 2:
                opcion = "Ganaderia";
                break;
            case 3:
                opcion = "Desmontes";
                break;
            default:
                break;
        }
        return opcion;
    }
    
    public boolean registrosvacios(){
        boolean vacio = false;
        try{
            if(CBCategoria.getSelectedIndex() == 0||TxtModelo.getText().isEmpty()||TxtMarca.getText().isEmpty()||TxtUso.getText().isEmpty()||DCIngreso.getDate() == null){
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
                CBCategoria.setEnabled(false);
                TxtMarca.setEnabled(false);
                TxtModelo.setEnabled(false);
                TxtUso.setEnabled(false);
                DCIngreso.setEnabled(false);
                DCBaja.setEnabled(true);
                break;
            case 2:
                CBCategoria.setEnabled(true);
                CBCategoria.setSelectedIndex(1);
                TxtMarca.setEnabled(true);
                TxtMarca.setText("");
                TxtModelo.setEnabled(true);
                TxtModelo.setText("");
                TxtUso.setEnabled(true);
                TxtUso.setText("");
                DCIngreso.setEnabled(true);
                DCIngreso.setDate(null);
                DCBaja.setEnabled(false);
                DCBaja.setDate(null);
                break;
        }
    }
    
    private void BtnRegistrarAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarAltaActionPerformed
       if(camposvacios() == false){
            try {
               Equipo equipo = new Equipo(campomultiple(), TxtModelo.getText(), TxtMarca.getText(), TxtUso.getText(), ((JTextField)DCIngreso.getDateEditor().getUiComponent()).getText(), ((JTextField)DCBaja.getDateEditor().getUiComponent()).getText());
               if(equipo.registraralta() == false){
                   throw new MiExcepcion(25);
               }
               JOptionPane.showMessageDialog(this, "Registro exitoso");
               vaciarcampos();
           }catch (MiExcepcion me){
               JOptionPane.showMessageDialog(this, me.getMessage());
           }catch (Exception e) {
               JOptionPane.showMessageDialog(this, e.getMessage());
           }
       }
    }//GEN-LAST:event_BtnRegistrarAltaActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        if(registrosvacios() == false){
            try {
                Equipo equipo = new Equipo(campomultiple(), TxtModelo.getText(), TxtMarca.getText(), TxtUso.getText(), ((JTextField)DCIngreso.getDateEditor().getUiComponent()).getText(), null);
               if(equipo.modificar() == false){
                   throw new MiExcepcion(21);
               }
               JOptionPane.showMessageDialog(this, "Modificacion exitosa");
               vaciarcampos();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        MenuPrincipal menup = new MenuPrincipal();
        this.dispose();
        menup.setVisible(true);
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        try {
            if(TxtBuscar.getText().isEmpty()){
                throw new MiExcepcion(27);
            }
            
            Equipo equipo = new Equipo(campomultiple(), TxtBuscar.getText(), TxtMarca.getText(), TxtUso.getText(), ((JTextField)DCIngreso.getDateEditor().getUiComponent()).getText(), ((JTextField)DCBaja.getDateEditor().getUiComponent()).getText());
            if(equipo.buscar() == false){
                throw new MiExcepcion(26);
            }
            if("Agricultura".equals(equipo.getCategoriab())){
                CBCategoria.setSelectedIndex(1);
            }else if("Ganaderia".equals(equipo.getCategoriab())){
                CBCategoria.setSelectedIndex(2);
            }else if("Desmontes".equals(equipo.getCategoriab())){
                CBCategoria.setSelectedIndex(3);
            }
            TxtMarca.setText(equipo.getMarcab());
            TxtModelo.setText(equipo.getModelob());
            TxtUso.setText(equipo.getUsob());
            
            SimpleDateFormat convstring = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat convfecha = new SimpleDateFormat("yyyy/MM/dd");
            Date ingresoant1 = convstring.parse(equipo.getFechaingresob());
            String ingresoant2 = convfecha.format(ingresoant1);
            Date fechaingreso = convfecha.parse(ingresoant2);
            DCIngreso.setDate(fechaingreso);
            
            if(equipo.getFechabajab() == null){
                
            }else{
                Date baja1 = convstring.parse(equipo.getFechabajab());
                String baja2 = convfecha.format(baja1);
                Date fechabaja = convfecha.parse(baja2);
                DCBaja.setDate(fechabaja);   
            }
            
            JOptionPane.showMessageDialog(this, "Busqueda exitosa");
               
        }catch (MiExcepcion me){
            JOptionPane.showMessageDialog(this, me.getMessage());
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnRegistrarBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarBajaActionPerformed
        if(ChBaja.isSelected()){
            JOptionPane.showMessageDialog(this, "Esta dando de baja");
        }else{
            if(registrosvacios() == false){
                try {
                   Equipo equipo = new Equipo(campomultiple(), TxtModelo.getText(), TxtMarca.getText(), TxtUso.getText(), ((JTextField)DCIngreso.getDateEditor().getUiComponent()).getText(), null);
                   if(equipo.registrarbaja() == false){
                       throw new MiExcepcion(22);
                   }
                   JOptionPane.showMessageDialog(this, "Baja exitosa");
                   vaciarcampos();
               }catch (MiExcepcion me){
                   JOptionPane.showMessageDialog(this, me.getMessage());
               }catch (Exception e) {
                   JOptionPane.showMessageDialog(this, e.getMessage());
               }
            }
        }
    }//GEN-LAST:event_BtnRegistrarBajaActionPerformed

    private void ChBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChBajaActionPerformed
        if(ChBaja.isSelected()){
            activar(1);
        }else{
            activar(2);
        }
    }//GEN-LAST:event_ChBajaActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Equipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Equipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Equipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Equipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Equipos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnRegistrarAlta;
    private javax.swing.JButton BtnRegistrarBaja;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JComboBox<String> CBCategoria;
    private javax.swing.JCheckBox ChBaja;
    private com.toedter.calendar.JDateChooser DCBaja;
    private com.toedter.calendar.JDateChooser DCIngreso;
    private javax.swing.JTextField TxtBuscar;
    private javax.swing.JTextField TxtMarca;
    private javax.swing.JTextField TxtModelo;
    private javax.swing.JTextField TxtUso;
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
