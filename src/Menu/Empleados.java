package Menu;

import MisExcepciones.MiExcepcion;
import clases.Empleado;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Empleados extends javax.swing.JFrame {
    Empleado empleado;
    public Empleados() {
        initComponents();
        this.setLocationRelativeTo(null);
        TxtID.setEnabled(false);
        JCBaja.setEnabled(false);
        JCBaja.setDate(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtRFC = new javax.swing.JTextField();
        Empleados = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtCorreo = new javax.swing.JTextField();
        BtnRegistrar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        BtnRegresar = new javax.swing.JButton();
        TxtBuscar = new javax.swing.JTextField();
        CURP = new javax.swing.JLabel();
        TxtCURP = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxtID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtNumeroSocial = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        JCBaja = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TxtSalarioDiario = new javax.swing.JTextField();
        TxtSalarioDiarioI = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        CBBaja = new javax.swing.JCheckBox();
        JCAlta = new com.toedter.calendar.JDateChooser();
        BtnBaja = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        TxtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 230, -1));

        jLabel2.setText("RFC");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 111, -1, -1));

        TxtRFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtRFCKeyTyped(evt);
            }
        });
        jPanel1.add(TxtRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 230, -1));

        Empleados.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        Empleados.setText("Empleados");
        jPanel1.add(Empleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 11, -1, -1));

        jLabel4.setText("Correo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 172, -1, -1));
        jPanel1.add(TxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 230, -1));

        BtnRegistrar.setText("Registrar");
        BtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 349, -1, -1));

        BtnModificar.setText("Modificar");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 349, -1, -1));

        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 390, -1, -1));

        BtnRegresar.setText("Regresar");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 390, -1, -1));

        TxtBuscar.setToolTipText("Busque por RFC");
        TxtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtBuscarKeyTyped(evt);
            }
        });
        jPanel1.add(TxtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 391, 172, -1));

        CURP.setText("CURP");
        jPanel1.add(CURP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 141, -1, -1));

        TxtCURP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCURPKeyTyped(evt);
            }
        });
        jPanel1.add(TxtCURP, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 230, -1));

        jLabel6.setText("ID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 49, -1, -1));
        jPanel1.add(TxtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 33, -1));

        jLabel3.setText("Numero de Seguro Social");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 203, -1, -1));

        TxtNumeroSocial.setText("12345678910");
        TxtNumeroSocial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtNumeroSocialFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtNumeroSocialFocusLost(evt);
            }
        });
        TxtNumeroSocial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNumeroSocialKeyTyped(evt);
            }
        });
        jPanel1.add(TxtNumeroSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 185, -1));

        jLabel7.setText("Fecha de Alta");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 237, -1, -1));

        JCBaja.setDateFormatString("yyyy/MM/dd");
        jPanel1.add(JCBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 179, -1));

        jLabel8.setText("Fecha de Baja");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 268, -1, -1));

        jLabel9.setText("Salario Diario");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 296, -1, -1));

        TxtSalarioDiario.setText("0.00");
        TxtSalarioDiario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtSalarioDiarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtSalarioDiarioFocusLost(evt);
            }
        });
        TxtSalarioDiario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtSalarioDiarioKeyTyped(evt);
            }
        });
        jPanel1.add(TxtSalarioDiario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 179, -1));

        TxtSalarioDiarioI.setText("0.00");
        TxtSalarioDiarioI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtSalarioDiarioIFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtSalarioDiarioIFocusLost(evt);
            }
        });
        TxtSalarioDiarioI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtSalarioDiarioIKeyTyped(evt);
            }
        });
        jPanel1.add(TxtSalarioDiarioI, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 179, -1));

        jLabel10.setText("Salario Diario Integrado");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 326, -1, -1));

        CBBaja.setText("Baja");
        CBBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBBajaActionPerformed(evt);
            }
        });
        jPanel1.add(CBBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 349, -1, -1));

        JCAlta.setDateFormatString("yyyy/MM/dd");
        jPanel1.add(JCAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 179, -1));

        BtnBaja.setText("Registrar Baja");
        BtnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBajaActionPerformed(evt);
            }
        });
        jPanel1.add(BtnBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 349, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/descarga.jpg"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 280, 290));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void vaciarCampos(){
        TxtID.setText("");
        TxtNombre.setText("");
        TxtRFC.setText("");
        TxtCURP.setText("");
        TxtBuscar.setText("");
        TxtCorreo.setText("");
        TxtNumeroSocial.setText("");
        TxtSalarioDiario.setText("");
        TxtSalarioDiarioI.setText("");
        JCAlta.setDate(null);
        JCBaja.setDate(null);
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
            }if(TxtCURP.getText().isEmpty()){
                exito = false;
                throw new MiExcepcion(37);
            }if(TxtCURP.getText().length() < 18){
                exito = false;
                throw new MiExcepcion(44);
            }
            if(TxtCorreo.getText().isEmpty()){
                exito = false;
                throw new MiExcepcion(31);
            }if(TxtNumeroSocial.getText().isEmpty()){
                exito = false;
                throw new MiExcepcion(38);
            }if(TxtNumeroSocial.getText().length() < 11){
                exito = false;
                throw new MiExcepcion(38);
            }
            if(JCAlta.getDate() == null){
                exito = false;
                throw new MiExcepcion(15);
            }if(TxtSalarioDiario.getText().isEmpty()){
                exito = false;
                throw new MiExcepcion(39);
            }if(TxtSalarioDiarioI.getText().isEmpty()){
                exito = false;
                throw new MiExcepcion(40);
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
                empleado = new Empleado(0, Long.valueOf(TxtNumeroSocial.getText()), TxtCURP.getText(), ((JTextField)JCAlta.getDateEditor().getUiComponent()).getText(), ((JTextField)JCBaja.getDateEditor().getUiComponent()).getText(), Float.valueOf(TxtSalarioDiario.getText()), Float.valueOf(TxtSalarioDiarioI.getText()), TxtNombre.getText(), TxtRFC.getText(), TxtCorreo.getText(), "2", "");
                if(empleado.registrar() == false){
                    throw new MiExcepcion(41);
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
        if(CBBaja.isSelected()){
            JOptionPane.showMessageDialog(this, "Esta dando de baja");
        }else{
            try{
            if(llenadovacio() == false){

            }else{
                empleado = new Empleado(0, Long.valueOf(TxtNumeroSocial.getText()), TxtCURP.getText(), ((JTextField)JCAlta.getDateEditor().getUiComponent()).getText(), ((JTextField)JCBaja.getDateEditor().getUiComponent()).getText(), Float.valueOf(TxtSalarioDiario.getText()), Float.valueOf(TxtSalarioDiarioI.getText()), TxtNombre.getText(), TxtRFC.getText(), TxtCorreo.getText(), "2", "");
                if(empleado.modificar() == false){
                    throw new MiExcepcion(21);
                }
                JOptionPane.showMessageDialog(this, "Modificacion  exitosa");
                vaciarCampos();
            }
            }catch (MiExcepcion me){
                JOptionPane.showMessageDialog(this, me.getMessage());
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        try{
            if(TxtBuscar.getText().isEmpty()){
                throw new MiExcepcion(42);
            }else{
                empleado = new Empleado(0, Long.valueOf(TxtNumeroSocial.getText()), TxtCURP.getText(), ((JTextField)JCAlta.getDateEditor().getUiComponent()).getText(), ((JTextField)JCBaja.getDateEditor().getUiComponent()).getText(), Float.valueOf(TxtSalarioDiario.getText()), Float.valueOf(TxtSalarioDiarioI.getText()), TxtNombre.getText(), TxtBuscar.getText(), TxtCorreo.getText(), "2", "");
                if(empleado.buscar()== false){
                    throw new MiExcepcion(43);
                }
                TxtID.setText(String.valueOf(empleado.getNum_empleadob()));
                TxtNombre.setText(empleado.getNombreb());
                TxtRFC.setText(empleado.getRFCb());
                TxtCURP.setText(empleado.getCURPb());
                TxtCorreo.setText(empleado.getCorreob());
                TxtNumeroSocial.setText(String.valueOf(empleado.getNum_segurosocialb()));
                
                SimpleDateFormat Conversor1 = new SimpleDateFormat("yyyy-MM-dd");
                Date fechaconversor = Conversor1.parse(empleado.getFechaaltab());
                SimpleDateFormat Conversor2 = new SimpleDateFormat("yyyy/MM/dd");
                String fecha = Conversor2.format(fechaconversor);
                Date fechaIngreso = Conversor2.parse(fecha);
                JCAlta.setDate(fechaIngreso);
                TxtSalarioDiario.setText(String.valueOf(empleado.getSDb()));
                TxtSalarioDiarioI.setText(String.valueOf(empleado.getSDIb()));
                
                if(empleado.getFechabajab() == null){
                   
                }else{
                    Date fechaconversor1 = Conversor1.parse(empleado.getFechabajab());
                    String fecha1 = Conversor1.format(fechaconversor1);
                    Date fechaBaja = Conversor2.parse(fecha1);
                    JCBaja.setDate(fechaBaja);
                    
                }
                
                
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

    private void TxtNumeroSocialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumeroSocialKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLetter(c)||TxtNumeroSocial.getText().length() == 11){
            evt.consume();
        }
    }//GEN-LAST:event_TxtNumeroSocialKeyTyped

    private void TxtCURPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCURPKeyTyped
        if(TxtCURP.getText().length() == 18){
            evt.consume();
        }
    }//GEN-LAST:event_TxtCURPKeyTyped

    public void activar(int num){
        switch(num){
            case 1:
                TxtNombre.setEnabled(false);
                TxtRFC.setEnabled(false);
                TxtCURP.setEnabled(false);
                TxtCorreo.setEnabled(false);
                TxtNumeroSocial.setEnabled(false);
                JCAlta.setEnabled(false);
                JCBaja.setEnabled(true);
                TxtSalarioDiario.setEnabled(false);
                TxtSalarioDiarioI.setEnabled(false);
                break;
            case 2:
                TxtNombre.setEnabled(true);
                TxtRFC.setEnabled(true);
                TxtCURP.setEnabled(true);
                TxtCorreo.setEnabled(true);
                TxtNumeroSocial.setEnabled(true);
                JCAlta.setEnabled(true);
                JCBaja.setEnabled(false);
                TxtSalarioDiario.setEnabled(true);
                TxtSalarioDiarioI.setEnabled(true);
                vaciarCampos();
                break;
        }
    }
    
    private void CBBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBBajaActionPerformed
        if(CBBaja.isSelected()){
            activar(1);
        }else{
            activar(2);
        }
    }//GEN-LAST:event_CBBajaActionPerformed

    private void TxtNumeroSocialFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtNumeroSocialFocusGained
        if("12345678910".equals(TxtNumeroSocial.getText())){
            TxtNumeroSocial.setText("");
        }
    }//GEN-LAST:event_TxtNumeroSocialFocusGained

    private void TxtNumeroSocialFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtNumeroSocialFocusLost
        if(TxtNumeroSocial.getText().trim().isEmpty()){
            TxtNumeroSocial.setText("12345678910");
        }
    }//GEN-LAST:event_TxtNumeroSocialFocusLost

    private void TxtSalarioDiarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtSalarioDiarioFocusGained
        if("0.00".equals(TxtSalarioDiario.getText())){
            TxtSalarioDiario.setText("");
        }
    }//GEN-LAST:event_TxtSalarioDiarioFocusGained

    private void TxtSalarioDiarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtSalarioDiarioFocusLost
        if(TxtSalarioDiario.getText().trim().isEmpty()){
            TxtSalarioDiario.setText("0.00");
        }
    }//GEN-LAST:event_TxtSalarioDiarioFocusLost

    private void TxtSalarioDiarioIFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtSalarioDiarioIFocusGained
        if("0.00".equals(TxtSalarioDiarioI.getText())){
            TxtSalarioDiarioI.setText("");
        }
    }//GEN-LAST:event_TxtSalarioDiarioIFocusGained

    private void TxtSalarioDiarioIFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtSalarioDiarioIFocusLost
        if(TxtSalarioDiarioI.getText().trim().isEmpty()){
            TxtSalarioDiarioI.setText("0.00");
        }
    }//GEN-LAST:event_TxtSalarioDiarioIFocusLost

    private void TxtSalarioDiarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtSalarioDiarioKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            evt.consume();
        }
    }//GEN-LAST:event_TxtSalarioDiarioKeyTyped

    private void TxtSalarioDiarioIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtSalarioDiarioIKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            evt.consume();
        }
    }//GEN-LAST:event_TxtSalarioDiarioIKeyTyped

    private void BtnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBajaActionPerformed
        try{
            if(llenadovacio() == false){

            }else{
                empleado = new Empleado(0, Long.valueOf(TxtNumeroSocial.getText()), TxtCURP.getText(), ((JTextField)JCAlta.getDateEditor().getUiComponent()).getText(), ((JTextField)JCBaja.getDateEditor().getUiComponent()).getText(), Float.valueOf(TxtSalarioDiario.getText()), Float.valueOf(TxtSalarioDiarioI.getText()), TxtNombre.getText(), TxtRFC.getText(), TxtCorreo.getText(), "2", "");
                if(empleado.modificar() == false){
                    throw new MiExcepcion(22);
                }
                JOptionPane.showMessageDialog(this, "Baja exitosa");
                vaciarCampos();
            }
        }catch (MiExcepcion me){
            JOptionPane.showMessageDialog(this, me.getMessage());
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_BtnBajaActionPerformed

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
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBaja;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnRegistrar;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JCheckBox CBBaja;
    private javax.swing.JLabel CURP;
    private javax.swing.JLabel Empleados;
    private com.toedter.calendar.JDateChooser JCAlta;
    private com.toedter.calendar.JDateChooser JCBaja;
    private javax.swing.JTextField TxtBuscar;
    private javax.swing.JTextField TxtCURP;
    private javax.swing.JTextField TxtCorreo;
    private javax.swing.JTextField TxtID;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtNumeroSocial;
    private javax.swing.JTextField TxtRFC;
    private javax.swing.JTextField TxtSalarioDiario;
    private javax.swing.JTextField TxtSalarioDiarioI;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
