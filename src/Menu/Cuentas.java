package Menu;
import MisExcepciones.MiExcepcion;
import clases.Cuenta;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Cuentas extends javax.swing.JFrame {
    Cuenta cuentas;
    
    public Cuentas() {
        initComponents();
        this.setLocationRelativeTo(null);
        llenartabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TCuentas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtCuenta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtNombreCuenta = new javax.swing.JTextField();
        BtnGuardar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnRegresar = new javax.swing.JButton();
        TxtBuscar = new javax.swing.JTextField();
        BtnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TCuentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cuenta", "Nombre"
            }
        ));
        TCuentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TCuentasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TCuentas);

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel1.setText("CONTROL DE CUENTAS");

        jLabel2.setText("Cuenta");

        TxtCuenta.setText("00000000");
        TxtCuenta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtCuentaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtCuentaFocusLost(evt);
            }
        });
        TxtCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCuentaKeyTyped(evt);
            }
        });

        jLabel3.setText("Nombre de Cuenta");

        BtnGuardar.setText("GUARDAR");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        BtnModificar.setText("MODIFICAR");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        BtnRegresar.setText("REGRESAR");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });

        BtnBuscar.setText("BUSCAR");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(BtnBuscar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TxtCuenta)
                                    .addComponent(TxtNombreCuenta)
                                    .addComponent(TxtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnRegresar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(BtnGuardar)
                                        .addGap(18, 18, 18)
                                        .addComponent(BtnModificar)
                                        .addGap(51, 51, 51)))))))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TxtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TxtNombreCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnGuardar)
                            .addComponent(BtnModificar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnBuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnRegresar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(17, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cuentas(){
        cuentas = new Cuenta(Integer.valueOf(TxtCuenta.getText()), TxtNombreCuenta.getText());
    }
    
    public void cuentas1(){
        cuentas = new Cuenta(Integer.valueOf(TxtBuscar.getText()), TxtNombreCuenta.getText());
    }
    
    public boolean camposvacios(){
        boolean exito = true;
        try {
            if(TxtCuenta.getText().isEmpty()){
                exito = false;
                throw new MiExcepcion(63);
            }if(TxtCuenta.getText().length() < 8||"0000000".equals(TxtCuenta.getText())){
                exito = false;
                throw new MiExcepcion(65);
            }if(TxtNombreCuenta.getText().isEmpty()){
                exito = false;
                throw new MiExcepcion(64);
            }
        }catch (MiExcepcion mi) {
            JOptionPane.showMessageDialog(this, mi.getMessage());
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        return exito;
    }
    
    public void limpiarCampos(){
        TxtCuenta.setText("");
        TxtNombreCuenta.setText("");
        TxtBuscar.setText("");
    }
    
    public void llenartabla(){
        cuentas();
        ArrayList<Cuenta> cuenta;
        DefaultTableModel modelo = (DefaultTableModel) TCuentas.getModel();
        Object[] datosllenado = new Object[2];
        cuenta  = cuentas.GuardarCuentas();
        modelo.setNumRows(0);
        
        for(Cuenta cun: cuenta){
            datosllenado[0] = cun.getNumcuenta();
            datosllenado[1] = cun.getNombrecuenta();
            modelo.addRow(datosllenado);
        }
    }
    
    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        try {
            if(camposvacios() == false){

            }else{
                cuentas();
                if(cuentas.modificar() == false){
                    throw new MiExcepcion(34);
                }else{
                    JOptionPane.showMessageDialog(this, "Modificacion exitosa");
                    llenartabla();
                }
            }
        }catch (MiExcepcion mi) {
            JOptionPane.showMessageDialog(this, mi.getMessage());
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        Contabilidad conta = new Contabilidad();
        conta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        try {
            if(camposvacios() == false){

            }else{
                cuentas();
                if(cuentas.agregar()== false){
                    throw new MiExcepcion(34);
                }else{
                    JOptionPane.showMessageDialog(this, "Registro exitoso");
                    llenartabla();
                }
            }
        }catch (MiExcepcion mi) {
            JOptionPane.showMessageDialog(this, mi.getMessage());
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void TxtCuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCuentaKeyTyped
        char c = evt.getKeyChar();
        if(TxtCuenta.getText().length() == 8 || Character.isLetter(c)){
            evt.consume();
        }
    }//GEN-LAST:event_TxtCuentaKeyTyped

    private void TxtCuentaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtCuentaFocusGained
        if("00000000".equals(TxtCuenta.getText())){
            TxtCuenta.setText("");
        }
    }//GEN-LAST:event_TxtCuentaFocusGained

    private void TxtCuentaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtCuentaFocusLost
        if(TxtCuenta.getText().trim().isEmpty()){
            TxtCuenta.setText("00000000");
        }
    }//GEN-LAST:event_TxtCuentaFocusLost

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        try {
            cuentas1();
            ArrayList<Cuenta> cuenta;
            cuenta  = cuentas.GuardarCuentas();

            for(Cuenta cun: cuenta){
                if(cun.getNumcuenta() == Integer.valueOf(TxtBuscar.getText())){
                    TxtCuenta.setText(String.valueOf(cun.getNumcuenta()));
                    TxtNombreCuenta.setText(cun.getNombrecuenta());
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Formato incorrecto");
        }
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void TCuentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TCuentasMouseClicked
        int filaseleccionada = TCuentas.getSelectedRow();
        TxtCuenta.setText(TCuentas.getValueAt(filaseleccionada, 0).toString());
        TxtNombreCuenta.setText(TCuentas.getValueAt(filaseleccionada, 1).toString());
    }//GEN-LAST:event_TCuentasMouseClicked

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
            java.util.logging.Logger.getLogger(Cuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cuentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JTable TCuentas;
    private javax.swing.JTextField TxtBuscar;
    private javax.swing.JTextField TxtCuenta;
    private javax.swing.JTextField TxtNombreCuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
