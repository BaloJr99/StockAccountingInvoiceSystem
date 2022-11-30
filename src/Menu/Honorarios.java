package Menu;

import MisExcepciones.MiExcepcion;
import clases.Persona;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Honorarios extends javax.swing.JFrame {
    Persona honorarios;
    
    public Honorarios() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnRegresar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtRFC = new javax.swing.JTextField();
        Clientes = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtDomicilio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtCorreo = new javax.swing.JTextField();
        BtnRegistrar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        TxtBuscar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnRegresar.setText("Regresar");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 58, -1, -1));

        TxtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 55, 230, -1));

        jLabel2.setText("RFC");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 89, -1, -1));

        TxtRFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtRFCKeyTyped(evt);
            }
        });
        jPanel1.add(TxtRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 86, 230, -1));

        Clientes.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        Clientes.setText("Honorarios");
        jPanel1.add(Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 11, -1, -1));

        jLabel3.setText("Domicilio");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 120, -1, -1));
        jPanel1.add(TxtDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 117, 230, -1));

        jLabel4.setText("Correo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 148, -1, -1));
        jPanel1.add(TxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 148, 230, -1));

        BtnRegistrar.setText("Registrar");
        BtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 230, -1, -1));

        BtnModificar.setText("Modificar");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 230, -1, -1));

        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 271, -1, -1));

        TxtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtBuscarKeyTyped(evt);
            }
        });
        jPanel1.add(TxtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 272, 172, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3528c203fea0c31986221c51e598a6d4.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 320));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void vaciarCampos(){
        TxtNombre.setText("");
        TxtRFC.setText("");
        TxtDomicilio.setText("");
        TxtCorreo.setText("");
    }
    
    
    public boolean llenadovacio(){
        boolean exito = true;
        try{
            if(TxtNombre.getText().isEmpty()){
                exito = false;
                throw new MiExcepcion(1);
            }if(TxtRFC.getText().isEmpty()){
                exito = false;
                throw new MiExcepcion(29);
            }if(TxtRFC.getText().length() < 11){
                exito = false;
                throw new MiExcepcion(33);
            }
            if(TxtDomicilio.getText().isEmpty()){
                exito = false;
                throw new MiExcepcion(30);
            }if(TxtCorreo.getText().isEmpty()){
                exito = false;
                throw new MiExcepcion(31);
            }            
        }catch(MiExcepcion me){
            JOptionPane.showMessageDialog(this, me.getMessage());
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        return exito;
    }
    
    private void TxtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNombreKeyTyped
        char c = evt.getKeyChar();
        if(Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_TxtNombreKeyTyped

    private void TxtRFCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtRFCKeyTyped
        if(TxtRFC.getText().length() == 13){
            evt.consume();
        }
    }//GEN-LAST:event_TxtRFCKeyTyped

    private void BtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarActionPerformed

        try{
            if(llenadovacio() == false){

            }else{
                honorarios = new Persona(TxtNombre.getText(), TxtRFC.getText().toUpperCase(), TxtCorreo.getText().toLowerCase(), "2",TxtDomicilio.getText());
                if(honorarios.registrar() == false){
                    throw new MiExcepcion(32);
                }
                JOptionPane.showMessageDialog(this, "Registro exitoso");
                vaciarCampos();
            }
        }catch (MiExcepcion me){
            JOptionPane.showMessageDialog(this, me.getMessage());
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_BtnRegistrarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        try{
            if(llenadovacio() == false){

            }else{
                honorarios = new Persona(TxtNombre.getText(), TxtRFC.getText().toUpperCase(), TxtCorreo.getText().toLowerCase(), "2", TxtDomicilio.getText());
                if(honorarios.buscar() == false){
                    throw new MiExcepcion(34);
                }
                JOptionPane.showMessageDialog(this, "Modificacion  exitosa");
                vaciarCampos();
            }
        }catch (MiExcepcion me){
            JOptionPane.showMessageDialog(this, me.getMessage());
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        try{
            if(TxtBuscar.getText().isEmpty()){
                throw new MiExcepcion(35);
            }else{
                honorarios = new Persona(TxtNombre.getText(), TxtBuscar.getText().toUpperCase(), TxtCorreo.getText().toLowerCase(), "2", TxtDomicilio.getText());
                if(honorarios.buscar() == false){
                    throw new MiExcepcion(36);
                }
                TxtNombre.setText(honorarios.getNombreb());
                TxtRFC.setText(honorarios.getRFCb());
                TxtDomicilio.setText(honorarios.getDomiciliob());
                TxtCorreo.setText(honorarios.getCorreob());
                JOptionPane.showMessageDialog(this, "Busqueda exitosa");
            }
        }catch (MiExcepcion me){
            JOptionPane.showMessageDialog(this, me.getMessage());
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void TxtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtBuscarKeyTyped
        if(TxtBuscar.getText().length() == 13){
            evt.consume();
        }
    }//GEN-LAST:event_TxtBuscarKeyTyped

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Honorarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Honorarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Honorarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Honorarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Honorarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnRegistrar;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JLabel Clientes;
    private javax.swing.JTextField TxtBuscar;
    private javax.swing.JTextField TxtCorreo;
    private javax.swing.JTextField TxtDomicilio;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtRFC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
