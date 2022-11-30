package Menu;

import clases.Factura;
import MisExcepciones.MiExcepcion;
import clases.Persona;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Facturas extends javax.swing.JFrame {
    Factura factura;
    Persona persona;
    String[] RFC;
    String descripcion = "", cantidad = "", importe = "";
    
    public Facturas() {
        initComponents();
        this.setLocationRelativeTo(null);
        TxtFolio.setEnabled(false);
        TxtIva.setEnabled(false);
        TxtNombre.setEnabled(false);   
        TxtTotal.setEnabled(false);
        TxtEstado.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        CBSeleccione = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        CBRFC = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        TxtFolio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtDescripcion = new javax.swing.JTextArea();
        TxtCantidad = new javax.swing.JTextField();
        TxtImporte = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CBIVA = new javax.swing.JComboBox<>();
        TxtIva = new javax.swing.JTextField();
        BtnCalcular = new javax.swing.JButton();
        BtnAgregar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnRegresar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TDatos = new javax.swing.JTable();
        BtnGenerar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        TxtTotal = new javax.swing.JTextField();
        TxtNombre = new javax.swing.JTextField();
        BtnBuscar = new javax.swing.JButton();
        TxtBuscar = new javax.swing.JTextField();
        TxtEstado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CBSeleccione.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione.....", "Cliente", "Honorario", "Empleados" }));
        CBSeleccione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBSeleccioneActionPerformed(evt);
            }
        });
        jPanel1.add(CBSeleccione, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 87, 414, -1));

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel1.setText("FACTURACIÓN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 38, -1, -1));

        CBRFC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...." }));
        CBRFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBRFCActionPerformed(evt);
            }
        });
        jPanel1.add(CBRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 118, 224, -1));

        jLabel2.setText("Folio");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 154, -1, -1));

        TxtFolio.setText("0");
        jPanel1.add(TxtFolio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 151, 31, -1));

        jLabel3.setText("Descripción");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 182, -1, -1));

        TxtDescripcion.setColumns(20);
        TxtDescripcion.setRows(5);
        jScrollPane1.setViewportView(TxtDescripcion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 182, 328, -1));

        TxtCantidad.setText("0");
        TxtCantidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtCantidadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtCantidadFocusLost(evt);
            }
        });
        TxtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCantidadKeyTyped(evt);
            }
        });
        jPanel1.add(TxtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 289, 54, -1));

        TxtImporte.setText("0.00");
        TxtImporte.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtImporteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtImporteFocusLost(evt);
            }
        });
        TxtImporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtImporteKeyTyped(evt);
            }
        });
        jPanel1.add(TxtImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 315, 125, -1));

        jLabel4.setText("Cantidad");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 289, -1, -1));

        jLabel5.setText("Importe");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 315, -1, -1));

        CBIVA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IVA", "8%", "Excento" }));
        CBIVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBIVAActionPerformed(evt);
            }
        });
        jPanel1.add(CBIVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 315, 94, -1));

        TxtIva.setText("0.00");
        jPanel1.add(TxtIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 315, 82, -1));

        BtnCalcular.setText("Calcular");
        BtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(BtnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 379, -1, -1));

        BtnAgregar.setText("Agregar");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 379, 90, -1));

        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 379, -1, -1));

        BtnModificar.setText("Modificar");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 379, -1, -1));

        BtnRegresar.setText("Regresar");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 447, -1, -1));

        TDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cantidad", "Descripcion", "Importe", "Iva"
            }
        ));
        TDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TDatosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TDatos);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 27, 595, 488));

        BtnGenerar.setText("Generar");
        BtnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGenerarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 413, -1, -1));

        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 413, -1, -1));

        jLabel6.setText("Total General");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 341, -1, -1));

        TxtTotal.setText("0.00");
        jPanel1.add(TxtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 341, 295, -1));
        jPanel1.add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 118, 185, -1));

        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, 30));

        TxtBuscar.setToolTipText("Ingrese folio");
        jPanel1.add(TxtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 448, 103, -1));
        jPanel1.add(TxtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 151, 92, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/descarga.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 200, 220));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void vaciarCampos(){
        TxtDescripcion.setText("");
        TxtCantidad.setText("0");
        TxtImporte.setText("0.00");
        TxtIva.setText("0.00");
        TxtTotal.setText("0.00");
        CBIVA.setSelectedIndex(0);
    }
    
    public boolean llenadovacio(){
        boolean exito = true;
        try{
            if(TxtDescripcion.getText().isEmpty()){
                exito = false;
                throw new MiExcepcion(47);
            }else if(TxtCantidad.getText().isEmpty()){
                exito = false;
                throw new MiExcepcion(48);
            }else if(TxtImporte.getText().isEmpty()){
                exito = false;
                throw new MiExcepcion(49);
            }else if(CBIVA.getSelectedIndex() == 0){
                exito = false;
                throw new MiExcepcion(51);
            }
        }catch(MiExcepcion me){
            JOptionPane.showMessageDialog(this, me.getMessage());
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        return exito;
    }
    
    private void CBSeleccioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBSeleccioneActionPerformed
        DefaultComboBoxModel combo = new DefaultComboBoxModel();
        combo.addElement("Seleccione");
        try {
            if(CBSeleccione.getSelectedIndex() == 0){
                TxtNombre.setText("");
                CBRFC.setModel(combo);
                TxtFolio.setText("0");
                DefaultTableModel modelo0 = (DefaultTableModel) TDatos.getModel();
                modelo0.setNumRows(0);
                TDatos.setModel(modelo0);
                vaciarCampos();
                TxtEstado.setText("");
            }
            if(CBSeleccione.getSelectedIndex() == 1){
                factura();
                RFC = factura.captarRFC();
                CBRFC.setModel(combo);
                for (String RFC1 : RFC) {
                    CBRFC.addItem(RFC1);
                }
                vaciarCampos();
                TxtFolio.setText(String.valueOf(factura.ultimofolio("facturasclientes") + 1));
            }if(CBSeleccione.getSelectedIndex() == 2){
                factura();
                RFC = factura.captarRFC();
                CBRFC.setModel(combo);
                for (String RFC1 : RFC) {
                    CBRFC.addItem(RFC1);
                }
                vaciarCampos();
                TxtFolio.setText(String.valueOf(factura.ultimofolio("facturashonorarios") + 1));
            }if(CBSeleccione.getSelectedIndex() == 3){
                Nominas nomina = new Nominas();
                nomina.setVisible(true);
                this.dispose();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_CBSeleccioneActionPerformed

    private void TxtCantidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtCantidadFocusGained
        if(TxtCantidad.getText().trim().isEmpty()||"0".equals(TxtCantidad.getText())){
            TxtCantidad.setText("");
        }
    }//GEN-LAST:event_TxtCantidadFocusGained

    private void TxtCantidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtCantidadFocusLost
        if(TxtCantidad.getText().trim().isEmpty()){
            TxtCantidad.setText("0");
        }
    }//GEN-LAST:event_TxtCantidadFocusLost

    private void TxtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCantidadKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            evt.consume();
        }
    }//GEN-LAST:event_TxtCantidadKeyTyped

    private void TxtImporteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtImporteKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            evt.consume();
        }
    }//GEN-LAST:event_TxtImporteKeyTyped

    private void TxtImporteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtImporteFocusGained
        if(TxtImporte.getText().trim().isEmpty()||"0.00".equals(TxtImporte.getText())){
            TxtImporte.setText("");
        }
    }//GEN-LAST:event_TxtImporteFocusGained

    private void TxtImporteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtImporteFocusLost
        if(TxtImporte.getText().trim().isEmpty()){
            TxtImporte.setText("0.00");
        }
    }//GEN-LAST:event_TxtImporteFocusLost

    private void CBRFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBRFCActionPerformed
        vaciarCampos();
        factura();
        String RFC1 = factura.captarNombre(CBRFC.getSelectedItem().toString());
        TxtNombre.setText(RFC1);
        
    }//GEN-LAST:event_CBRFCActionPerformed

    public void factura(){
        float calculartotal = 0;
        calculartotal = Float.valueOf(TxtImporte.getText())+Float.valueOf(TxtIva.getText());
        factura = new Factura(Integer.valueOf(TxtFolio.getText()), Integer.valueOf(TxtCantidad.getText()), Float.valueOf(TxtImporte.getText()), Float.valueOf(TxtIva.getText()), calculartotal, TxtDescripcion.getText(), TxtNombre.getText(), CBRFC.getSelectedItem().toString(), "", String.valueOf(CBSeleccione.getSelectedIndex()), "");
    }
    
    public void factura2(){
        float calculartotal = 0;
        calculartotal = Float.valueOf(TxtImporte.getText())+Float.valueOf(TxtIva.getText());
        persona = new Factura(Integer.valueOf(TxtFolio.getText()), Integer.valueOf(TxtCantidad.getText()), Float.valueOf(TxtImporte.getText()), Float.valueOf(TxtIva.getText()), calculartotal, TxtDescripcion.getText(), TxtNombre.getText(), CBRFC.getSelectedItem().toString(), "", String.valueOf(CBSeleccione.getSelectedIndex()), "");
    }
    
    public void llenartabla(){
        String Nombre = "";
        String Vigencia = "";
        if(TxtBuscar.getText().isEmpty()){
            
        }else{
            TxtFolio.setText(String.valueOf(TxtBuscar.getText()));
        }
        factura();
        ArrayList<Factura> facturaciones;
        DefaultTableModel modelo = (DefaultTableModel) TDatos.getModel();
        Object[] datosllenado = new Object[4];
        try {
            switch (CBSeleccione.getSelectedIndex()) {
                case 0:
                    
                case 1:
                    facturaciones = factura.factura("facturasclientes");
                    modelo.setNumRows(0);
                    for(Factura datos: facturaciones){
                        Nombre = datos.getNombre();
                        Vigencia = datos.getDomicilio();
                        datosllenado[0] = datos.getCantidad();
                        datosllenado[1] = datos.getDescripcion();
                        datosllenado[2] = datos.getImporte();
                        datosllenado[3] = datos.getIva();
                        modelo.addRow(datosllenado);
                    }
                    TDatos.setModel(modelo);
                    
                    break;
                case 2:
                    facturaciones = factura.factura("facturashonorarios");
                    for(Factura datos: facturaciones){
                        Nombre = datos.getNombre();
                        Vigencia = datos.getDomicilio();
                        datosllenado[0] = datos.getCantidad();
                        datosllenado[1] = datos.getDescripcion();
                        datosllenado[2] = datos.getImporte();
                        datosllenado[3] = datos.getIva();
                        modelo.addRow(datosllenado);
                    }
                    TDatos.setModel(modelo);
                    break;
                default:
                    break;
            }
            TxtNombre.setText(Nombre);
            TxtEstado.setText(Vigencia);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    private void BtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalcularActionPerformed
        try {
            switch (CBSeleccione.getSelectedIndex()) {
                case 0:
                    throw new MiExcepcion(46);
                case 1:
                    factura();
                    TxtTotal.setText(String.valueOf(factura.total("facturasclientes", Integer.valueOf(TxtFolio.getText()))));
                    break;
                case 2:
                    factura();
                    TxtTotal.setText(String.valueOf(factura.total("facturashonorarios", Integer.valueOf(TxtFolio.getText()))));
                    break;
                default:
                    break;    
            }
        } catch (MiExcepcion me) {
            JOptionPane.showMessageDialog(this, me.getMessage());
        } catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(this, "Formato de numero no valido");
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_BtnCalcularActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        try {
            if("Cancelado".equals(TxtEstado.getText())){
                throw new MiExcepcion(56);
            }else if("Vigente".equals(TxtEstado.getText())){
                throw new MiExcepcion(62);
            }
            
            factura();
            switch (CBSeleccione.getSelectedIndex()) {
                case 0:
                    throw new MiExcepcion(46);
                case 1:
                    if(llenadovacio() == false){
                        
                    }else{
                        if(factura.agregar(Integer.valueOf(TxtFolio.getText()), "facturasclientes") == false){
                            throw new MiExcepcion(34);
                        }else{
                            JOptionPane.showMessageDialog(this, "Agregado exitoso");
                            vaciarCampos();
                            llenartabla();
                        }
                    }
                    break;
                case 2:
                    if(llenadovacio() == false){
                        
                    }else{
                        if(factura.agregar(Integer.valueOf(TxtFolio.getText()), "facturashonorarios") == false){
                            throw new MiExcepcion(34);
                        }else{
                            JOptionPane.showMessageDialog(this, "Agregado exitoso");
                            vaciarCampos();
                            llenartabla();
                        }
                    }
                    break;
                default:
                    break;
            }
        }catch(MiExcepcion me){
            JOptionPane.showMessageDialog(this, me.getMessage());   
        }catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(this, "Formato de numero no valido");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void BtnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGenerarActionPerformed
        try {
            if("Cancelado".equals(TxtEstado.getText())){
                throw new MiExcepcion(56);
            }else if("Vigente".equals(TxtEstado.getText())){
                throw new MiExcepcion(62);
            }
            factura2();
            switch (CBSeleccione.getSelectedIndex()) {
                case 0:
                    throw new MiExcepcion(46);
                case 1:
                    if(persona.generar(Integer.valueOf(TxtFolio.getText()), "facturasclientes") == false){
                        throw new MiExcepcion(52);
                    }else{
                        JOptionPane.showMessageDialog(this, "Se ha generado con exito");
                        CBSeleccione.setSelectedIndex(0);
                        vaciarCampos();
                        llenartabla();
                        TxtFolio.setText("0");
                        TxtNombre.setText("");
                        TxtEstado.setText("");
                    }
                    break;
                case 2:
                    if(persona.generar(Integer.valueOf(TxtFolio.getText()), "facturashonorarios") == false){
                        throw new MiExcepcion(52);
                    }else{
                        JOptionPane.showMessageDialog(this, "Se ha generado con exito");
                        CBSeleccione.setSelectedIndex(0);
                        vaciarCampos();
                        llenartabla();
                        TxtFolio.setText("0");
                        TxtNombre.setText("");
                        TxtEstado.setText("");
                    }
                    break;
                default:
                    break;
            }
        }catch(MiExcepcion me){
            JOptionPane.showMessageDialog(this, me.getMessage());   
        }catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(this, "Formato de numero no valido");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_BtnGenerarActionPerformed

    private void CBIVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBIVAActionPerformed
        try {
            if(CBIVA.getSelectedIndex() == 0){
                TxtIva.setText("0.00");
            }if(CBIVA.getSelectedIndex() == 1){
                TxtIva.setText(String.valueOf(Float.valueOf(TxtCantidad.getText())*Float.valueOf(TxtImporte.getText()) * 0.08f));
            }if(CBIVA.getSelectedIndex() == 2){
                TxtIva.setText("0.00");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_CBIVAActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        try {
            if("Cancelado".equals(TxtEstado.getText())){
                throw new MiExcepcion(56);
            }else if("Vigente".equals(TxtEstado.getText())){
                throw new MiExcepcion(62);
            }
            factura();
            switch (CBSeleccione.getSelectedIndex()) {
                case 0:
                    throw new MiExcepcion(46);
                case 1:
                    if(llenadovacio() == false){
                        
                    }else{
                        if(factura.modificar(Integer.valueOf(TxtFolio.getText()), "facturasclientes", descripcion, cantidad, importe) == false){
                            throw new MiExcepcion(53);
                        }else{
                            JOptionPane.showMessageDialog(this, "Modificacion exitosa");
                            vaciarCampos();
                            llenartabla();
                        }
                    }
                    break;
                case 2:
                    if(llenadovacio() == false){
                        
                    }else{
                        if(factura.modificar(Integer.valueOf(TxtFolio.getText()), "facturashonorarios", descripcion, cantidad, importe) == false){
                            throw new MiExcepcion(53);
                        }else{
                            JOptionPane.showMessageDialog(this, "Modificacion exitosa");
                            vaciarCampos();
                            llenartabla();
                        }
                    }
                    break;
                default:
                    break;
            }
        }catch(MiExcepcion me){
            JOptionPane.showMessageDialog(this, me.getMessage());   
        }catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(this, "Formato de numero no valido");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        try {
            if(TxtBuscar.getText().trim().isEmpty()){
                throw new MiExcepcion(54);
            }
            factura = new Factura(Integer.valueOf(TxtBuscar.getText()), Integer.valueOf(TxtCantidad.getText()), Float.valueOf(TxtImporte.getText()), Float.valueOf(TxtIva.getText()), Float.valueOf(TxtTotal.getText()), TxtDescripcion.getText(), TxtNombre.getText(), CBRFC.getSelectedItem().toString(), "", String.valueOf(CBSeleccione.getSelectedIndex()), "");
            switch (CBSeleccione.getSelectedIndex()) {
                case 0:
                    throw new MiExcepcion(46);
                case 1:
                    if(factura.buscar("facturasclientes")== false){
                        throw new MiExcepcion(55);
                    }else{
                        JOptionPane.showMessageDialog(this, "Busqueda exitosa");
                        llenartabla();
                        vaciarCampos();
                    }
                    TxtTotal.setText(String.valueOf(factura.total("facturasclientes", Integer.valueOf(TxtFolio.getText()))));
                    break;
                case 2:
                    if(factura.buscar("facturashonorarios")== false){
                        throw new MiExcepcion(55);
                    }else{
                        JOptionPane.showMessageDialog(this, "Busqueda exitosa");
                        llenartabla();
                        vaciarCampos();
                    }
                    TxtTotal.setText(String.valueOf(factura.total("facturashonorarios", Integer.valueOf(TxtFolio.getText()))));
                    break;
                default:
                    break;
            }
        } catch (MiExcepcion me) {
            JOptionPane.showMessageDialog(this, me.getMessage());
        } catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(this, "Formato de numero no valido");
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void TDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TDatosMouseClicked
        int filaseleccionada = TDatos.getSelectedRow();
        TxtCantidad.setText(TDatos.getValueAt(filaseleccionada, 0).toString());
        TxtDescripcion.setText(TDatos.getValueAt(filaseleccionada, 1).toString());
        TxtImporte.setText(TDatos.getValueAt(filaseleccionada, 2).toString());
        TxtIva.setText(TDatos.getValueAt(filaseleccionada, 3).toString());
        this.descripcion = TxtDescripcion.getText();
        this.importe = TxtImporte.getText();
        this.cantidad = TxtCantidad.getText();
    }//GEN-LAST:event_TDatosMouseClicked

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        try {
            if("Cancelado".equals(TxtEstado.getText())){
                throw new MiExcepcion(56);
            }else if("Vigente".equals(TxtEstado.getText())){
                throw new MiExcepcion(62);
            }
            factura();
            switch (CBSeleccione.getSelectedIndex()) {
                case 0:
                    throw new MiExcepcion(46);
                case 1:
                    if(llenadovacio() == false){
                        
                    }else{
                        if(factura.eliminar(Integer.valueOf(TxtFolio.getText()), "facturasclientes", descripcion, cantidad, importe) == false){
                            throw new MiExcepcion(53);
                        }else{
                            JOptionPane.showMessageDialog(this, "Eliminado exitoso");
                            vaciarCampos();
                            llenartabla();
                        }
                    }
                    break;
                case 2:
                    if(llenadovacio() == false){
                        
                    }else{
                        if(factura.eliminar(Integer.valueOf(TxtFolio.getText()), "facturashonorarios", descripcion, cantidad, importe) == false){
                            throw new MiExcepcion(53);
                        }else{
                            JOptionPane.showMessageDialog(this, "Eliminado exitoso");
                            vaciarCampos();
                            llenartabla();
                        }
                    }
                    break;
                default:
                    break;
            }
        }catch(MiExcepcion me){
            JOptionPane.showMessageDialog(this, me.getMessage());   
        }catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(this, "Formato de numero no valido");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        try {
            if("Vigente".equals(TxtEstado.getText())){
                throw new MiExcepcion(62);
            }
            factura2();
            switch (CBSeleccione.getSelectedIndex()) {
                case 0:
                    throw new MiExcepcion(46);
                case 1:
                    if(persona.cancelar(Integer.valueOf(TxtFolio.getText()), "facturasclientes") == false){
                        throw new MiExcepcion(52);
                    }else{
                        JOptionPane.showMessageDialog(this, "Se ha cancelado con exito");
                        CBSeleccione.setSelectedIndex(0);
                        vaciarCampos();
                        llenartabla();
                        TxtFolio.setText("0");
                        TxtNombre.setText("");
                        TxtEstado.setText("");
                    }
                    break;
                case 2:
                    if(persona.cancelar(Integer.valueOf(TxtFolio.getText()), "facturashonorarios") == false){
                        throw new MiExcepcion(52);
                    }else{
                        JOptionPane.showMessageDialog(this, "Se ha cancelado con exito");
                        CBSeleccione.setSelectedIndex(0);
                        vaciarCampos();
                        llenartabla();
                        TxtFolio.setText("0");
                        TxtNombre.setText("");
                        TxtEstado.setText("");
                    }
                    break;
                default:
                    break;
            }
        }catch(MiExcepcion me){
            JOptionPane.showMessageDialog(this, me.getMessage());   
        }catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(this, "Formato de numero no valido");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_BtnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Facturas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCalcular;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGenerar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JComboBox<String> CBIVA;
    private javax.swing.JComboBox<String> CBRFC;
    private javax.swing.JComboBox<String> CBSeleccione;
    private javax.swing.JTable TDatos;
    private javax.swing.JTextField TxtBuscar;
    private javax.swing.JTextField TxtCantidad;
    private javax.swing.JTextArea TxtDescripcion;
    private javax.swing.JTextField TxtEstado;
    private javax.swing.JTextField TxtFolio;
    private javax.swing.JTextField TxtImporte;
    private javax.swing.JTextField TxtIva;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtTotal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
