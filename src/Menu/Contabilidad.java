package Menu;

import clases.*;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import MisExcepciones.MiExcepcion;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Contabilidad extends javax.swing.JFrame {
    Cuenta cuenta =  new Cuenta(0, "");
    Conta conta;
    ArrayList<Cuenta> cuentas;
    
    public boolean camposvacios(){
        boolean exito = true;
        try {
            if(DCFecha.getDate() == null){
                exito = false;
                throw new MiExcepcion(66);
            }if("0".equals(TxtNumPoliza.getText())){
                exito = false;
                throw new MiExcepcion(67);
            }if(TxtDescripcion.getText().trim().isEmpty()){
                exito = false;
                throw new MiExcepcion(47);
            }if(CBCuentas.getSelectedIndex() == 0){
                exito = false;
                throw new MiExcepcion(68);
            }if(TxtDebe.getText().trim().isEmpty()||TxtHaber.getText().trim().isEmpty()){
                exito = false;
                throw new MiExcepcion(69);
            }
        } catch (MiExcepcion mi) {
            JOptionPane.showMessageDialog(this, mi.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        return exito;
    }
    
    public void vaciarcampos(){
        CBCuentas.setSelectedIndex(0);
        TxtDebe.setText("0");
        TxtHaber.setText("0");
        
    }
    
    public Contabilidad() {
        initComponents();
        this.setLocationRelativeTo(null);
        LblNombreCuenta.setEnabled(false);
        DefaultComboBoxModel cb = new DefaultComboBoxModel();
        cb.addElement("Seleccione...");
        CBCuentas.setModel(cb);
        cuentas = cuenta.GuardarCuentas();
        for(Cuenta combo: cuentas){
            CBCuentas.addItem(String.valueOf(combo.getNumcuenta()));
        }
        DCFecha.setDate(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        DCFecha = new com.toedter.calendar.JDateChooser();
        TxtNumPoliza = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TConta = new javax.swing.JTable();
        TxtDescripcion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtDebe = new javax.swing.JTextField();
        TxtHaber = new javax.swing.JTextField();
        BtnAgregar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnRegresar = new javax.swing.JButton();
        TxtBuscar = new javax.swing.JTextField();
        BtnBuscar = new javax.swing.JButton();
        LblNombreCuenta = new javax.swing.JLabel();
        BtnCuentas = new javax.swing.JButton();
        CBCuentas = new javax.swing.JComboBox<>();
        BtnNuevo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DCFecha.setDateFormatString("yyyy/MM/dd");
        jPanel1.add(DCFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 53, 154, -1));

        TxtNumPoliza.setText("0");
        TxtNumPoliza.setToolTipText("# póliza");
        TxtNumPoliza.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtNumPolizaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtNumPolizaFocusLost(evt);
            }
        });
        TxtNumPoliza.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNumPolizaKeyTyped(evt);
            }
        });
        jPanel1.add(TxtNumPoliza, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 53, 39, -1));

        TConta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cuenta", "Nombre de Cuenta", "Debe", "Haber"
            }
        ));
        TConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TContaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TConta);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 91, 509, 255));

        TxtDescripcion.setToolTipText("Descripcion");
        jPanel1.add(TxtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 53, 644, -1));

        jLabel1.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel1.setText("CONTABILIDAD");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 9, -1, -1));

        jLabel2.setText("Cuenta");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 94, -1, -1));

        jLabel3.setText("Debe ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 158, -1, -1));

        jLabel4.setText("Haber");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 198, -1, -1));

        TxtDebe.setText("0.00");
        TxtDebe.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtDebeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtDebeFocusLost(evt);
            }
        });
        TxtDebe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtDebeKeyTyped(evt);
            }
        });
        jPanel1.add(TxtDebe, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 155, 135, -1));

        TxtHaber.setText("0.00");
        TxtHaber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtHaberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtHaberFocusLost(evt);
            }
        });
        TxtHaber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtHaberKeyTyped(evt);
            }
        });
        jPanel1.add(TxtHaber, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 195, 135, -1));

        BtnAgregar.setText("AGREGAR");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 250, -1, -1));

        BtnEliminar.setText("ELIMINAR");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        BtnRegresar.setText("REGRESAR");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 329, -1, -1));

        TxtBuscar.setToolTipText("# Póliza");
        jPanel1.add(TxtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 84, -1));

        BtnBuscar.setText("BUSCAR");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));
        jPanel1.add(LblNombreCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 122, 235, 20));

        BtnCuentas.setText("CUENTAS");
        BtnCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCuentasActionPerformed(evt);
            }
        });
        jPanel1.add(BtnCuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, -1, -1));

        CBCuentas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));
        CBCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBCuentasActionPerformed(evt);
            }
        });
        jPanel1.add(CBCuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 91, 235, -1));

        BtnNuevo.setText("POLIZA NUEVA");
        BtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(BtnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 250, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guy.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 390, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void conta(){
        int defaults;
        if(CBCuentas.getSelectedIndex() == 0){
            defaults = 0;
        }else{
            defaults = Integer.valueOf(CBCuentas.getSelectedItem().toString());
        }
        conta = new Conta(Integer.valueOf(TxtNumPoliza.getText()), defaults, LblNombreCuenta.getText(), TxtDescripcion.getText(), ((JTextField)DCFecha.getDateEditor().getUiComponent()).getText(), Float.valueOf(TxtDebe.getText()), Float.valueOf(TxtHaber.getText()));
    }
    
    public void conta1(){
        conta = new Conta(Integer.valueOf(TxtBuscar.getText()));
    }
    
    public void llenartabla(){
        if(TxtBuscar.getText().trim().isEmpty()){
            conta();
        }else{
            conta1();    
        }
        ArrayList<Conta> contabilidad;
        DefaultTableModel modelo = (DefaultTableModel) TConta.getModel();
        Object[] datosllenado = new Object[4];
        contabilidad = conta.conta();
        modelo.setNumRows(0);
        
        for(Conta con: contabilidad){
            datosllenado[0] = con.getCuenta();
            datosllenado[1] = con.getNomcuenta();
            datosllenado[2] = con.getDebe();
            datosllenado[3] = con.getHaber();
            modelo.addRow(datosllenado);
        }
    }
    
    private void CBCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBCuentasActionPerformed
        if(CBCuentas.getSelectedIndex() == 0){
            LblNombreCuenta.setText("");
        }else{
            cuentas = cuenta.GuardarCuentas();
            for(Cuenta combo: cuentas){
                if(combo.getNumcuenta() == Integer.valueOf(CBCuentas.getSelectedItem().toString())){
                    LblNombreCuenta.setText(combo.getNombrecuenta());
                }
            }
        }
    }//GEN-LAST:event_CBCuentasActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        try {
            if(camposvacios() == false){

            }else{
                DCFecha.setEnabled(false);
                TxtNumPoliza.setEnabled(false);
                TxtDescripcion.setEnabled(false);
                conta();
            
                if(conta.agregar() == false){
                    throw new MiExcepcion(34);
                }else{
                    llenartabla();
                    vaciarcampos();
                }
            }
        } catch (MiExcepcion mi) {
            JOptionPane.showMessageDialog(this, mi.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void TxtDebeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtDebeFocusGained
        if("0.00".equals(TxtDebe.getText())){
            TxtDebe.setText("");
        }
    }//GEN-LAST:event_TxtDebeFocusGained

    private void TxtDebeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtDebeFocusLost
        if(TxtDebe.getText().trim().isEmpty()){
            TxtDebe.setText("0.00");
        }
    }//GEN-LAST:event_TxtDebeFocusLost

    private void TxtHaberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtHaberFocusGained
        if("0.00".equals(TxtHaber.getText())){
            TxtHaber.setText("");
        }
    }//GEN-LAST:event_TxtHaberFocusGained

    private void TxtHaberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtHaberFocusLost
        if(TxtHaber.getText().trim().isEmpty()){
            TxtHaber.setText("0.00");
        }
    }//GEN-LAST:event_TxtHaberFocusLost

    private void TxtDebeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtDebeKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            evt.consume();
        }
    }//GEN-LAST:event_TxtDebeKeyTyped

    private void TxtHaberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtHaberKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            evt.consume();
        }
    }//GEN-LAST:event_TxtHaberKeyTyped

    private void BtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoActionPerformed
        vaciarcampos();
        DCFecha.setDate(null);
        TxtNumPoliza.setText("");
        TxtDescripcion.setText("");
        DefaultTableModel dc = (DefaultTableModel) TConta.getModel();
        dc.setNumRows(0);
        TConta.setModel(dc);
    }//GEN-LAST:event_BtnNuevoActionPerformed

    private void TxtNumPolizaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumPolizaKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            evt.consume();
        }
    }//GEN-LAST:event_TxtNumPolizaKeyTyped

    private void TxtNumPolizaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtNumPolizaFocusGained
        if("0".equals(TxtNumPoliza.getText())){
            TxtNumPoliza.setText("");
        }
    }//GEN-LAST:event_TxtNumPolizaFocusGained

    private void TxtNumPolizaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtNumPolizaFocusLost
        if(TxtNumPoliza.getText().trim().isEmpty()){
            TxtNumPoliza.setText("0");
        }
    }//GEN-LAST:event_TxtNumPolizaFocusLost

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        try {
            if(camposvacios() == false){

            }else{
                conta();
                
                if(conta.eliminar(Integer.valueOf(CBCuentas.getSelectedItem().toString()))== false){
                    throw new MiExcepcion(70);
                }else{
                    llenartabla();
                    vaciarcampos();
                }
            }
        } catch (MiExcepcion mi) {
            JOptionPane.showMessageDialog(this, mi.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void TContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TContaMouseClicked
        int filaseccionada = TConta.getSelectedRow();
        CBCuentas.setSelectedItem(TConta.getValueAt(filaseccionada, 0));
        TxtDebe.setText(TConta.getValueAt(filaseccionada, 1).toString());
        TxtNumPoliza.setText(TConta.getValueAt(filaseccionada, 2).toString());
    }//GEN-LAST:event_TContaMouseClicked

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        try {
            conta1();  
            if(conta.buscar() == false){
                throw new MiExcepcion(55);
            }else{
            DCFecha.setEnabled(false);
            TxtNumPoliza.setEnabled(false);
            TxtDescripcion.setEnabled(false);
            llenartabla();
            ArrayList<Conta> contabilidad;
            contabilidad = conta.conta();

            for(Conta con: contabilidad){
                TxtNumPoliza.setText(String.valueOf(con.getNumPoliza()));
                TxtDescripcion.setText(con.getDescripcion());
                SimpleDateFormat conversor = new SimpleDateFormat("yyyy-MM-dd");
                SimpleDateFormat conversor2 = new SimpleDateFormat("yyyy/MM/dd");
                Date fecha =  conversor.parse(con.getFecha());
                String fecha1 = conversor2.format(fecha);
                fecha = conversor2.parse(fecha1);
                DCFecha.setDate(fecha);
            }
            vaciarcampos();
            
            }
        } catch (MiExcepcion mi) {
            JOptionPane.showMessageDialog(this, mi.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void BtnCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCuentasActionPerformed
        Cuentas cuentas = new Cuentas();
        cuentas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnCuentasActionPerformed

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
            java.util.logging.Logger.getLogger(Contabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contabilidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCuentas;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnNuevo;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JComboBox<String> CBCuentas;
    private com.toedter.calendar.JDateChooser DCFecha;
    private javax.swing.JLabel LblNombreCuenta;
    private javax.swing.JTable TConta;
    private javax.swing.JTextField TxtBuscar;
    private javax.swing.JTextField TxtDebe;
    private javax.swing.JTextField TxtDescripcion;
    private javax.swing.JTextField TxtHaber;
    private javax.swing.JTextField TxtNumPoliza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
