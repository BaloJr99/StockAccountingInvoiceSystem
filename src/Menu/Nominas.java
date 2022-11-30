package Menu;

import MisExcepciones.MiExcepcion;
import clases.Nomina;
import clases.Persona;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Nominas extends javax.swing.JFrame {
   Nomina nomina;
   Persona persona;
   String[] RFC;
   String descripcion = "", gravado = "", exento = "";
    
   public void vaciarcampos(){
       TxtNombre.setText("");
       TxtEstado.setText("");
       TxtNumEmpleado.setText("0");
       TxtSeguro.setText("0");
       TxtCURP.setText(" ");
       TxtSalarioDI.setText("0.00");
       TxtSalarioDiario.setText("0.00");
       DCInicial.setDate(null);
       DCFinal.setDate(null);
       CBTipo.setSelectedIndex(0);
       TxtDescripcion.setText(" ");
       TxtExento.setText("0.00");
       TxtGravado.setText("0.00");
       TxtTotal.setText("0.00");
    }
   
   public boolean camposvacios(){
       boolean exito = true;
       try {
            if(DCInicial.getDate() == null){
                exito = false;
                throw new MiExcepcion(57);
            }if(DCFinal.getDate() == null){
                exito = false;
                throw new MiExcepcion(58);
            }if(CBTipo.getSelectedIndex() == 0){
                exito = false;
                throw new MiExcepcion(59);
            }if(TxtDescripcion.getText().isEmpty()){
                exito = false;
                throw new MiExcepcion(47);
            }if(TxtExento.getText().isEmpty()){
                exito = false;
                throw new MiExcepcion(60);
            }if(TxtGravado.getText().isEmpty()){
                exito = false;
                throw new MiExcepcion(61);
            }
       } catch (Exception e) {
           JOptionPane.showMessageDialog(this, e.getMessage());
       }
       return exito;
   }
   
   public Nominas() {
        initComponents();
        this.setLocationRelativeTo(null);
        TxtFolio.setEnabled(false);
        TxtNumEmpleado.setEnabled(false);
        TxtSeguro.setEnabled(false);
        TxtCURP.setEnabled(false);
        TxtNombre.setEnabled(false);
        TxtSalarioDI.setEnabled(false);
        TxtSalarioDiario.setEnabled(false);
        TxtTotal.setEnabled(false);
        TxtEstado.setEnabled(false);
        DefaultComboBoxModel combo = new DefaultComboBoxModel();
        combo.addElement("Seleccione...");
        nomina();
        RFC = nomina.captarRFC();
        CBRFC.setModel(combo);
        for (String RFC1 : RFC) {
            CBRFC.addItem(RFC1);
        }
        TxtFolio.setText(String.valueOf(nomina.ultimofolio() + 1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CBRFC = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        TxtFolio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtDescripcion = new javax.swing.JTextArea();
        BtnCalcular = new javax.swing.JButton();
        BtnAgregar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnRegresar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TDatos = new javax.swing.JTable();
        BtnGenerar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        TxtNombre = new javax.swing.JTextField();
        BtnBuscar = new javax.swing.JButton();
        TxtBuscar = new javax.swing.JTextField();
        TxtEstado = new javax.swing.JTextField();
        CBTipo = new javax.swing.JComboBox<>();
        DCFinal = new com.toedter.calendar.JDateChooser();
        DCInicial = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TxtNumEmpleado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtSeguro = new javax.swing.JTextField();
        TxtCURP = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtSalarioDiario = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TxtSalarioDI = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TxtGravado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TxtExento = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        TxtTotal = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel1.setText("NOMINA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 11, -1, -1));

        CBRFC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...." }));
        CBRFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBRFCActionPerformed(evt);
            }
        });
        jPanel1.add(CBRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 112, 224, -1));

        jLabel2.setText("Folio");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 46, -1, -1));

        TxtFolio.setText("0");
        jPanel1.add(TxtFolio, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 43, 31, -1));

        jLabel3.setText("Descripción");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 259, -1, -1));

        TxtDescripcion.setColumns(20);
        TxtDescripcion.setRows(5);
        jScrollPane1.setViewportView(TxtDescripcion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 259, 328, -1));

        BtnCalcular.setText("Calcular");
        BtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(BtnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 432, -1, -1));

        BtnAgregar.setText("Agregar");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 398, 90, -1));

        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 398, -1, -1));

        BtnModificar.setText("Modificar");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 398, -1, -1));

        BtnRegresar.setText("Regresar");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 466, -1, -1));

        TDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Descripcion", "Gravado", "Exento", "Total"
            }
        ));
        TDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TDatosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TDatos);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 11, 636, 516));

        BtnGenerar.setText("Generar");
        BtnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGenerarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 432, -1, -1));

        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 432, -1, -1));
        jPanel1.add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 112, 185, -1));

        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 466, -1, -1));

        TxtBuscar.setToolTipText("Ingrese folio");
        jPanel1.add(TxtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 467, 103, -1));
        jPanel1.add(TxtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 43, 92, -1));

        CBTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Percepcion", "Deduccion", "Otros" }));
        jPanel1.add(CBTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 228, 412, -1));

        DCFinal.setDateFormatString("yyyy/MM/dd");
        jPanel1.add(DCFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 197, 117, -1));

        DCInicial.setDateFormatString("yyyy/MM/dd");
        jPanel1.add(DCInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 197, 127, -1));

        jLabel7.setText("Fecha Inicial");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 203, -1, -1));

        jLabel8.setText("FechaFinal");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 203, -1, -1));

        jLabel9.setText("# Empleado");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 77, -1, -1));

        TxtNumEmpleado.setText("0");
        jPanel1.add(TxtNumEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 74, 44, -1));

        jLabel4.setText("#Seguro");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 77, -1, -1));

        TxtSeguro.setText("0");
        jPanel1.add(TxtSeguro, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 74, 145, -1));
        jPanel1.add(TxtCURP, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 137, 345, -1));

        jLabel5.setText("CURP");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 140, -1, -1));

        jLabel6.setText("Salario Diario");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 171, -1, -1));

        TxtSalarioDiario.setText("0.00");
        jPanel1.add(TxtSalarioDiario, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 168, 144, -1));

        jLabel10.setText("Salario DI");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 171, -1, -1));

        TxtSalarioDI.setText("0.00");
        jPanel1.add(TxtSalarioDI, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 168, 137, -1));

        jLabel11.setText("Gravado");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 363, -1, -1));

        TxtGravado.setText("0.00");
        jPanel1.add(TxtGravado, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 360, 131, -1));

        jLabel12.setText("Exento");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 363, -1, -1));

        TxtExento.setText("0.00");
        jPanel1.add(TxtExento, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 360, 127, -1));

        jLabel13.setText("Total:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 402, -1, -1));

        TxtTotal.setText("0.00");
        jPanel1.add(TxtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 399, 81, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/descarga.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 200, 220));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void nomina(){
        try {
            float calculartotal = 0;
            calculartotal = Float.valueOf(TxtGravado.getText())+Float.valueOf(TxtExento.getText());
            nomina = new Nomina(((JTextField)DCInicial.getDateEditor().getUiComponent()).getText(), ((JTextField)DCFinal.getDateEditor().getUiComponent()).getText(),  CBTipo.getSelectedItem().toString(), TxtDescripcion.getText(),Float.valueOf(TxtGravado.getText()), Float.valueOf(TxtExento.getText()), calculartotal,Integer.valueOf(TxtNumEmpleado.getText()), Long.valueOf(TxtSeguro.getText()), TxtCURP.getText(), "", "", Float.valueOf(TxtSalarioDiario.getText()), Float.valueOf(TxtSalarioDI.getText()), TxtNombre.getText(), CBRFC.getSelectedItem().toString(), "", "", "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    public void nomina2(){
        try {
            float calculartotal = 0;
            calculartotal = Float.valueOf(TxtGravado.getText())+Float.valueOf(TxtExento.getText());
            persona = new Nomina(((JTextField)DCInicial.getDateEditor().getUiComponent()).getText(), ((JTextField)DCFinal.getDateEditor().getUiComponent()).getText(),  CBTipo.getSelectedItem().toString(), TxtDescripcion.getText(),Float.valueOf(TxtGravado.getText()), Float.valueOf(TxtExento.getText()), calculartotal,Integer.valueOf(TxtNumEmpleado.getText()), Long.valueOf(TxtSeguro.getText()), TxtCURP.getText(), "", "", Float.valueOf(TxtSalarioDiario.getText()), Float.valueOf(TxtSalarioDI.getText()), TxtNombre.getText(), CBRFC.getSelectedItem().toString(), "", "", "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    public void llenartabla(){
        String Nombre = "";
        String Vigencia = "";
        if(TxtBuscar.getText().isEmpty()){
            
        }else{
            TxtFolio.setText(String.valueOf(TxtBuscar.getText()));
        }
        nomina();
        ArrayList<Nomina> nominas;
        DefaultTableModel modelo = (DefaultTableModel) TDatos.getModel();
        Object[] datosllenado = new Object[5];
        nominas  = nomina.nominaprincipal();
        modelo.setNumRows(0);
        
        for(Nomina nom: nominas){
            Nombre = nom.getNombre();
            datosllenado[0] = nom.getTipodato();
            datosllenado[1] = nom.getDescripcion();
            datosllenado[2] = nom.getGravado();
            datosllenado[3] = nom.getExcento();
            datosllenado[4] = nom.getTotal();
            Vigencia = nom.getDomicilio();
            modelo.addRow(datosllenado);
        }
        TDatos.setModel(modelo);
        TxtNombre.setText(Nombre);
        TxtEstado.setText(Vigencia);
    }
    
    public void llenartabla2(){
        String Nombre = "", CURP = "", numEmpleado = "", numSeguro = "", Vigencia = "", SD = "", SDI = "";
        SimpleDateFormat convstring =new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat confecha =new SimpleDateFormat("yyyy/MM/dd");
        try {
            if(TxtBuscar.getText().isEmpty()){

            }else{
                TxtFolio.setText(String.valueOf(TxtBuscar.getText()));
            }
            nomina();
            ArrayList<Nomina> nominas;
            DefaultTableModel modelo = (DefaultTableModel) TDatos.getModel();
            Object[] datosllenado = new Object[5];
            nominas  = nomina.nominasecundaria(TxtFolio.getText());
            modelo.setNumRows(0);

            for(Nomina nom: nominas){
                Date convingreso = convstring.parse(nom.getFechainicial());
                String prueba = confecha.format(convingreso);
                Date fechaingreso = confecha.parse(prueba);
                DCInicial.setDate(fechaingreso);
                Date convbaja = convstring.parse(nom.getFechafinal());
                String prueba2 = confecha.format(convbaja);
                Date fechabaja = confecha.parse(prueba2);
                DCFinal.setDate(fechabaja);   
                Nombre = nom.getNombre();
                CURP = nom.getCURP();
                numEmpleado = String.valueOf(nom.getNum_empleado());
                numSeguro = String.valueOf(nom.getNum_segurosocial());
                SD = String.valueOf(nom.getSD());
                SDI = String.valueOf(nom.getSDI());
                datosllenado[0] = nom.getTipodato();
                datosllenado[1] = nom.getDescripcion();
                datosllenado[2] = nom.getGravado();
                datosllenado[3] = nom.getExcento();
                datosllenado[4] = nom.getTotal();
                Vigencia = nom.getDomicilio();
                modelo.addRow(datosllenado);
            }
            
            TDatos.setModel(modelo);
            TxtNombre.setText(Nombre);
            TxtCURP.setText(CURP);
            TxtNumEmpleado.setText(numEmpleado);
            TxtSeguro.setText(numSeguro);
            TxtEstado.setText(Vigencia);
            TxtSalarioDiario.setText(SD);
            TxtSalarioDI.setText(SDI);
        } catch (ParseException pe) {
            JOptionPane.showMessageDialog(this, pe.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    private void CBRFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBRFCActionPerformed
        try {
            CBRFC.getSelectedItem().toString();
            nomina();
            ArrayList<Nomina> nominas;
            nominas = nomina.cargaDatos();
            vaciarcampos();
            for(Nomina nominaelegida: nominas){
                TxtNombre.setText(nominaelegida.getNombre());
                TxtNumEmpleado.setText(String.valueOf(nominaelegida.getNum_empleado()));
                TxtSeguro.setText(String.valueOf(nominaelegida.getNum_segurosocial()));
                TxtCURP.setText(String.valueOf(nominaelegida.getCURP()));
                TxtSalarioDiario.setText(String.valueOf(nominaelegida.getSD()));;
                TxtSalarioDI.setText(String.valueOf(nominaelegida.getSDI()));;
            }
            DCFinal.setEnabled(true);
            DCInicial.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_CBRFCActionPerformed

    private void BtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalcularActionPerformed
        try {
            nomina();
            TxtTotal.setText(String.valueOf(nomina.total(Integer.valueOf(TxtFolio.getText()))));
                    
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
            }
            
            nomina();
            if(camposvacios() == false){
                        
            }else{
                if(nomina.agregar(Integer.valueOf(TxtFolio.getText())) == false){
                    throw new MiExcepcion(34);
                }else{
                    JOptionPane.showMessageDialog(this, "Agregado exitoso");
                    vaciarcampos();
                    llenartabla2();
                }
            }
        }catch(MiExcepcion me){
            JOptionPane.showMessageDialog(this, me.getMessage());   
        }catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(this, "Formato de numero no valido");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        try {
            if("Cancelado".equals(TxtEstado.getText())){
                throw new MiExcepcion(56);
            }else if("Vigente".equals(TxtEstado.getText())){
                throw new MiExcepcion(62);
            }
            nomina();
            if(camposvacios()== false){
            
            }else{
                if(nomina.eliminar(Integer.valueOf(TxtFolio.getText()), descripcion, gravado, exento) == false){
                    throw new MiExcepcion(53);
                }else{
                    JOptionPane.showMessageDialog(this, "Modificacion exitosa");
                    vaciarcampos();
                    llenartabla2();
                }
            }
        }catch(MiExcepcion me){
            JOptionPane.showMessageDialog(this, me.getMessage());   
        }catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(this, "Formato de numero no valido");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        try {
            if("Cancelado".equals(TxtEstado.getText())){
                throw new MiExcepcion(56);
            }else if("Vigente".equals(TxtEstado.getText())){
                throw new MiExcepcion(62);
            }
            nomina();
            if(camposvacios()== false){
            
            }else{
                if(nomina.modificar(Integer.valueOf(TxtFolio.getText()), descripcion, gravado, exento) == false){
                    throw new MiExcepcion(53);
                }else{
                    JOptionPane.showMessageDialog(this, "Modificacion exitosa");
                    vaciarcampos();
                    llenartabla2();
                }
            }
        }catch(MiExcepcion me){
            JOptionPane.showMessageDialog(this, me.getMessage());   
        }catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(this, "Formato de numero no valido");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        Facturas facturas = new Facturas();
        facturas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void TDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TDatosMouseClicked
        int filaseleccionada = TDatos.getSelectedRow();
        CBTipo.setSelectedItem(TDatos.getValueAt(filaseleccionada, 0).toString());
        TxtDescripcion.setText(TDatos.getValueAt(filaseleccionada, 1).toString());
        TxtGravado.setText(TDatos.getValueAt(filaseleccionada, 2).toString());
        TxtExento.setText(TDatos.getValueAt(filaseleccionada, 3).toString());
        this.descripcion = TxtDescripcion.getText();
        this.gravado = TxtGravado.getText();
        this.exento = TxtExento.getText();
    }//GEN-LAST:event_TDatosMouseClicked

    private void BtnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGenerarActionPerformed
        try {
            if("Cancelado".equals(TxtEstado.getText())){
                throw new MiExcepcion(56);
            }else if("Vigente".equals(TxtEstado.getText())){
                throw new MiExcepcion(62);
            }
            nomina2();
            if(persona.generar(Integer.valueOf(TxtFolio.getText()), "facturasclientes") == false){
                throw new MiExcepcion(52);
            }else{
                JOptionPane.showMessageDialog(this, "Se ha generado con exito");
                CBRFC.setSelectedIndex(0);
                vaciarcampos();
                llenartabla();
            }
        }catch(MiExcepcion me){
            JOptionPane.showMessageDialog(this, me.getMessage());   
        }catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(this, "Formato de numero no valido");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_BtnGenerarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
       try {
            if("Cancelado".equals(TxtEstado.getText())){
                throw new MiExcepcion(56);
            }else if("Vigente".equals(TxtEstado.getText())){
                throw new MiExcepcion(62);
            }
            nomina2();
            if(persona.cancelar(Integer.valueOf(TxtFolio.getText()), "facturasclientes") == false){
                throw new MiExcepcion(52);
            }else{
                JOptionPane.showMessageDialog(this, "Se ha cancelado con exito");
                CBRFC.setSelectedIndex(0);
                vaciarcampos();
                llenartabla();
            }
        }catch(MiExcepcion me){
            JOptionPane.showMessageDialog(this, me.getMessage());   
        }catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(this, "Formato de numero no valido");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        try {
            if(TxtBuscar.getText().trim().isEmpty()){
                throw new MiExcepcion(54);
            }
            nomina();
            if(nomina.buscar(Integer.valueOf(TxtBuscar.getText()))== false){
                throw new MiExcepcion(55);
            }else{
                JOptionPane.showMessageDialog(this, "Busqueda exitosa");
                vaciarcampos();
                llenartabla2();
            }
            TxtTotal.setText(String.valueOf(nomina.total(Integer.valueOf(TxtFolio.getText()))));
            DCInicial.setEnabled(false);
            DCFinal.setEnabled(false);
        } catch (MiExcepcion me) {
            JOptionPane.showMessageDialog(this, me.getMessage());
        } catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(this, "Formato de numero no valido");
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_BtnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(Nominas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nominas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nominas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nominas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nominas().setVisible(true);
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
    private javax.swing.JComboBox<String> CBRFC;
    private javax.swing.JComboBox<String> CBTipo;
    private com.toedter.calendar.JDateChooser DCFinal;
    private com.toedter.calendar.JDateChooser DCInicial;
    private javax.swing.JTable TDatos;
    private javax.swing.JTextField TxtBuscar;
    private javax.swing.JTextField TxtCURP;
    private javax.swing.JTextArea TxtDescripcion;
    private javax.swing.JTextField TxtEstado;
    private javax.swing.JTextField TxtExento;
    private javax.swing.JTextField TxtFolio;
    private javax.swing.JTextField TxtGravado;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtNumEmpleado;
    private javax.swing.JTextField TxtSalarioDI;
    private javax.swing.JTextField TxtSalarioDiario;
    private javax.swing.JTextField TxtSeguro;
    private javax.swing.JTextField TxtTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
