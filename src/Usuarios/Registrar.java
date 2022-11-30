package Usuarios;
import MisExcepciones.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Registrar extends javax.swing.JFrame {
   
    public Registrar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BtnRegistrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        BtnCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TxtApellidoP = new javax.swing.JTextField();
        TxtNombre = new javax.swing.JTextField();
        TxtApellidoM = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TxtNombreUser = new javax.swing.JTextField();
        DcFecha = new com.toedter.calendar.JDateChooser();
        TxtContraseña = new javax.swing.JPasswordField();
        TxtVerifContra = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("Confirmacion de contraseña");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 267, -1, -1));

        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 78, -1, -1));

        jLabel3.setText("Apellido Paterno");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 122, -1, -1));

        jLabel4.setText("Apellido Materno");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        BtnRegistrar.setText("REGISTRAR");
        BtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 338, -1, -1));

        jLabel5.setText("Nombre de Usuario");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 196, -1, -1));

        BtnCancelar.setText("CANCELAR");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 338, -1, -1));

        jLabel6.setText("Fecha");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 306, -1, -1));

        jLabel7.setText("Contraseña");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 232, -1, -1));

        TxtApellidoP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtApellidoPKeyTyped(evt);
            }
        });
        jPanel1.add(TxtApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 119, 211, -1));

        TxtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 82, 211, -1));

        TxtApellidoM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtApellidoMKeyTyped(evt);
            }
        });
        jPanel1.add(TxtApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 157, 211, -1));

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel1.setText("REGISTRO DE USUARIO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 39, -1, -1));
        jPanel1.add(TxtNombreUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 193, 211, -1));

        DcFecha.setDateFormatString("yyyy/MM/dd");
        jPanel1.add(DcFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 300, 211, -1));
        jPanel1.add(TxtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 229, 211, -1));
        jPanel1.add(TxtVerifContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 262, 211, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/descarga (1).jpg"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 390));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 391));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        Usuarios usuario = new Usuarios();
        usuario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarActionPerformed
        String contra = "";
        char [] contrasena = TxtContraseña.getPassword();
        for(int i = 0; i < contrasena.length; i++){
            contra += contrasena[i];
        }
        
        String verifcontra = "";
        char [] verifcontrasena = TxtVerifContra.getPassword();
        for(int i = 0; i<verifcontrasena.length;i++ ){
            verifcontra += verifcontrasena[i];
        }
        
        
        try{
            if(TxtNombre.getText().isEmpty()){
                throw new MiExcepcion(1);
            }if(TxtApellidoP.getText().isEmpty()){
                throw new MiExcepcion(2);
            }if(TxtApellidoM.getText().isEmpty()){
                throw new MiExcepcion(3);
            }if(contra.isEmpty()){
                throw new MiExcepcion(4);
            }if(verifcontra.isEmpty()){
                throw new MiExcepcion(5);
            }if(TxtNombreUser.getText().isEmpty()){
                throw new MiExcepcion(6);
            }if(DcFecha.getDate() == null){
                throw new MiExcepcion(7);
            }if(!contra.equals(verifcontra)){
                throw new MiExcepcion(8);
            }
            RegistroUsuarios ru = new RegistroUsuarios(TxtNombre.getText(), TxtApellidoP.getText(), TxtApellidoM.getText(), TxtNombreUser.getText(), contra, ((JTextField)DcFecha.getDateEditor().getUiComponent()).getText());
            if(ru.disponibleusuario() == true){
                throw new MiExcepcion(9);
            }
            ru.registro();
            TxtNombre.setText("");
            TxtApellidoP.setText("");
            TxtApellidoM.setText("");
            TxtNombreUser.setText("");
            TxtContraseña.setText("");
            TxtVerifContra.setText("");
            DcFecha.setDate(null);
            JOptionPane.showMessageDialog(this, "REGISTRO EXITOSO");
            Usuarios user = new Usuarios();
            this.dispose();
            user.setVisible(true);
        }catch(MiExcepcion er){
            JOptionPane.showMessageDialog(this, er.getMessage());
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_BtnRegistrarActionPerformed
    
    private void TxtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNombreKeyTyped
        char c = evt.getKeyChar();
        
        if(Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_TxtNombreKeyTyped

    private void TxtApellidoPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtApellidoPKeyTyped
        char c = evt.getKeyChar();
        
        if(Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_TxtApellidoPKeyTyped

    private void TxtApellidoMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtApellidoMKeyTyped
        char c = evt.getKeyChar();
        
        if(Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_TxtApellidoMKeyTyped

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
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar().setVisible(true);
            }
        });
        
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnRegistrar;
    private com.toedter.calendar.JDateChooser DcFecha;
    private javax.swing.JTextField TxtApellidoM;
    private javax.swing.JTextField TxtApellidoP;
    private javax.swing.JPasswordField TxtContraseña;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtNombreUser;
    private javax.swing.JPasswordField TxtVerifContra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
